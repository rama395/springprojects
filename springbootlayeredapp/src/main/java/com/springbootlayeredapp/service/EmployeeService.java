package com.springbootlayeredapp.service;

import com.springbootlayeredapp.domain.Employee;

import java.util.List;

public interface EmployeeService
{
    public List<Employee> fetchEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception;
}
