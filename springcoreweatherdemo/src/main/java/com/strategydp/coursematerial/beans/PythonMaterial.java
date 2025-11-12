package com.strategydp.coursematerial.beans;

import org.springframework.stereotype.Component;

@Component("python")
//@Slf4j
public final class PythonMaterial implements ICourseMaterial {
    @Override
    public void distributes()
    {
        System.out.println("PythonMaterial is distributed");
    }
}
