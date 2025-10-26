package com.springcoreweatherdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component
public class WishMessageGenerator {
    @Autowired
    private LocalDate localDate;

    public String generateWishMessage(String name) {
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return "Happy WeekEnd " + name;
        } else {
            return "Happy Working Day " + name;
        }


    }


}
