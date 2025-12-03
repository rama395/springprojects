package com.springcore.springbeanlifecycle.sbeans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component("marriage")
//@PropertySource("src\\main\\resources\\application.properties")
public class CheckingMarriageEligibility
{
    @Value("${male.name}")
    private String name;
    @Value("${male.age}")
    private Integer age;
    @Value("${legal.marriage.maleage}")
    private Integer lmage;
    @Value("${female.name}")
    private String fname;
    @Value("${female.age}")
    private Integer fage;
    @Value("${legal.marriage.femaleage}")
    private Integer lfage;

    private Date sysDate;

    public CheckingMarriageEligibility()
    {
        System.out.println("checking marriage eligibility::0-param constructor");
    }
    @PostConstruct//initialise lifecycle method
    public void myInit()
    {
        System.out.println("checking marriage eligibility.myInit()");
        //initialise leftover properties that had not participated in injections
        sysDate=new Date();
        //validation logic
        if(name==null||age<=0 && fname==null ||fage<=0)
        {
            throw new IllegalArgumentException("set correct values to age & name properties ");
        }
    }
    //business method
    public String checkEligibility()
    {
        System.out.println("checking marriage eligibility.checkEligibility()");
        if(age>=lmage && fage>=lfage)
        {
            return "you both are elgibile for marriage:MR. "+name+",MISS. "+fname+" verified on "+sysDate;
        }
        else
        {
            return "you both are not elgibile for marriage:MR. "+name+",MISS. "+fname+" verified on "+sysDate;
        }
    }
    @PreDestroy
    public void myDestroy()
    {
        System.out.println("checking marriage eligibility.myDestroy()");
        //nullifying bean properties
        name=null;
        age=null;
        lmage=null;
        fname=null;
        fage=null;
        lfage=null;
        sysDate=null;
    }
}
