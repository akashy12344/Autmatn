package com.timesheet.dao;

import java.util.List;

import com.timesheet.dto.TimeSheet;


public interface TimeDao {

	
	
	void addDetails(TimeSheet time);
	

	 public List<TimeSheet> getTimeDetails(String id);
	
}
