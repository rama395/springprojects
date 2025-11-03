package com.springcore.service.impl;

import com.springcore.service.Engine;

public final class DieselEngine implements Engine
{
    @Override
    public void start()
    {
        System.out.println("Diesel engine started");
    }
    @Override
    public void stop()
    {
        System.out.println("Diesel engine stopped");
    }
}
