package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.entity.Flight;

public interface FlightService { 
	
	Flight getEmployeeById(long id);
	
	List<Flight> getAllEmployees();
}