package com.strategydp.cricketbatbrands.beans;

import org.springframework.stereotype.Component;

@Component("ss")
public final class SSCricketBat implements IcricketBat
{
    @Override
    public String runs(int run)
    {
        return "runs made by SScricketbat: "+run;
    }

}
