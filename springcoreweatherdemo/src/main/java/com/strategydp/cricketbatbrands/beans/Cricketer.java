package com.strategydp.cricketbatbrands.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("ckt")
public final class Cricketer
{
    @Autowired
    @Qualifier("ss")
    private IcricketBat bat;

    public String batting()
    {
        //generate the random number for runs
        int run=new Random().nextInt(100);
        //runs made by cricketbat brands
        String msg=bat.runs(run);
        return msg;
    }

}
