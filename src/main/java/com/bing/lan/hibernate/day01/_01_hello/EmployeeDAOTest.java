package com.bing.lan.hibernate.day01._01_hello;

import org.junit.Test;

import java.util.Date;
import java.util.List;

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

    @Test
    public void testGet() {
        Employee employee = dao.get(2l);
        System.out.println("testGet(): " + employee);
    }

    @Test
    public void testUpdate() {
        Employee employee = dao.get(1l);
        System.out.println("testUpdate(): " + employee);
        employee.setName("update");
        dao.update(employee);

        Employee employee1 = dao.get(1l);
        System.out.println("testUpdate(): " + employee1);
        System.out.println("testUpdate(): " + (employee1 == employee));
    }

    @Test
    public void testDelete() {
        dao.delete(2l);
    }

    @Test
    public void testList() {
        List<Employee> list = dao.list();
        System.out.println("testList(): " + list);
    }
}
