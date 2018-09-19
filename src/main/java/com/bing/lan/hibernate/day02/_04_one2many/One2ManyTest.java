package com.bing.lan.hibernate.day02._04_one2many;

import com.bing.lan.hibernate.utils.HibernateUtil;
import com.bing.lan.hibernate.utils.IDAOTest;

import org.hibernate.Session;
import org.junit.Test;

import java.util.Set;

public class One2ManyTest implements IDAOTest {

    @Test
    public void testSave() {

        Employee e1 = new Employee();
        e1.setName("e1");

        Employee e2 = new Employee();
        e2.setName("e2");

        Department d = new Department();
        d.setName("d");

        d.getEmps().add(e1);
        d.getEmps().add(e2);

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        session.save(e1);
        session.save(d);
        session.save(e2);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGet() {

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        Department department = session.get(Department.class, 1l);
        Set<Employee> emps = department.getEmps();


        System.out.println("testGet(): " + department);
        System.out.println("testGet(): " + emps);

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
