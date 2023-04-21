package com.diyo.flightbooking.service;

import com.diyo.flightbooking.entity.FlightBooking;
import com.diyo.flightbooking.entity.FlightBookingDetails;
import com.diyo.flightbooking.repository.FlightBookingRepository;
import com.diyo.flightbooking.repository.FlightDetailsInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class FlightBookingService {
    @Autowired
    private FlightBookingRepository flightBookingRepository;
    private FlightDetailsInformationRepository flightDetailsInformationRepository;

    public String flightBookingDetails(FlightBookingDetails flightBookingDetails) {
        flightBookingRepository.save(flightBookingDetails);
        return "Successfully Updated";

    }
    public String flightBookingDetails(Long id, FlightBookingDetails flightBookingDetails) {
        Optional<FlightBookingDetails> flightDetails = flightBookingRepository.findById(id);
        flightDetails.get().setBookDate(flightBookingDetails.getBookDate());
        flightDetails.get().setPassenger(flightBookingDetails.getPassenger());
        flightDetails.get().setPayment(flightBookingDetails.getPayment());
        flightBookingRepository.save(flightDetails.get());
        return "Successfully Updated";

    }
    public Optional<FlightBookingDetails> getFlightBookingDetailById(Long id){
        boolean exists = flightDetailsInformationRepository.existsById(id);
        if(exists){
            return flightDetailsInformationRepository.findById(id);
        }
        return null;
    }

    public String deleteFlightBookingDetailById(Long id){
        boolean exists=flightDetailsInformationRepository.existsById(id);
        if(exists){
            flightDetailsInformationRepository.deleteById(id);
            return "Deleted";
        }
        return "Bad Request";
    }
}
