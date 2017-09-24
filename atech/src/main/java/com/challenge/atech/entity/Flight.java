
package com.challenge.atech.entity;

import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.challenge.atech.enums.FlightStatus;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private SimpleDateFormat takeoffTime;
	
	@Column(nullable = false)
	private SimpleDateFormat landingTime;
	
	@ManyToOne
	private City originCity;
	
	@ManyToOne
	private City destinyCity;
	
	@ManyToOne
	private Airplane airplane;
	
	@ManyToOne
	private Pilot pilot;
	
	@Column(nullable = false)
	private FlightStatus flightStatus;
	
	public Flight() {
		super();
	}

	public Flight(
		SimpleDateFormat takeoffTime, SimpleDateFormat landingTime, City originCity, City destinyCity, Airplane airplane, Pilot pilot, FlightStatus flightStatus) 
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public City getOriginCity() {
		return originCity;
	}

	public void setOriginCity(City originCity) {
		this.originCity = originCity;
	}

	public City getDestinyCity() {
		return destinyCity;
	}

	public void setDestinyCity(City destinyCity) {
		this.destinyCity = destinyCity;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	
	public FlightStatus getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}

}