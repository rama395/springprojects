package com.springcore.service.impl;

import com.springcore.service.Engine;
import org.springframework.stereotype.Component;

@Component("pEng")
public final class PetrolEngine implements Engine
{
    @Override
    public void start()
    {
        System.out.println("Petrol engine started");
    }
    @Override
    public void stop()
    {
        System.out.println("Petrol engine stopped");
    }

}
