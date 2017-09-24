package com.challenge.atech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.atech.entity.Airplane;
import com.challenge.atech.mapper.AirplaneMapper;
import com.challenge.atech.model.AirplaneModel;
import com.challenge.atech.repository.AirplaneRepository;
import com.challenge.atech.service.AirplaneService;

@Service("airplaneService")
public class AirplaneServiceImpl implements AirplaneService {
	
	@Autowired
	AirplaneRepository airplaneRepository; 

	@Override
	public AirplaneModel getAirplaneById(long id) {
		Airplane airplane = airplaneRepository.findOne(id);
		if(airplane == null) {
			return null;
		}
		return AirplaneMapper.EntityToModel(airplaneRepository.findOne(id));
	}

	@Override
	public List<AirplaneModel> getAllAirplanes() {
		List<Airplane> listAirplanes = airplaneRepository.findAll();
		if(listAirplanes.isEmpty()) {
			return null;
		}
		return AirplaneMapper.EntityToModel(airplaneRepository.findAll());
	}

	@Override
	public AirplaneModel saveAirplane(AirplaneModel airplane) {
		return AirplaneMapper.EntityToModel(
				airplaneRepository.save(
						AirplaneMapper.ModelToEntity(airplane)));
	}

	@Override
	public AirplaneModel patchAirplane(long id, AirplaneModel airplane) {
		Airplane airplaneFound = airplaneRepository.findOne(id);
		if(airplaneFound == null) {
			return null;
		}
		airplaneFound.setCompany(airplane.getCompany());
		airplaneFound.setCargoCapacity(airplane.getCargoCapacity());
		airplaneFound.setModel(airplane.getModel());
		airplaneFound.setPassengerCapacity(airplane.getPassengerCapacity());
		return AirplaneMapper.EntityToModel(airplaneRepository.save(airplaneFound));
	}

	@Override
	public void delete(long id) {
		airplaneRepository.delete(id);
	}

}