package com.challenge.atech.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.atech.model.FlightModel;
import com.challenge.atech.service.FlightService;

@RestController
@RequestMapping("/api")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
    @RequestMapping(value = "/flight", method = RequestMethod.GET)
    public ResponseEntity<?> getFlights() {
    	List<FlightModel> listFlights = flightService.getAllFlights();
    	if(listFlights.isEmpty()) {
    		return new ResponseEntity<List<FlightModel>>(HttpStatus.NO_CONTENT);
    	}
    	return new ResponseEntity<List<FlightModel>>(listFlights, HttpStatus.OK);
	}

    @RequestMapping(value = "/flight/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getFlight(@PathVariable("id") long id) {
    	FlightModel flight = flightService.getFlightById(id);
    	if(flight == null) {
    		return new ResponseEntity<FlightModel>(HttpStatus.NOT_FOUND);
    	}
    	return new ResponseEntity<FlightModel>(flight, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/flight", method = RequestMethod.POST)
    public ResponseEntity<?> saveFlight(@RequestBody FlightModel flight) {
    	FlightModel flightSaved = flightService.saveFlight(flight);
    	if(flightSaved == null) {
    		return new ResponseEntity<FlightModel>(HttpStatus.UNPROCESSABLE_ENTITY);
    	}
    	return new ResponseEntity<FlightModel>(flightSaved, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/flight/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> patchFlight(@PathVariable("id") long id, @RequestBody FlightModel flight) {
    	FlightModel flightSaved = flightService.patchFlight(id, flight);
    	if(flightSaved == null) {
    		return new ResponseEntity<FlightModel>(HttpStatus.UNPROCESSABLE_ENTITY);
    	}
    	return new ResponseEntity<FlightModel>(flightSaved, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/flight/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteFlight(@PathVariable("id") long id) {
    	flightService.delete(id);
    	return new ResponseEntity<FlightModel>(HttpStatus.OK);
	}
    
}