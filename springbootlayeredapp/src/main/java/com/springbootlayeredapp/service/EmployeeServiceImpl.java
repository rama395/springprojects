package com.springbootlayeredapp.service;

import com.springbootlayeredapp.dao.EmployeeDAO;
import com.springbootlayeredapp.domain.Employee;
import com.springbootlayeredapp.exception.EmployeeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO dao;

    @Override
    public List<Employee> fetchEmployeesByDesgs(String desg1, String desg2, String desg3) throws EmployeeException {
        //convert desgs to uppercase letters

        try {
            desg1 = desg1.toLowerCase();
            desg2 = desg2.toLowerCase();
            desg3 = desg3.toLowerCase();
            //use dao
            List<Employee> list = dao.fetchEmployeesByDesgs(desg1, desg2, desg3);
            //calculate netsalary and gross salary
            list.forEach(emp -> {
                emp.setGrossSalary(emp.getESalary() + (emp.getESalary() * 0.5));
                emp.setNetSalary(emp.getGrossSalary() - (emp.getGrossSalary() * 0.2));
            });
            return list;
        } catch (Exception e) {
            log.error("fetch failed in service");
            throw new EmployeeException("fetch failed in service", e);

        }
    }

    @Override
    public void addEmployee(Employee emp) throws EmployeeException {
        try {
            dao.addEmployee(emp);
        } catch (Exception e) {
            log.error("insert failed in service for employeeid:{}", emp.getEId());
            throw new EmployeeException("insert failed in service", e);
        }
    }

}
