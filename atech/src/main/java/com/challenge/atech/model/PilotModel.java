package com.challenge.atech.model;

public class PilotModel {

private String name;
	
	private char gender;
	
	private String companyName;
	
	private String flightLicence;
	
	private String passport;
	
	public PilotModel() {
		super();
	}

	public PilotModel(String name, char gender, String companyName, String flightLicence, String passport) {
		super();
		this.name = name;
		this.gender = gender;
		this.companyName = companyName;
		this.flightLicence = flightLicence;
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getFlightLicence() {
		return flightLicence;
	}

	public void setFlightLicence(String flightLicence) {
		this.flightLicence = flightLicence;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}
	
}
