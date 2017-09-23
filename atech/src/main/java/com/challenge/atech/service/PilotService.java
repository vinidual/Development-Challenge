package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.entity.Pilot;

public interface PilotService { 
	
	Pilot getPilotById(long id);
	
	List<Pilot> getAllPilots();
	
}
