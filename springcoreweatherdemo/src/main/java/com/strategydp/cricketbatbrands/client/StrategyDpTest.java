package com.strategydp.cricketbatbrands.client;

import com.strategydp.cricketbatbrands.beans.Cricketer;
import com.strategydp.cricketbatbrands.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class StrategyDpTest
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Cricketer ct=ctx.getBean("ckt",Cricketer.class);
        String resultMsg=ct.batting();
       log.info(resultMsg);
        ctx.close();
    }
}
