package com.springbootlayeredapp.controller;

import com.springbootlayeredapp.domain.Employee;
import com.springbootlayeredapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("payroll")
public class PayrollOperationsController
{
    @Autowired
    private EmployeeService service;
    public List<Employee> showAllEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception
    {
        //use service
        List<Employee> list=service.fetchEmployeesByDesgs(desg1,desg2,desg3);
        return list;
    }

}
