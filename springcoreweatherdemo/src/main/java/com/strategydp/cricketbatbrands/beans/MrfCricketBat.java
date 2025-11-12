package com.strategydp.cricketbatbrands.beans;

import org.springframework.stereotype.Component;

@Component("mrf")
public final class MrfCricketBat implements IcricketBat
{
    @Override
    public String runs(int run)
    {
         return "runs made by Mrf cricket bat : "+run ;
    }

}
