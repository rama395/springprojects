package com.springcore.service.impl;

import com.springcore.service.Courier;

public final class BlueDart implements Courier {
    @Override
    public String deliver(int oid)
    {
        return oid+"Order items are kept ready for delivery by Bluedart";
    }
}
