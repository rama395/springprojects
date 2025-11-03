package com.springcore.comp;

public final class PetrolEngine implements Engine
{
    @Override
    public String starts(String s)
    {
        System.out.println("Petrol engine started");
        return s;
    }
    @Override
    public String stops(String journeyEnded)
    {
        System.out.println("Petrol engine stopped");
        return journeyEnded;
    }

}
