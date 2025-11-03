package com.springcore.comp;

public final class DieselEngine implements Engine
{
    @Override
    public String starts(String s)
    {
        System.out.println("Diesel engine started");
        return s;
    }
    @Override
    public String stops(String journeyEnded)
    {
        System.out.println("Diesel engine stopped");
        return journeyEnded;
    }
}
