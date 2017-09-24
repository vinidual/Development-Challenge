package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.model.AirplaneModel;

public interface AirplaneService { 
	
	AirplaneModel getAirplaneById(long id);
	
	List<AirplaneModel> getAllAirplanes();
	
	AirplaneModel saveAirplane(AirplaneModel airplane);
	
	AirplaneModel patchAirplane(long id, AirplaneModel airplane);
	
	void delete(long id);
	
}
