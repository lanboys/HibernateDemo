package com.bing.lan.hibernate.day02._05_many2one2many;

import com.bing.lan.hibernate.utils.HibernateUtil;
import com.bing.lan.hibernate.utils.IDAOTest;

import org.hibernate.Session;
import org.junit.Test;

public class Many2One2ManyTest implements IDAOTest {

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
