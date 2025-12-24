package com.springbootjpa.runner;

import com.springbootjpa.entity.FlightDetails;
import com.springbootjpa.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
//@Slf4j
//public class CrudRepoTestRunner implements CommandLineRunner {
//    @Autowired
//    private FlightService flightService;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Runner class started");
//        FlightDetails fd = new FlightDetails();
//        fd.setFno(61000);
//        fd.setFcomp("Indigo");
//        fd.setType("Airbus");
//        fd.setCapacity(200);
//        String msg = flightService.registerFlight(fd);
//        log.info(msg);
//
//    }
//}
