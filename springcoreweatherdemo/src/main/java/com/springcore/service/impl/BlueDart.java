package com.springcore.service.impl;

import com.springcore.service.Courier;
import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements Courier {
    @Override
    public String deliver(int oid)
    {
        return oid+"Order items are kept ready for delivery by Bluedart";
    }
}
