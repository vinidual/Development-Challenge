package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.model.FlightModel;

public interface FlightService { 
	
	FlightModel getFlightById(long id);
	
	List<FlightModel> getAllFlights();
	
	FlightModel saveFlight(FlightModel flight);
	
	FlightModel patchFlight(long id, FlightModel flight);
	
	void delete(long id);
}