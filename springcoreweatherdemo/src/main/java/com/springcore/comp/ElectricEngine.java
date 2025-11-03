package com.springcore.comp;

public final class ElectricEngine implements Engine {
    @Override
    public String starts(String s)
    {
        System.out.println("Electric engine started");
        return s;
    }
    @Override
    public String stops(String journeyEnded)
    {
        System.out.println("Electric engine stopped");
        return journeyEnded;
    }
}
