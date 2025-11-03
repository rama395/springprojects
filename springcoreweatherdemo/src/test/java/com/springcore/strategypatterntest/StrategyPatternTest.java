package com.springcore.strategypatterntest;

import com.springcore.comp.Flipkart;
import com.springcore.factory.FlipkartFactory;

public class StrategyPatternTest
{
    public static void main(String[] args) {
        //use factory pattern to target class obj
        Flipkart flipkart= FlipkartFactory.getInstance("bluedart");
        //invoke the business method
        String resultMsg=flipkart.shopping(new String[]{"Shirt","Trouser"},new double[]{3000.0,4000.0});
        System.out.println(resultMsg);
    }
}
