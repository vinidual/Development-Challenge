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

import com.challenge.atech.model.AirplaneModel;
import com.challenge.atech.service.AirplaneService;

@RestController
public class AirplaneController {
	
	@Autowired
	private AirplaneService airplaneService;
	
	@CrossOrigin
    @RequestMapping(value = "/AirplaneModel", method = RequestMethod.GET)
    public List<AirplaneModel> getAirplanes() {
		return airplaneService.getAllAirplanes();
	}

	@CrossOrigin
    @RequestMapping(value = "/AirplaneModel/{id}", method = RequestMethod.GET)
    public AirplaneModel getAirplane(@PathVariable("id") long id) {
		return airplaneService.getAirplaneById(id);
	}
    
	@CrossOrigin
    @RequestMapping(value = "/airplane", method = RequestMethod.POST)
    public ResponseEntity<?> saveAirplane(@RequestBody AirplaneModel airplane) {
    	AirplaneModel airplaneSaved = airplaneService.saveAirplane(airplane);
    	if(airplaneSaved == null) {
    		return new ResponseEntity<AirplaneModel>(HttpStatus.UNPROCESSABLE_ENTITY);
    	}
    	return new ResponseEntity<AirplaneModel>(airplaneSaved, HttpStatus.OK);
	}
    
	@CrossOrigin
    @RequestMapping(value = "/airplane/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> patchAirplane(@PathVariable("id") long id, @RequestBody AirplaneModel airplane) {
    	AirplaneModel airplaneSaved = airplaneService.patchAirplane(id, airplane);
    	if(airplaneSaved == null) {
    		return new ResponseEntity<AirplaneModel>(HttpStatus.UNPROCESSABLE_ENTITY);
    	}
    	return new ResponseEntity<AirplaneModel>(airplaneSaved, HttpStatus.OK);
	}
    
	@CrossOrigin
    @RequestMapping(value = "/airplane/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteAirplane(@PathVariable("id") long id) {
    	airplaneService.delete(id);
    	return new ResponseEntity<AirplaneModel>(HttpStatus.OK);
	}
    
}