package com.challenge.atech.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.atech.model.PilotModel;
import com.challenge.atech.service.PilotService;

@RestController
public class PilotController {
	
	@Autowired
	private PilotService pilotService;
	
	@CrossOrigin
    @RequestMapping(value = "/PilotModel", method = RequestMethod.GET)
    public List<PilotModel> getPilots() {
		return pilotService.getAllPilots();
	}

	@CrossOrigin
    @RequestMapping(value = "/PilotModel/{id}", method = RequestMethod.GET)
    public PilotModel getPilot(@PathVariable("id") long id) {
		return pilotService.getPilotById(id);
	}
    
	@CrossOrigin
    @RequestMapping(value = "/pilot", method = RequestMethod.POST)
    public ResponseEntity<?> savePilot(@RequestBody PilotModel pilot) {
    	PilotModel pilotSaved = pilotService.savePilot(pilot);
    	if(pilotSaved == null) {
    		return new ResponseEntity<PilotModel>(HttpStatus.UNPROCESSABLE_ENTITY);
    	}
    	return new ResponseEntity<PilotModel>(pilotSaved, HttpStatus.OK);
	}
    
	@CrossOrigin
    @RequestMapping(value = "/pilot/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> patchPilot(@PathVariable("id") long id, @RequestBody PilotModel pilot) {
    	PilotModel pilotSaved = pilotService.patchPilot(id, pilot);
    	if(pilotSaved == null) {
    		return new ResponseEntity<PilotModel>(HttpStatus.UNPROCESSABLE_ENTITY);
    	}
    	return new ResponseEntity<PilotModel>(pilotSaved, HttpStatus.OK);
	}
    
	@CrossOrigin
    @RequestMapping(value = "/pilot/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePilot(@PathVariable("id") long id) {
    	pilotService.delete(id);
    	return new ResponseEntity<PilotModel>(HttpStatus.OK);
	}
    
}