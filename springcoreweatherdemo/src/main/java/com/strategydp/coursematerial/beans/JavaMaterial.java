package com.strategydp.coursematerial.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("java")
@Scope("prototype")
//@Slf4j
public final class JavaMaterial implements ICourseMaterial {
    @Override
    public void distributes() {
        System.out.println("JavaMaterial is distributed");
    }


}
