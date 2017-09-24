package com.challenge.atech.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.atech.entity.Pilot;
import com.challenge.atech.service.PilotService;

@RestController
public class PilotController {
	
	@Autowired
	private PilotService pilotService;
	
    @RequestMapping(value = "/Pilot", method = RequestMethod.GET)
    public List<Pilot> getPilots() {
		return pilotService.getAllPilots();
	}

    @RequestMapping(value = "/Pilot/{id}", method = RequestMethod.GET)
    public Pilot getPilot(@PathVariable("id") long id) {
		return pilotService.getPilotById(id);
	}
    
}