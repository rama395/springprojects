package com.springcore.factory;

import com.springcore.service.Engine;
import com.springcore.service.impl.DieselEngine;
import com.springcore.service.impl.ElectricEngine;
import com.springcore.service.impl.PetrolEngine;

public class CourierFactory {
    //static factory method using factory pattern logic
    public static Engine getInstance(String vehicleType) {
        //create dependent class obj
        Engine engine = null;
        if (vehicleType.equalsIgnoreCase("petrolengine"))
            engine = new PetrolEngine();
        else if (vehicleType.equalsIgnoreCase("dieselengine"))
            engine = new DieselEngine();
        else if (vehicleType.equalsIgnoreCase("electricengine"))
            engine = new ElectricEngine();
        else
            throw new IllegalArgumentException("Invalid Vehicle Type");

        return engine;
    }
}
