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

import com.challenge.atech.model.CityModel;
import com.challenge.atech.service.CityService;

@RestController
@RequestMapping("/api")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
    @RequestMapping(value = "/city", method = RequestMethod.GET)
    public ResponseEntity<?> getCitys() {
    	List<CityModel> listCities = cityService.getAllCities();
    	if(listCities.isEmpty()) {
    		return new ResponseEntity<List<CityModel>>(HttpStatus.NO_CONTENT);
    	}
    	return new ResponseEntity<List<CityModel>>(listCities, HttpStatus.OK);
	}

    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getCity(@PathVariable("id") long id) {
    	CityModel city = cityService.getCityById(id);
    	if(city == null) {
    		return new ResponseEntity<CityModel>(HttpStatus.NOT_FOUND);
    	}
    	return new ResponseEntity<CityModel>(city, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/city", method = RequestMethod.POST)
    public ResponseEntity<?> saveCity(@RequestBody CityModel city) {
    	CityModel citySaved = cityService.saveCity(city);
    	if(citySaved == null) {
    		return new ResponseEntity<CityModel>(HttpStatus.UNPROCESSABLE_ENTITY);
    	}
    	return new ResponseEntity<CityModel>(citySaved, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/city/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> patchCity(@PathVariable("id") long id, @RequestBody CityModel city) {
    	CityModel citySaved = cityService.patchCity(id, city);
    	if(citySaved == null) {
    		return new ResponseEntity<CityModel>(HttpStatus.UNPROCESSABLE_ENTITY);
    	}
    	return new ResponseEntity<CityModel>(citySaved, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/city/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCity(@PathVariable("id") long id) {
    	cityService.delete(id);
    	return new ResponseEntity<CityModel>(HttpStatus.OK);
	}
    
}