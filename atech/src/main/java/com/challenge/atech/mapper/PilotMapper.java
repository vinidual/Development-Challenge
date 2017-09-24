package com.challenge.atech.mapper;

import java.util.ArrayList;
import java.util.List;

import com.challenge.atech.entity.Pilot;
import com.challenge.atech.model.PilotModel;

public final class PilotMapper {

	public static PilotModel EntityToModel(Pilot pilot) {
		PilotModel pilotModel = new PilotModel(
			pilot.getName(), 
			pilot.getGender(), 
			pilot.getCompanyName(),
			pilot.getFlightLicence(),
			pilot.getPassport()			
		);
		return pilotModel;
	}
	
	public static List<PilotModel> EntityToModel(List<Pilot> listCities) {
		List<PilotModel> listCitiesModel = new ArrayList<PilotModel>();
		for(int i = 0; i < listCities.size(); i++) {
			listCitiesModel.add(EntityToModel(listCities.get(i)));
		}
		return listCitiesModel;
	}
	
	public static Pilot ModelToEntity(PilotModel pilotModel) {
		Pilot pilot = new Pilot();
		pilot.setName(pilotModel.getName());
		pilot.setGender(pilotModel.getGender());
		pilot.setCompanyName(pilotModel.getCompanyName());
		pilot.setFlightLicence(pilotModel.getFlightLicence());
		pilot.setPassport(pilotModel.getPassport());
		return pilot;
	}
	
}
