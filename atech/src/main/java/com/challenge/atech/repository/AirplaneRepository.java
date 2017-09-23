package com.challenge.atech.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.atech.entity.Airplane;

@Repository("airplaneRepository")
public interface AirplaneRepository extends JpaRepository<Airplane, Long> {
	
}