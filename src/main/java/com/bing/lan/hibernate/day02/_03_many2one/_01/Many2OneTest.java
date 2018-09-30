package com.bing.lan.hibernate.day02._03_many2one._01;

import com.bing.lan.hibernate.utils.HibernateUtil;
import com.bing.lan.hibernate.utils.IDAOTest;

import org.hibernate.Session;
import org.junit.Test;

public class Many2OneTest implements IDAOTest {

    @Test
    public void testSave() {

        Employee e1 = new Employee();
        e1.setName("e1");

        Employee e2 = new Employee();
        e2.setName("e2");

        Department d = new Department();
        d.setName("d");

        e1.setDepartment(d);
        e2.setDepartment(d);

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(d);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGet() {

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        Employee employee = session.get(Employee.class, 1l);
        Department department = employee.getDepartment();
        System.out.println("testGet(): " + department);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testList() {
    }
}
