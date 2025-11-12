package com.springcore.factory;

import com.springcore.service.impl.BlueDart;
import com.springcore.service.Courier;
import com.springcore.service.impl.Dtdc;

public final class CourierFactory
{
    //static factory method having factory pattern logic
    public static Courier getInstance(String courierType)
    {
        //create dependent class obj
        Courier courier=null;
        if(courierType.equalsIgnoreCase("dtdc"))
            courier=new Dtdc();
        else if (courierType.equalsIgnoreCase("bDart"))
            courier=new BlueDart();
        else throw
            new IllegalArgumentException("Invalid Courier Type");

        return courier;

    }


}
