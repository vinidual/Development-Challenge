package com.challenge.atech.model;

public class AirplaneModel {

	private String company;
	
	private String model;

	private double cargoCapacity;

	private String passengerCapacity;

	public AirplaneModel() {
		super();
	}

	public AirplaneModel(String company, String model, double cargoCapacity, String passengerCapacity) {
		super();
		this.company = company;
		this.model = model;
		this.cargoCapacity = cargoCapacity;
		this.passengerCapacity = passengerCapacity;
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
