package com.springcore.comp;

public final class Vehicle
{
    //HAS-A property
    private Engine engine;

    public void setEngine(Engine engine) {
        System.out.println("Vehicle.setEngine()");
        this.engine = engine;
    }
    //Business method
    public String journey(String msg1,String msg2)
    {
       String starts=engine.starts("journey started from bangalore to hyderbad");
       String stops=engine.stops("journey ended");
        return starts+"..............."+stops;
    }
}
