package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.entity.Airplane;

public interface AirplaneService { 
	
	Airplane getEmployeeById(long id);
	
	List<Airplane> getAllEmployees();
}
