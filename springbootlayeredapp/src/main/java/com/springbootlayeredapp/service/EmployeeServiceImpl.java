package com.springbootlayeredapp.service;

import com.springbootlayeredapp.dao.EmployeeDAO;
import com.springbootlayeredapp.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO dao;

    @Override
    public List<Employee> fetchEmployeesByDesgs(String desg1,String desg2,String desg3) throws Exception
    {
        //convert desgs to uppercase letters
        desg1=desg1.toLowerCase();
        desg2=desg2.toLowerCase();
        desg3=desg3.toLowerCase();

        //use dao
        List<Employee> list=dao.getEmployeeesByDesgs(desg1,desg2,desg3);
        //calculate netsalary and gross salary
        list.forEach(emp->{
            emp.setGrossSalary(emp.getESalary()+(emp.getESalary()*0.5));
            emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));
        });
        return list;
    }

}
