package com.springcore.springbeanlifecycle;

import com.springcore.springbeanlifecycle.sbeans.CheckingMarriageEligibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBeanLifeCycleTest implements CommandLineRunner
{

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
//        CheckingMarriageEligibility marriageEligibility= ctx.getBean("marriage",CheckingMarriageEligibility.class);
//        try{
//            String result= marriageEligibility.checkEligibility();
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ctx.close();
//    }


    @Autowired
    private CheckingMarriageEligibility eligibility;
    public static void main(String[] args) {
        SpringApplication.run(SpringBeanLifeCycleTest.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        eligibility.checkEligibility();
        System.out.println(eligibility.checkEligibility());

    }
}
