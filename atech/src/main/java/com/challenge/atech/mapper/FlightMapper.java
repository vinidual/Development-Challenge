package com.challenge.atech.mapper;

import java.util.ArrayList;
import java.util.List;

import com.challenge.atech.entity.Flight;
import com.challenge.atech.model.FlightModel;

public final class FlightMapper {
	
	public static FlightModel EntityToModel(Flight flight) {
		FlightModel flightModel = new FlightModel(
			flight.getTakeoffTime(), 
			flight.getLandingTime(), 
			CityMapper.EntityToModel(flight.getOriginCity()),
			CityMapper.EntityToModel(flight.getDestinyCity()),
			AirplaneMapper.EntityToModel(flight.getAirplane()),
			PilotMapper.EntityToModel(flight.getPilot()),
			flight.getFlightStatus()
		);
		return flightModel;
	}
	
	public static List<FlightModel> EntityToModel(List<Flight> listCities) {
		List<FlightModel> listCitiesModel = new ArrayList<FlightModel>();
		for(int i = 0; i < listCities.size(); i++) {
			listCitiesModel.add(EntityToModel(listCities.get(i)));
		}
		return listCitiesModel;
	}
	
	public static Flight ModelToEntity(FlightModel flightModel) {
		Flight flight = new Flight();
		flight.setAirplane(AirplaneMapper.ModelToEntity(flightModel.getAirplane()));
		flight.setDestinyCity(CityMapper.ModelToEntity(flightModel.getDestinyCity()));
		flight.setFlightStatus(flightModel.getFlightStatus());
		flight.setLandingTime(flightModel.getLandingTime());
		flight.setOriginCity(CityMapper.ModelToEntity(flightModel.getOriginCity()));
		flight.setPilot(PilotMapper.ModelToEntity(flightModel.getPilot()));
		flight.setTakeoffTime(flightModel.getTakeoffTime());
		return flight;
	}

}
