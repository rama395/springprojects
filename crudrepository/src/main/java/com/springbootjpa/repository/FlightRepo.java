package com.springbootjpa.repository;

import com.springbootjpa.entity.FlightDetails;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepo extends CrudRepository<FlightDetails, Integer> {


}
