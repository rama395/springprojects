package com.springbootlayeredapp.service;

import com.springbootlayeredapp.domain.Employee;
import com.springbootlayeredapp.exception.EmployeeException;

import java.util.List;

public interface EmployeeService
{
    public List<Employee> fetchEmployeesByDesgs(String desg1,String desg2,String desg3)throws EmployeeException;
    public void addEmployee(Employee emp) throws EmployeeException;
}
