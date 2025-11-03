package com;

import com.springcore.comp.Vehicle;
import com.springcore.factory.VehicleFactory;

public class EngineStrategyPatternTest
{
    public static void main(String[] args) {
        //use Factory pattern to target class obj
        Vehicle vehicle= VehicleFactory.getInstance("dieselengine");
        //invoke the business method
        String resultMsg=vehicle.journey("journey started","jouney ended");
        System.out.println(resultMsg);
    }
}
