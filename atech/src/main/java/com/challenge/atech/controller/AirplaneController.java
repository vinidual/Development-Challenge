package com.challenge.atech.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.atech.entity.Airplane;
import com.challenge.atech.service.AirplaneService;

@RestController
public class AirplaneController {
	
	@Autowired
	private AirplaneService airplaneService;
	
    @RequestMapping(value = "/Airplane", method = RequestMethod.GET)
    public List<Airplane> getAirplanes() {
		return airplaneService.getAllAirplanes();
	}

    @RequestMapping(value = "/Airplane/{id}", method = RequestMethod.GET)
    public Airplane getAirplane(@PathVariable("id") long id) {
		return airplaneService.getAirplaneById(id);
	}
    
}