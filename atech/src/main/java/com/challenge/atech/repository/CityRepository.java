package com.challenge.atech.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.atech.entity.City;

@Repository("cityRepository")
public interface CityRepository extends JpaRepository<City, Long> {
	
}