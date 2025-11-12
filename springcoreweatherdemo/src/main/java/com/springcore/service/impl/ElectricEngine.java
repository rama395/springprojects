package com.springcore.service.impl;

import com.springcore.service.Engine;
import org.springframework.stereotype.Component;

@Component("eEng")
public final class ElectricEngine implements Engine {
    @Override
    public void start()
    {
        System.out.println("Electric engine started");
    }
    @Override
    public void stop()
    {
        System.out.println("Electric engine stopped");
    }
}
