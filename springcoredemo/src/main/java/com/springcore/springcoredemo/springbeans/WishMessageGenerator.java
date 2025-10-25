package com.springcore.springcoredemo.springbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class WishMessageGenerator {
    //    @Autowired
    private LocalTime localTime;

    @Autowired
    public WishMessageGenerator(LocalTime localTime) {
        this.localTime = localTime;

    }

    public String showWishMessage(String userName) {
        int hour = localTime.getHour();
        if (hour <= 12)
            return "GoodMorning " + userName;
        else if (hour <= 16)
            return "GoodAfternoon " + userName;
        else if (hour <= 20)
            return "GoodEvening " + userName;
        else
            return "GoodNight " + userName;

    }
}


