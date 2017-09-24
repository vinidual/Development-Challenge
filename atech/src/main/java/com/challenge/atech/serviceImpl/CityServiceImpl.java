package com.challenge.atech.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.atech.entity.City;
import com.challenge.atech.mapper.CityMapper;
import com.challenge.atech.model.CityModel;
import com.challenge.atech.repository.CityRepository;
import com.challenge.atech.service.CityService;

@Service("cityService")
public class CityServiceImpl implements CityService {
	
	@Autowired
	CityRepository cityRepository; 

	@Override
	public CityModel getCityById(long id) {
		City city = cityRepository.findOne(id);
		if(city == null) {
			return null;
		}
		return CityMapper.EntityToModel(cityRepository.findOne(id));
	}

	@Override
	public List<CityModel> getAllCities() {
		List<City> listCities = cityRepository.findAll();
		if(listCities.isEmpty()) {
			return null;
		}
		return CityMapper.EntityToModel(cityRepository.findAll());
	}

	@Override
	public CityModel saveCity(CityModel city) {
		return CityMapper.EntityToModel(
				cityRepository.save(
						CityMapper.ModelToEntity(city)));
	}

	@Override
	public CityModel patchCity(long id, CityModel city) {
		City cityFound = cityRepository.findOne(id);
		if(cityFound == null) {
			return null;
		}
		cityFound.setCountry(city.getCountry());
		cityFound.setName(city.getName());
		cityFound.setStateOrProvince(city.getStateOrProvince());
		return CityMapper.EntityToModel(cityRepository.save(cityFound));
	}

	@Override
	public void delete(long id) {
		cityRepository.delete(id);
	}

}