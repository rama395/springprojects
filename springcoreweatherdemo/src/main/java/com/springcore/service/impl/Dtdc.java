package com.springcore.service.impl;


import com.springcore.service.Courier;
import org.springframework.stereotype.Component;

@Component("dtdc")
public final class Dtdc implements Courier {
        @Override
        public String deliver(int oid)
        {
            return "order id:"+oid+"....order items are kept ready for delivery by DTDC";
        }
}

