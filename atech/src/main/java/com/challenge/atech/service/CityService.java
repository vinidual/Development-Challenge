package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.model.CityModel;

public interface CityService { 
	
	CityModel getCityById(long id);
	
	List<CityModel> getAllCities();
	
	CityModel saveCity(CityModel city);
	
	CityModel patchCity(long id, CityModel city);
	
	void delete(long id);
}
