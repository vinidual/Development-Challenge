package com.challenge.atech.mapper;

import java.util.ArrayList;
import java.util.List;

import com.challenge.atech.entity.City;
import com.challenge.atech.model.CityModel;

public final class CityMapper {
	
	public static CityModel EntityToModel(City city) {
		CityModel cityModel = new CityModel(
			city.getCountry(), 
			city.getStateOrProvince(), 
			city.getName()
		);
		return cityModel;
	}
	
	public static List<CityModel> EntityToModel(List<City> listCities) {
		List<CityModel> listCitiesModel = new ArrayList<CityModel>();
		for(int i = 0; i < listCities.size(); i++) {
			listCitiesModel.add(EntityToModel(listCities.get(i)));
		}
		return listCitiesModel;
	}
	
	public static City ModelToEntity(CityModel cityModel) {
		City city = new City();
		city.setName(cityModel.getName());
		city.setCountry(cityModel.getCountry());
		city.setStateOrProvince(cityModel.getStateOrProvince());
		return city;
	}
	
}