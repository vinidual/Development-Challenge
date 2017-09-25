
package com.challenge.atech.model;

import java.util.Date;

import com.challenge.atech.enums.FlightStatus;

public class FlightModel {
	
	private long id;

	private Date takeoffTime;
	
	private Date landingTime;
	
	private CityModel originCity;
	
	private CityModel destinyCity;
	
	private AirplaneModel airplane;
	
	private PilotModel pilot;
	
	private FlightStatus flightStatus;
	
	public FlightModel() {
		super();
	}

	public FlightModel(
		long id, Date takeoffTime, Date landingTime, CityModel originCity, 
		CityModel destinyCity, AirplaneModel airplane, PilotModel pilot, FlightStatus flightStatus) 
	{
		super();
		this.id = id;
		this.takeoffTime = takeoffTime;
		this.landingTime = landingTime;
		this.originCity = originCity;
		this.destinyCity = destinyCity;
		this.airplane = airplane;
		this.pilot = pilot;
		this.flightStatus = flightStatus;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getTakeoffTime() {
		return takeoffTime;
	}

	public void setTakeoffTime(Date takeoffTime) {
		this.takeoffTime = takeoffTime;
	}

	public Date getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(Date landingTime) {
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