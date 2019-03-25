package com.timesheet.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.timesheet.dto.TimeSheet;
import com.timesheet.service.TimeService;







@Controller
public class TimeController {

	@Autowired
    TimeService service;
	
	@RequestMapping(value="/entertime")
	public String time(Map<String,Object> model,Model modelMy){
		List<String> myQul=new ArrayList<String>();
		myQul.add("SELECT");
		myQul.add("DATA_ENTRY");
		myQul.add("ACCOUNTS_TALLY");
		myQul.add("LEDGER_POSTINGS");
		myQul.add("BALANCE_SHEET");
		myQul.add("RETURNS_FILING");
		modelMy.addAttribute("my",new TimeSheet());
		LocalDate dt=LocalDate.now();
		Date d=Date.valueOf(dt);
		modelMy.addAttribute("d", d);
		model.put("myq",myQul);
		return "TimeSheetEntry";
	}
	
	@RequestMapping(value="/timelist",method=RequestMethod.POST)
	public String timelist(@RequestParam("id") String id,Model modelMy){
		
		List<TimeSheet> list=service.getTimeDetails(id);
	
		System.out.println("list : "+list);
		if(list.isEmpty())
		{
				modelMy.addAttribute("message", "No time Sheet recorded");
				return "TimeSheetList";
		}
		
		else
		{
			modelMy.addAttribute("times", list);
			return "TimeSheetList";
		}	
	}
	

	
	
/*	@RequestMapping(value="/addtime",method=RequestMethod.POST)
	public String addTimeDataBase(@RequestParam("empid") String empid,
			@RequestParam("timesheet") String timesheet,
			@RequestParam("hour1") String hour1,@RequestParam("hour2") String hour2,
			@RequestParam("hour3") String hour3,
			@RequestParam("hour4") String hour4,@RequestParam("hour5") String hour5,
			@RequestParam("hour6") String hour6,
			@RequestParam("hour7") String hour7,@RequestParam("hour8") String hour8,Model mod)
	{
			TimeSheet time=new TimeSheet();
			time.setEmpid(empid);
			LocalDate dt=LocalDate.now();
			Date d=Date.valueOf(dt);
			time.setTimesheet(d);
			time.setHour1(hour1);
			time.setHour2(hour2);
			time.setHour3(hour3);
			time.setHour4(hour4);
			time.setHour5(hour5);
			time.setHour6(hour6);
			time.setHour7(hour7);
			time.setHour8(hour8);
			
		
		//System.out.println("aaksh");
		service.addDetails(time);
		mod.addAttribute("message", "TimeSheet is recorded with id: "+time.getId());
		return "success";
	
}*/
	
	@RequestMapping(value="/addtime",method=RequestMethod.POST)
	public String addTimeDataBase(@ModelAttribute("my") TimeSheet time,Model mod)
	{
		LocalDate dt=LocalDate.now();
		Date d=Date.valueOf(dt);
		time.setTimesheet(d);
		service.addDetails(time);
		mod.addAttribute("message", "TimeSheet is recorded with id: "+time.getId());
		return "success";
	}
}
