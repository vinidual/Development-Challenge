package com.challenge.atech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.atech.entity.City;
import com.challenge.atech.repository.CityRepository;
import com.challenge.atech.service.CityService;

@Service("cityService")
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityRepository cityRepository; 

	@Override
	public City getCityById(long id) {
		return cityRepository.findOne(id);
	}

	@Override
	public List<City> getAllCities() {
		return cityRepository.findAll();
	}

}