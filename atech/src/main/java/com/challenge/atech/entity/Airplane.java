package com.challenge.atech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Airplane {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String company;
	
	@Column(nullable = false)
	private String model;
	
	@Column(nullable = false)
	private double cargoCapacity;
	
	@Column(nullable = false)
	private String passengerCapacity;

	public Airplane() {
		super();
	}

	public Airplane(Long id, String company, String model, double cargoCapacity, String passengerCapacity) {
		super();
		this.id = id;
		this.company = company;
		this.model = model;
		this.cargoCapacity = cargoCapacity;
		this.passengerCapacity = passengerCapacity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(String passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	

}
