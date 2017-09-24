
package com.challenge.atech.model;

import java.text.SimpleDateFormat;

import com.challenge.atech.entity.Airplane;
import com.challenge.atech.entity.City;
import com.challenge.atech.entity.Pilot;
import com.challenge.atech.enums.FlightStatus;

public class FlightModel {
	
	private SimpleDateFormat takeoffTime;
	
	private SimpleDateFormat landingTime;
	
	private CityModel originCity;
	
	private CityModel destinyCity;
	
	private AirplaneModel airplane;
	
	private PilotModel pilot;
	
	private FlightStatus flightStatus;
	
	public FlightModel() {
		super();
	}

	public FlightModel(
		SimpleDateFormat takeoffTime, SimpleDateFormat landingTime, CityModel originCity, 
		CityModel destinyCity, AirplaneModel airplane, PilotModel pilot, FlightStatus flightStatus) 
	{
		super();
		this.takeoffTime = takeoffTime;
		this.landingTime = landingTime;
		this.originCity = originCity;
		this.destinyCity = destinyCity;
		this.airplane = airplane;
		this.pilot = pilot;
		this.flightStatus = flightStatus;
	}

	public SimpleDateFormat getTakeoffTime() {
		return takeoffTime;
	}

	public void setTakeoffTime(SimpleDateFormat takeoffTime) {
		this.takeoffTime = takeoffTime;
	}

	public SimpleDateFormat getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(SimpleDateFormat landingTime) {
		this.landingTime = landingTime;
	}

	public CityModel getOriginCity() {
		return originCity;
	}

	public void setOriginCity(CityModel originCity) {
		this.originCity = originCity;
	}

	public CityModel getDestinyCity() {
		return destinyCity;
	}

	public void setDestinyCity(CityModel destinyCity) {
		this.destinyCity = destinyCity;
	}

	public AirplaneModel getAirplane() {
		return airplane;
	}

	public void setAirplane(AirplaneModel airplane) {
		this.airplane = airplane;
	}

	public PilotModel getPilot() {
		return pilot;
	}

	public void setPilot(PilotModel pilot) {
		this.pilot = pilot;
	}

	public FlightStatus getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}


}