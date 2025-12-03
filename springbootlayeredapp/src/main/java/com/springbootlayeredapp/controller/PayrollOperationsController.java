package com.springbootlayeredapp.controller;

import com.springbootlayeredapp.domain.Employee;
import com.springbootlayeredapp.exception.EmployeeException;
import com.springbootlayeredapp.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("payroll")
@Slf4j
public class PayrollOperationsController {
    @Autowired
    private EmployeeService service;

    public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
        try {
            //use service
            return service.fetchEmployeesByDesgs(desg1, desg2, desg3);
        } catch (EmployeeException e) {
            log.error("fetch employees failed in controller");
            throw new EmployeeException("fetch employees failed in controller", e);


        }

    }

    public void addEmployee(Employee emp) {
        try {
            service.addEmployee(emp);
        } catch (EmployeeException e) {
            log.error("adding employee failed");
            throw new EmployeeException("adding employee failed", e);
        }
    }

}
