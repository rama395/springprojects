package com.springbootjpa.service;

import com.springbootjpa.entity.FlightDetails;
import com.springbootjpa.repository.FlightRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightRepo flightRepo;

    @Override
    public String registerFlight(FlightDetails flightDetails) {
        log.info("Flight no before save::" + flightDetails.getFno());
        FlightDetails flightDetails1 = flightRepo.save(flightDetails);
        return "Flight obj is saved with id value::" + flightDetails1.getFno();
    }

    @Override
    public boolean isFlightAvailable(Integer id) {
      //use repo
        boolean flag=flightRepo.existsById(id);
        return flag;
    }

    @Override
    public String registerFlightBatch(List<FlightDetails> list) {
        //save objs
        Iterable<FlightDetails> savedList = flightRepo.saveAll(list);
        List<Integer> ids = StreamSupport.stream(savedList.spliterator(), false).map(FlightDetails::getFno).toList();
        return ids.size() + "number of flights are registered having id values" + ids;
    }

    @Override
    public long fetchFlightsCount() {
        return flightRepo.count();
    }

    @Override
    public boolean checkFlightAvailability(Integer id) {
        return flightRepo.existsById(id);
    }

    @Override
    public Iterable<FlightDetails> showAllFlights() {
        return flightRepo.findAll();
    }

    @Override
    public Iterable<FlightDetails> showAllFlightsByIds(Iterable<Integer> ids) {
        return flightRepo.findAllById(ids);
    }

    @Override
    public FlightDetails showFlightById(Integer id) {
        FlightDetails fd=flightRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid flight id"));
        return fd;
    }

    @Override
    public String registerOrUpdateFlight(FlightDetails flightDetails) {
        //save or update object
        flightRepo.save(flightDetails);
        return "Flight is updated";
    }

    @Override
    public String deleteFlightById(Integer id) {
        //load obj
        Optional<FlightDetails> opt=flightRepo.findById(id);
        if(opt.isPresent())
        {
            flightRepo.deleteById(id);
            return id+" flight is deleted";
        }
        else
            return id+ "flight not found for deletion";
    }

    @Override
    public String deleteFlight(FlightDetails flight) {
        //load obj
        Optional<FlightDetails> opt=flightRepo.findById(flight.getFno());
        if(opt.isEmpty())
        {
            return flight.getFno()+" flight is not found";
        }
        else {
            flightRepo.delete(opt.get());
            return flight.getFno()+" flight found and deleted";
        }
    }
}
