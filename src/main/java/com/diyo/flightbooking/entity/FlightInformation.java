package com.diyo.flightbooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class FlightInformation {
    @Id
    @GeneratedValue ( strategy = GenerationType.AUTO)
    private long id;
    private String source;
    private String destination;
    private int duration;
    private String routeId;
    private String flightTime;

}
