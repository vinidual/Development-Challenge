package com.challenge.atech.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.atech.entity.Pilot;

@Repository("pilotRepository")
public interface PilotRepository extends JpaRepository<Pilot, Long> {
	
}