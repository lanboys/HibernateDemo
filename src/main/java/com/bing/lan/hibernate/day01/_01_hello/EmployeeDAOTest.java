package com.bing.lan.hibernate.day01._01_hello;

import org.junit.Test;

import java.util.Date;

public class EmployeeDAOTest {

    private IEmployeeDAO dao;

    public EmployeeDAOTest() {
        this.dao = new EmployeeDAOImpl();
    }

    @Test
    public void testSave() {
        Employee employee = new Employee();
        employee.setAge(11);
        employee.setHireDate(new Date());
        employee.setName("xiao ming");
        dao.save(employee);
    }
}
