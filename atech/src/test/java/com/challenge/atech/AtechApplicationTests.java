package com.challenge.atech;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.challenge.atech.entity.Airplane;
import com.challenge.atech.entity.City;
import com.challenge.atech.entity.Flight;
import com.challenge.atech.entity.Pilot;
import com.challenge.atech.repository.AirplaneRepository;
import com.challenge.atech.repository.CityRepository;
import com.challenge.atech.repository.FlightRepository;
import com.challenge.atech.repository.PilotRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtechApplicationTests {
	
	/**
	 * Was accepted to inject the repositories directly and not mock them because we 
	 * are working with the in-memory database H2
	 */
	
	@Autowired
	CityRepository cityRepository;
	
	@Autowired
	PilotRepository pilotRepository;
	
	@Autowired
	AirplaneRepository airplaneRepository;
	
	@Autowired
	FlightRepository flightRepository;
	
	@Test
	public void shouldExistsTwoCitiesRecords() {
		List<City> listCities = cityRepository.findAll();
		assertEquals(listCities.size(), 2);
	}
	
	@Test
	public void shouldExistsOnePilotRecord() {
		List<Pilot> listPilots = pilotRepository.findAll();
		assertEquals(listPilots.size(), 1);
	}
	
	@Test
	public void shouldExistsOneAirplaneRecord() {
		List<Airplane> listAirplanes = airplaneRepository.findAll();
		assertEquals(listAirplanes.size(), 1);
	}
	
	@Test
	public void shouldExistsOneFlightRecord() {
		List<Flight> listFlights = flightRepository.findAll();
		assertEquals(listFlights.size(), 1);
	}

	
	
}
