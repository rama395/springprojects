package com.circuitbreaker.consumerms.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService
{
    public String makePayment()
    {
        throw new IllegalArgumentException("cannot make payment");
        //return "payment success";
    }
}
