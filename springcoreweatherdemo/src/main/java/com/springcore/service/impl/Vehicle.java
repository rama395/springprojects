package com.springcore.service.impl;

import com.springcore.service.Engine;

public final class Vehicle
{
    //HAS-A property
    private Engine engine;

    public void setEngine(Engine engine) {
        System.out.println("Vehicle.setEngine()");
        this.engine = engine;
    }
    //Business method
    public void journey()
    {
        engine.start();
        System.out.println("journey started from bangalore to hyderbad");
       engine.stop();
    }
}
