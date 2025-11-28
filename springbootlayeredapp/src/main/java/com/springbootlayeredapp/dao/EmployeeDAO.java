package com.springbootlayeredapp.dao;

import com.springbootlayeredapp.domain.Employee;

import java.util.List;

public interface EmployeeDAO
{
    public List<Employee> getEmployeeesByDesgs(String desg1,String desg2,String desg3)throws Exception;
}
