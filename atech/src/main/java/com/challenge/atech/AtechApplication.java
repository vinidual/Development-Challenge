package com.challenge.atech;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.challenge.atech.entity.Airplane;
import com.challenge.atech.entity.City;
import com.challenge.atech.entity.Flight;
import com.challenge.atech.entity.Pilot;
import com.challenge.atech.enums.FlightStatus;
import com.challenge.atech.repository.AirplaneRepository;
import com.challenge.atech.repository.CityRepository;
import com.challenge.atech.repository.FlightRepository;
import com.challenge.atech.repository.PilotRepository;

@SpringBootApplication
public class AtechApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtechApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(
		AirplaneRepository airplaneRepository, 
		PilotRepository pilotRepository,
		CityRepository cityRepository,
		FlightRepository flightRepository
	) {
		return (args) -> {
			
			Airplane airplane = new Airplane();
			airplane.setCompany("company1");
			airplane.setModel("model1");
			airplane.setCargoCapacity(500.00);
			airplane.setPassengerCapacity(500);
			airplaneRepository.save(airplane);
			
			Pilot pilot = new Pilot();
			pilot.setCompanyName("company1");
			pilot.setFlightLicence("1111111AA");
			pilot.setGender('M');
			pilot.setName("pilot1");
			pilot.setPassport("AA111111");
			pilotRepository.save(pilot);
			
			City city1 = new City();
			city1.setCountry("country1");
			city1.setName("city1");
			city1.setStateOrProvince("state1");
			cityRepository.save(city1);
			
			City city2 = new City();
			city2.setCountry("country2");
			city2.setName("city2");
			city2.setStateOrProvince("province1");
			cityRepository.save(city2);
			
			Flight flight = new Flight();
			flight.setAirplane(airplane);
			flight.setDestinyCity(city1);
			flight.setFlightStatus(FlightStatus.OnGroundTakingOff);
			flight.setOriginCity(city2);
			flight.setLandingTime(new Date());
			flight.setTakeoffTime(new Date());
			flight.setPilot(pilot);
			flightRepository.save(flight);
			
		};
	}
	
}
