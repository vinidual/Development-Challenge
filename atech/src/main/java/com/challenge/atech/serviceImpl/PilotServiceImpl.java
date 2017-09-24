package com.challenge.atech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.atech.entity.Pilot;
import com.challenge.atech.mapper.PilotMapper;
import com.challenge.atech.model.PilotModel;
import com.challenge.atech.repository.PilotRepository;
import com.challenge.atech.service.PilotService;

@Service("pilotService")
public class PilotServiceImpl implements PilotService {
	
	@Autowired
	PilotRepository pilotRepository; 

	@Override
	public PilotModel getPilotById(long id) {
		Pilot pilot = pilotRepository.findOne(id);
		if(pilot == null) {
			return null;
		}
		return PilotMapper.EntityToModel(pilotRepository.findOne(id));
	}

	@Override
	public List<PilotModel> getAllPilots() {
		List<Pilot> listPilots = pilotRepository.findAll();
		if(listPilots.isEmpty()) {
			return null;
		}
		return PilotMapper.EntityToModel(pilotRepository.findAll());
	}

	@Override
	public PilotModel savePilot(PilotModel pilot) {
		return PilotMapper.EntityToModel(
				pilotRepository.save(
						PilotMapper.ModelToEntity(pilot)));
	}

	@Override
	public PilotModel patchPilot(long id, PilotModel pilot) {
		Pilot pilotFound = pilotRepository.findOne(id);
		if(pilotFound == null) {
			return null;
		}
		pilotFound.setCompanyName(pilot.getCompanyName());
		pilotFound.setFlightLicence(pilot.getFlightLicence());
		pilotFound.setGender(pilot.getGender());
		pilotFound.setName(pilot.getName());
		pilotFound.setPassport(pilot.getPassport());
		return PilotMapper.EntityToModel(pilotRepository.save(pilotFound));
	}

	@Override
	public void delete(long id) {
		pilotRepository.delete(id);
	}

}