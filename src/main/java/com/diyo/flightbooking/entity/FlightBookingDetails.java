package com.diyo.flightbooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookDate;

    //one passenger can book only one flight for now
    @OneToOne
    private Passenger passenger;


    //many flights can be booked by same payment method
    @ManyToOne
    private Payment payment;


    //many flightInfo can bbe booked for same route by different passengers
    @ManyToOne
    private FlightInformation flightInformation;

}
