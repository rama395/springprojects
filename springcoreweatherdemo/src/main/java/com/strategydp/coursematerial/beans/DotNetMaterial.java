package com.strategydp.coursematerial.beans;

import org.springframework.stereotype.Component;

@Component("dNet")
public final class DotNetMaterial implements ICourseMaterial {
    @Override
    public void distributes() {
        System.out.println("DotNetMaterial is distributed");
    }

}
