package com.springcore.factory;

import com.springcore.comp.*;

public class VehicleFactory
{
    //static factory method using factory pattern logic
    public static Vehicle getInstance(String vehicleType)
    {
        //create dependent class obj
        Engine engine=null;
        if(vehicleType.equalsIgnoreCase("petrolengine"))
            engine=new PetrolEngine();
        else if (vehicleType.equalsIgnoreCase("dieselengine"))
            engine=new DieselEngine();
        else if (vehicleType.equalsIgnoreCase("electricengine"))
            engine=new ElectricEngine();
        else
            throw new IllegalArgumentException("Invalid Vehicle Type");
        //create target class obj
        Vehicle vehicle=new Vehicle();
        //assign dependent class obj to target class obj
        vehicle.setEngine(engine);
        return vehicle;
    }
}
