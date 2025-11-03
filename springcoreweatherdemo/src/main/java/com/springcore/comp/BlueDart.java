package com.springcore.comp;

public final class BlueDart implements Courier {
    @Override
    public String deliver(int oid)
    {
        return oid+"Order items are kept ready for delivery by Bluedart";
    }
}
