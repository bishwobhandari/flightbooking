package com.diyo.flightbooking.repository;

import com.diyo.flightbooking.entity.FlightBookingDetails;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface FlightBookingRepo extends JpaRepository <FlightBookingDetails,Long>{
}
