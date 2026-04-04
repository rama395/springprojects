package com.springbootlayeredapp;

import com.springbootlayeredapp.controller.PayrollOperationsController;
import com.springbootlayeredapp.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
@Slf4j
public class SpringbootlayeredappApplication {

    public static void main(String[] args) {
        //get IOC container
        ApplicationContext ctx = SpringApplication.run(SpringbootlayeredappApplication.class, args);
        //get controller class obj ref
        PayrollOperationsController controller = ctx.getBean("payroll", PayrollOperationsController.class);
        //invoke the b.method
        try {
            List<Employee> list = controller.fetchEmployeesByDesgs("CLERK", "MANAGER", "SALESBOY");
            //process the result
            list.forEach(emp -> {
                log.info("emp:{}", emp);
            });
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal problem....try again");
        }
        try {
            Employee emp = new Employee();
            emp.setEId(104);
            emp.setEFName("kevin");
            emp.setELName("smith");
            emp.setESalary(10000d);
            emp.setDesignation("MANAGER");
            emp.setDeptId(20);
            controller.addEmployee(emp);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Internal problem....try again");
        }

    }

}
