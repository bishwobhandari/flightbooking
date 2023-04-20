package com.diyo.flightbooking.service;

import com.diyo.flightbooking.entity.FlightBooking;
import com.diyo.flightbooking.entity.FlightInformation;
import com.diyo.flightbooking.repository.FlightDetailsInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightBookingService {
    @Autowired
    private FlightDetailsInformationRepository flightDetailsInformationRepository;

    public FlightInformation flightBookingDetails(FlightInformation flightInformation) {
        return flightDetailsInformationRepository.save(flightInformation);

    }
}
