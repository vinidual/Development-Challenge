package com.challenge.atech.service;

import java.util.List;

import com.challenge.atech.model.PilotModel;

public interface PilotService { 
	
	PilotModel getPilotById(long id);
	
	List<PilotModel> getAllPilots();
	
	PilotModel savePilot(PilotModel pilot);
	
	PilotModel patchPilot(long id, PilotModel pilot);
	
	void delete(long id);
	
}
