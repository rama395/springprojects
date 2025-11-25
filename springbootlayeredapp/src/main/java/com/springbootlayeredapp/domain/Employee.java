package com.springbootlayeredapp.domain;

//EmployeeID,FirstName,LastName ,HireDate,Salary,Designation, DeptId

import lombok.Data;

@Data
public class Employee
{
    private Integer eId;
    private String eFName;
    private String eLName;
    private Double eSalary;
    private String designation;
    private Integer deptId;
    private Double grossSalary;
    private Double netSalary;
}
