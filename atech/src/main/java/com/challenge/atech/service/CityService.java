package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.entity.City;

public interface CityService { 
	
	City getCityById(long id);
	
	List<City> getAllCities();
}
