package com.circuitbreaker.consumerms.controller;

import com.circuitbreaker.consumerms.service.PaymentService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Slf4j
public class ShoppingController
{
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/purchase")
    @CircuitBreaker(name="shopping-service",fallbackMethod = "billingFallback")
    public ResponseEntity<String> shopping()
    {
        log.info("shopping() method shopping MS");
        String resultMsg= paymentService.makePayment();
        return new ResponseEntity<String>(resultMsg,HttpStatus.OK);

    }
   public ResponseEntity<String> billingFallback(Exception e)
    {
        log.info("shoppingservicecontroller.billingFallback()");
        return new ResponseEntity<String>("Billing operations are out of service",HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
