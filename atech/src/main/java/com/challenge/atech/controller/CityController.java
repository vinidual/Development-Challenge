package com.challenge.atech.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.atech.entity.City;
import com.challenge.atech.service.CityService;

@RestController
public class CityController {
	
	@Autowired
	private CityService cityService;
	
    @RequestMapping(value = "/City", method = RequestMethod.GET)
    public List<City> getCitys() {
		return cityService.getAllCities();
	}

    @RequestMapping(value = "/City/{id}", method = RequestMethod.GET)
    public City getCity(@PathVariable("id") long id) {
		return cityService.getCityById(id);
	}
    
}