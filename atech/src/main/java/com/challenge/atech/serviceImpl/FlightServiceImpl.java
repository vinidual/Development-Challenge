package com.challenge.atech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.atech.entity.Flight;
import com.challenge.atech.entity.Flight;
import com.challenge.atech.mapper.AirplaneMapper;
import com.challenge.atech.mapper.CityMapper;
import com.challenge.atech.mapper.FlightMapper;
import com.challenge.atech.mapper.PilotMapper;
import com.challenge.atech.model.FlightModel;
import com.challenge.atech.repository.FlightRepository;
import com.challenge.atech.repository.FlightRepository;
import com.challenge.atech.service.FlightService;

@Service("flightService")
public class FlightServiceImpl implements FlightService {
	
	/*@Autowired
	FlightRepository flightRepository; 

	@Override
	public Flight getFlightById(long id) {
		return flightRepository.findOne(id);
	}

	@Override
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

	@Override
	public Flight saveFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	@Override
	public Flight patchFlight(long id, Flight flight) {
		Flight flightFound = flightRepository.findOne(id);
		if(flightFound == null) {
			return null;
		}
		flightFound.setAirplane(flight.getAirplane());
		flightFound.setDestinyFlight(flight.getDestinyFlight());
		flightFound.setFlightStatus(flight.getFlightStatus());
		flightFound.setLandingTime(flight.getLandingTime());
		flightFound.setOriginFlight(flight.getOriginFlight());
		flightFound.setPilot(flight.getPilot());
		flightFound.setTakeoffTime(flight.getTakeoffTime());
		return flightRepository.save(flightFound);
	}

	@Override
	public void delete(long id) {
		flightRepository.delete(id);
	}*/
	
	@Autowired
	FlightRepository flightRepository; 

	@Override
	public FlightModel getFlightById(long id) {
		Flight flight = flightRepository.findOne(id);
		if(flight == null) {
			return null;
		}
		return FlightMapper.EntityToModel(flightRepository.findOne(id));
	}

	@Override
	public List<FlightModel> getAllFlights() {
		List<Flight> listFlights = flightRepository.findAll();
		if(listFlights.isEmpty()) {
			return null;
		}
		return FlightMapper.EntityToModel(flightRepository.findAll());
	}

	@Override
	public FlightModel saveFlight(FlightModel flight) {
		return FlightMapper.EntityToModel(
				flightRepository.save(
						FlightMapper.ModelToEntity(flight)));
	}

	@Override
	public FlightModel patchFlight(long id, FlightModel flight) {
		Flight flightFound = flightRepository.findOne(id);
		if(flightFound == null) {
			return null;
		}
		flightFound.setAirplane(AirplaneMapper.ModelToEntity(flight.getAirplane()));
		flightFound.setDestinyCity(CityMapper.ModelToEntity(flight.getDestinyCity()));
		flightFound.setFlightStatus(flight.getFlightStatus());
		flightFound.setLandingTime(flight.getLandingTime());
		flightFound.setOriginCity(CityMapper.ModelToEntity(flight.getOriginCity()));
		flightFound.setPilot(PilotMapper.ModelToEntity(flight.getPilot()));
		flightFound.setTakeoffTime(flight.getTakeoffTime());
		return FlightMapper.EntityToModel(flightRepository.save(flightFound));
	}

	@Override
	public void delete(long id) {
		flightRepository.delete(id);
	}

}