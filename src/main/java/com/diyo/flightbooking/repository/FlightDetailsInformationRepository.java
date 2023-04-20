package com.diyo.flightbooking.repository;

import com.diyo.flightbooking.entity.FlightBookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDetailsInformationRepository extends JpaRepository<FlightBookingDetails,Long> {
}