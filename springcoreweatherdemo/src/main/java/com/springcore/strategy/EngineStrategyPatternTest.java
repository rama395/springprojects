package com.springcore.strategy;

import com.springcore.factory.EngineFactory;
import com.springcore.service.Engine;
import com.springcore.service.impl.Vehicle;
import com.springcore.factory.CourierFactory;

public class EngineStrategyPatternTest {
    public static void main(String[] args) {
        //use Factory pattern to target class obj
        Engine engine = EngineFactory.getInstance("dieselengine");

        //create target class obj
        Vehicle vehicle = new Vehicle();
        //assign dependent class obj to target class obj
        vehicle.setEngine(engine);
        //invoke the business method
        vehicle.journey();
    }
}
