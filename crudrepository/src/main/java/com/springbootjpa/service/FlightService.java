package com.springbootjpa.service;

import com.springbootjpa.entity.FlightDetails;

import java.util.List;

public interface FlightService {
    public String registerFlight(FlightDetails flightDetails);
    public boolean isFlightAvailable(Integer id);
    public String registerFlightBatch(List<FlightDetails> list);
    public long fetchFlightsCount();
    public boolean checkFlightAvailability(Integer id);
    public Iterable<FlightDetails> showAllFlights();
    public Iterable<FlightDetails> showAllFlightsByIds(Iterable<Integer> ids);
    public FlightDetails showFlightById(Integer id);
    public String registerOrUpdateFlight(FlightDetails flightDetails);

    public String deleteFlightById(Integer id);
    public String deleteFlight(FlightDetails flight);
}
