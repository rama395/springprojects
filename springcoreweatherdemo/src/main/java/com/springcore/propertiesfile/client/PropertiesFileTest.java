package com.springcore.propertiesfile.client;

import com.springcore.propertiesfile.beans.PersonInfo;
import com.springcore.propertiesfile.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class PropertiesFileTest
{
    public static void main(String[] args) {
        //create IOC container
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        //get spring bean class obj ref
        PersonInfo info=ctx.getBean("pInfo",PersonInfo.class);
       log.info(info.toString());
    }
}
