package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.entity.City;

public interface CityService { 
	
	City getEmployeeById(long id);
	
	List<City> getAllEmployees();
}
