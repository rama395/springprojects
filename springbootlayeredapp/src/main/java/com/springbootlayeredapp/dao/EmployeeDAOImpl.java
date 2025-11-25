package com.springbootlayeredapp.dao;

import com.springbootlayeredapp.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
    private static final String GET_EMPS_QUERY = "SELECT EmployeeID,FirstName,LastName ,HireDate,Salary,Designation, DeptId from employee where designation in(?,?,?) order by designation";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getEmployeeesByDesgs(String desg1, String desg2, String desg3) throws Exception {


        List<Employee> employees = jdbcTemplate.query(GET_EMPS_QUERY, (rs, rowNum) -> {
            Employee emp = new Employee();
            emp.setEId(rs.getInt("EmployeeID"));
            emp.setEFName(rs.getString( "FirstName"));
            emp.setELName(rs.getString("LastName"));
            emp.setDesignation(rs.getString("Designation"));
            emp.setESalary(rs.getDouble("Salary"));
            emp.setDeptId(rs.getInt("DeptId"));
            return emp;
        },new Object[]{desg1,desg2,desg3});
        return employees;
    }

//    @Override
//    public List<Employee> getEmployeeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
//        List<Employee> list = new ArrayList<>();
//        try (Connection con = ds.getConnection();//gives pooled jdbc con obj
//             PreparedStatement ps = con.prepareStatement(GET_EMPS_QUERY);) {
//            //set values to query params
//            ps.setString(1, desg1);
//            ps.setString(2, desg2);
//            ps.setString(3, desg3);
//            //execute the sql query
//            try (ResultSet rs = ps.executeQuery()) {
//                //copy each record of the resultset obj to model class obj
//                while (rs.next()) {
//                    //copy each record to emp class obj
//                    Employee emp = new Employee();
//                    emp.setEId(rs.getInt( "EmployeeID"));
//                    emp.setEFName(rs.getString( "FirstName"));
//                    emp.setELName(rs.getString("LastName"));
//                    emp.setDesignation(rs.getString("Designation"));
//                    emp.setESalary(rs.getDouble("Salary"));
//                    emp.setDeptId(rs.getInt("DeptId"));
//                    //add each model class obj to rs
//                    list.add(emp);
//                }
//            }
//        } catch (SQLException se) {
//            se.printStackTrace();
//            throw se;//exception rethrowing for exception propogation
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw e;
//        }
//        return list;
//
//    }
}
