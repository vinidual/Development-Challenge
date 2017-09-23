package com.challenge.atech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.atech.entity.Pilot;
import com.challenge.atech.repository.PilotRepository;
import com.challenge.atech.service.PilotService;

@Service("pilotService")
public class PilotServiceImpl implements PilotService {
	
	@Autowired
	PilotRepository pilotRepository; 

	@Override
	public Pilot getPilotById(long id) {
		return pilotRepository.findOne(id);
	}

	@Override
	public List<Pilot> getAllPilots() {
		return pilotRepository.findAll();
	}

}