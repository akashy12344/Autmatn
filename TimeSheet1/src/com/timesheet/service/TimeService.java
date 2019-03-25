package com.timesheet.service;

import java.util.List;

import com.timesheet.dto.TimeSheet;

public interface TimeService {

	
	void addDetails(TimeSheet time);

	public List<TimeSheet> getTimeDetails(String id);
}
