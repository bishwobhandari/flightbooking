package com.diyo.flightbooking.repository;

import com.diyo.flightbooking.entity.FlightInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FLightInformationRepository extends JpaRepository<FlightInformation,Long> {
}
