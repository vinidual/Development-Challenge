package com.challenge.atech.model;

public class CityModel {
	
	private String country;
	
	private String stateOrProvince;

	private String name;
	
	public CityModel() {
		super();
	}

	public CityModel(String country, String stateOrProvince, String name) {
		super();
		this.country = country;
		this.stateOrProvince = stateOrProvince;
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
