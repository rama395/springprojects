package com.springbootjpa;

import com.springbootjpa.entity.FlightDetails;
import com.springbootjpa.service.FlightService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CrudRepositoryApplication implements CommandLineRunner {
    @Autowired
    //@Qualifier("flightServiceImpl")
    private FlightService flightService;

    public static void main(String[] args) {
        SpringApplication.run(CrudRepositoryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner class started");


//		try{
//			boolean flag=flightService.isFlightAvailable(1);
//			if (flag)
//				log.info("flight is available");
//			else
//				log.info("flight is not available");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		FlightDetails flight1=new FlightDetails();
//		flight1.setFcomp("AirIndia");
//		flight1.setType("Airbus");
//		flight1.setCapacity(300);
//		FlightDetails flight2=new FlightDetails();
//		flight2.setFcomp("Qatar");
//		flight2.setType("Airbus");
//		flight2.setCapacity(400);
//		FlightDetails flight3=new FlightDetails();
//		flight3.setFcomp("AirIndia");
//		flight3.setType("Airbus");
//		flight3.setCapacity(100);
//		List<FlightDetails> list=List.of(flight1,flight2,flight3);
//		try{
//			String msg1=flightService.registerFlightBatch(list);
//			log.info(msg1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        try {
//            log.info("count of flights:" + flightService.fetchFlightsCount());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//		try{
//            log.info("3 id flight exists?::{}", flightService.checkFlightAvailability(3));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try{
//			Iterable<FlightDetails> list=flightService.showAllFlights();
//			list.forEach(System.out::println);
//			log.info("............................");
//			StreamSupport.stream(list.spliterator(),false).forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		try{
//			//flightService.showAllFlightsByIds(List.of(1,2,3,103,152,201)).forEach(System.out::println);
//			flightService.showAllFlightsByIds(Arrays.asList(1,2,3,103,null)).forEach(System.out::println);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        try {
//            FlightDetails fd = flightService.showFlightById(52);
//            log.info("{}", fd);
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        try{
//            FlightDetails fd=new FlightDetails();
//            fd.setFno(200);
//            fd.setFcomp("Qatar Airways");
//            fd.setType("Airbus");
//            fd.setCapacity(100);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try{
//            log.info("{}",flightService.deleteFlightById(52));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
            FlightDetails flightDetails = FlightDetails.builder().fno(101).fcomp("Indigo").type("Airbus").capacity(300).build();
////            flightDetails.setFno(101);
////            flightDetails.setFcomp("Indigo");
////            flightDetails.setType("Airbus");
////            flightDetails.setCapacity(300);
//           // log.info("{}", flightService.deleteFlight(flightDetails));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


    }
    private void saveFlight()
    {
        FlightDetails fd = FlightDetails.builder().fcomp("Indigo").type("Airbus").capacity(300).build();
        String msg = flightService.registerFlight(fd);
        log.info(msg);
    }


}
