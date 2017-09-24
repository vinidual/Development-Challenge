package com.challenge.atech.mapper;

import java.util.ArrayList;
import java.util.List;

import com.challenge.atech.entity.Airplane;
import com.challenge.atech.model.AirplaneModel;

public final class AirplaneMapper {
	
	public static AirplaneModel EntityToModel(Airplane airplane) {
		AirplaneModel airplaneModel = new AirplaneModel(
			airplane.getCompany(), 
			airplane.getModel(), 
			airplane.getCargoCapacity(),
			airplane.getPassengerCapacity()
		);
		return airplaneModel;
	}
	
	public static List<AirplaneModel> EntityToModel(List<Airplane> listAirplanes) {
		List<AirplaneModel> listAirplanesModel = new ArrayList<AirplaneModel>();
		for(int i = 0; i < listAirplanes.size(); i++) {
			listAirplanesModel.add(EntityToModel(listAirplanes.get(i)));
		}
		return listAirplanesModel;
	}
	
	public static Airplane ModelToEntity(AirplaneModel airplaneModel) {
		Airplane airplane = new Airplane();
		airplane.setCompany(airplaneModel.getCompany());
		airplane.setModel(airplaneModel.getModel());
		airplane.setCargoCapacity(airplaneModel.getCargoCapacity());
		airplane.setPassengerCapacity(airplaneModel.getPassengerCapacity());
		return airplane;
	}

}
