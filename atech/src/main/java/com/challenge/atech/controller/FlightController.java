package com.challenge.atech.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.atech.entity.Flight;
import com.challenge.atech.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
    @RequestMapping(value = "/Flight", method = RequestMethod.GET)
    public List<Flight> getFlights() {
		return flightService.getAllFlights();
	}

    @RequestMapping(value = "/Flight/{id}", method = RequestMethod.GET)
    public Flight getFlight(@PathVariable("id") long id) {
		return flightService.getFlightById(id);
	}
    
}