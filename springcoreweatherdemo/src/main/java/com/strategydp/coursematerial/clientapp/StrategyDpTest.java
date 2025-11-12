package com.strategydp.coursematerial.clientapp;

import com.strategydp.coursematerial.beans.Student;
import com.strategydp.coursematerial.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StrategyDpTest
{
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        //get target spring bean class obj
        Student st=ctx.getBean("student",Student.class);
        //invoke b.method
       st.studying();
       st.studying();
       ctx.close();
        
    }
}
