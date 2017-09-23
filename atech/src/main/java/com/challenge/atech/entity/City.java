package com.challenge.atech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String country;
	
	@Column(nullable = false)
	private String stateOrProvince;
	
	@Column(nullable = false)
	private String name;
	
	public City() {
		super();
	}

	public City(Long id, String country, String stateOrProvince, String name) {
		super();
		this.id = id;
		this.country = country;
		this.stateOrProvince = stateOrProvince;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
