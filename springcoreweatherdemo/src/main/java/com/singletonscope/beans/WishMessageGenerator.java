package com.singletonscope.beans;
//target class

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator {
    @Autowired
    @Qualifier("dt")
    private LocalDateTime ldt;//HAS-A property

    public WishMessageGenerator() {
        System.out.println("WishMesaageGeneratir:0-param constructor");
    }

//    public String generateWishMessage(String name) {
//        DayOfWeek dayOfWeek = ldt.getDayOfWeek();
//        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
//            return "Happy WeekEnd " + name;
//        } else {
//            return "Happy Working Day " + name;
//        }

    }
