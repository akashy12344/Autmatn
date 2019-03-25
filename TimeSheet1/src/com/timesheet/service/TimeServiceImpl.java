package com.timesheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.timesheet.dao.TimeDao;
import com.timesheet.dao.TimeDaoImpl;
import com.timesheet.dto.TimeSheet;

//@Service
public class TimeServiceImpl implements TimeService {

	@Autowired
 TimeDao dao;
	
	@Override
	public void addDetails(TimeSheet time) {
		
	dao.addDetails(time);
	return;

	}


	@Override
	public List<TimeSheet> getTimeDetails(String id) {
		
		return dao.getTimeDetails(id);
	}
	

}
