package com.challenge.atech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.challenge.atech.repository.AirplaneRepository;
import com.challenge.atech.repository.CityRepository;
import com.challenge.atech.repository.FlightRepository;
import com.challenge.atech.repository.PilotRepository;

@SpringBootApplication
public class AtechApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(AtechApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AtechApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(AirplaneRepository airplaneRepository) {
		return (args) -> {
			logger.info("Airplane repository started");
		};
	}
	
}
