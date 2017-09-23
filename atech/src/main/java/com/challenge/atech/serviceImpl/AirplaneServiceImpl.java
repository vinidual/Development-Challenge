package com.challenge.atech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.atech.entity.Airplane;
import com.challenge.atech.repository.AirplaneRepository;
import com.challenge.atech.service.AirplaneService;

@Service("airplaneService")
public class AirplaneServiceImpl implements AirplaneService {
	
	@Autowired
	AirplaneRepository airplaneRepository; 

	@Override
	public Airplane getAirplaneById(long id) {
		return airplaneRepository.findOne(id);
	}

	@Override
	public List<Airplane> getAllAirplanes() {
		return airplaneRepository.findAll();
	}

}