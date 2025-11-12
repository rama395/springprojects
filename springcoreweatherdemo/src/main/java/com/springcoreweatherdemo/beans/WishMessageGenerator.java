package com.springcoreweatherdemo.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component
@Slf4j
public class WishMessageGenerator {
    @Autowired
    private LocalDate localDate;

    public String generateWishMessage(String name) {
        log.info("Generating a WishMessage for:{}",name);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return "Happy WeekEnd " + name;
        } else {
            return "Happy Working Day " + name;
        }


    }

}

