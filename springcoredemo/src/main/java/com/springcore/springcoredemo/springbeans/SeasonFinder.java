package com.springcore.springcoredemo.springbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SeasonFinder {
    @Autowired
    private LocalDate localDate;

    public String seasonFinder() {
        int month = localDate.getMonthValue();
        if (month >= 3 && month <= 6) {
            return "Summer Season ";
        } else if (month >= 7 && month <= 10) {
            return "Rainy Season";

        } else {
            return "Winter Season";
        }
    }

}
