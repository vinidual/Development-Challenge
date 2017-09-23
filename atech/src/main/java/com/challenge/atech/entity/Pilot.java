package com.challenge.atech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pilot {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private char gender;
	
	@Column(nullable = false)
	private String companyName;
	
	@Column(nullable = false)
	private String flightLicence;
	
	@Column(nullable = false)
	private String passport;
	
	public Pilot() {
		super();
	}

	public Pilot(Long id, String name, char gender, String companyName, String flightLicence, String passport) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.companyName = companyName;
		this.flightLicence = flightLicence;
		this.passport = passport;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
