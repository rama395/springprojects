package com.springcore.comp;


public final class Dtdc implements Courier{
        @Override
        public String deliver(int oid)
        {
            return "order id:"+oid+"....order items are kept ready for delivery by DTDC";
        }
}

