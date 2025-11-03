package com.springcore.factory;

import com.springcore.comp.BlueDart;
import com.springcore.comp.Courier;
import com.springcore.comp.Dtdc;
import com.springcore.comp.Flipkart;

public class FlipkartFactory
{
    //static factory method having factory pattern logic
    public static Flipkart getInstance(String courierType)
    {
        //create dependent class obj
        Courier courier=null;
        if(courierType.equalsIgnoreCase("dtdc"))
            courier=new Dtdc();
        else if (courierType.equalsIgnoreCase("bluedart"))
            courier=new BlueDart();
        else throw
            new IllegalArgumentException("Invalid Courier Type");
        //create target class obj
        Flipkart flipkart=new Flipkart();
        //assign dependent class obj to target class obj
        flipkart.setCourier(courier);
        return flipkart;

    }


}
