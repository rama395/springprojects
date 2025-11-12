package com.strategydp.cricketbatbrands.beans;

import org.springframework.stereotype.Component;

@Component("nb")
public final class NBCricketBat implements IcricketBat
{
    @Override
    public String runs(int run)
    {
        return  "runs made by NBC cricket bat : "+run;
    }

}
