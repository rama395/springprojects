package com.strategydp.coursematerial.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public final class Student implements ApplicationContextAware
{
    ApplicationContext applicationContext;

    @Autowired
    @Qualifier("java")
    private ICourseMaterial icourseMaterial;

    //b.method
    public void studying()
    {
       // ICourseMaterial icourseMaterial=applicationContext.getBean("java", ICourseMaterial.class);
        icourseMaterial.distributes();
        log.info("java hashcode: "+icourseMaterial.hashCode());
        System.out.println("material is distributed");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;

    }
}
