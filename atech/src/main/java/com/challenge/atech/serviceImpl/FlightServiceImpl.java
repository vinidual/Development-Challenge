package com.challenge.atech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.atech.entity.Flight;
import com.challenge.atech.repository.FlightRepository;
import com.challenge.atech.service.FlightService;

@Service("flightService")
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	FlightRepository flightRepository; 

	@Override
	public Flight getFlightById(long id) {
		return flightRepository.findOne(id);
	}

	@Override
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

}