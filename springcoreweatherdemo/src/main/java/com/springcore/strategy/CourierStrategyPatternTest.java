package com.springcore.strategy;

import com.springcore.service.Courier;
import com.springcore.service.impl.Flipkart;
import com.springcore.factory.EngineFactory;

public class CourierStrategyPatternTest
{
    public static void main(String[] args) {
        //use factory pattern to target class obj
        Courier courier= EngineFactory.getInstance("bluedart");
        //create target class obj
        Flipkart flipkart=new Flipkart();
        //assign dependent class obj to target class obj
        flipkart.setCourier(courier);
        //invoke the business method
        String resultMsg=flipkart.shopping(new String[]{"Shirt","Trouser"},new double[]{3000.0,4000.0});
        System.out.println(resultMsg);
    }
}
