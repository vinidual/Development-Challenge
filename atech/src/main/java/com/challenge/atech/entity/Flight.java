
package com.challenge.atech.entity;

import java.util.Date;

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
	private Date takeoffTime;
	
	@Column(nullable = false)
	private Date landingTime;
	
	@ManyToOne
	@Column(nullable = false)
	private City originCity;
	
	@ManyToOne
	@Column(nullable = false)
	private City destinyCity;
	
	@ManyToOne
	@Column(nullable = false)
	private Airplane airplane;
	
	@ManyToOne
	@Column(nullable = false)
	private Pilot pilot;
	
	@Column(nullable = false)
	private FlightStatus flightStatus;
	
	public Flight() {
		super();
	}

	public Flight(
		Date takeoffTime, Date landingTime, City originCity, City destinyCity, Airplane airplane, Pilot pilot, FlightStatus flightStatus) 
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