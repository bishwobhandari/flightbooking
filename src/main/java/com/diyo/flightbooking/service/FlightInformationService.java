package com.diyo.flightbooking.service;

import com.diyo.flightbooking.repository.FlightDetailsInformationRepository;
import org.springframework.stereotype.Service;

@Service

public class FlightInformationService {
private FlightDetailsInformationRepository flightDetailsInformationRepository;


    public FlightDetailsInformationRepository getFlightDetailsInformationRepository() {
        return flightDetailsInformationRepository;
    }
}
