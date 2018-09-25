package com.bing.lan.hibernate.day03._05_many2many;

import com.bing.lan.hibernate.utils.HibernateUtil;
import com.bing.lan.hibernate.utils.IDAOTest;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 * Created by 蓝兵 on 2018/9/25.
 */

public class Many2manyTest implements IDAOTest {

    @Before
    public void testSave() {
        Student s1 = new Student();
        s1.setName("s1");

        Student s2 = new Student();
        s2.setName("s2");

        Teacher t1 = new Teacher();
        t1.setName("t1");

        Teacher t2 = new Teacher();
        t2.setName("t2");

        s1.getTeachers().add(t1);
        s1.getTeachers().add(t2);

        s2.getTeachers().add(t1);
        s2.getTeachers().add(t2);

        t1.getStudents().add(s1);
        t1.getStudents().add(s2);

        t2.getStudents().add(s1);
        t2.getStudents().add(s2);

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        session.save(t1);
        session.save(t2);

        session.save(s1);
        session.save(s2);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGet() {
        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        Teacher t1 = session.get(Teacher.class, 1l);
        Set<Student> ss = t1.getStudents();

        System.out.println("testGet(): " + t1);
        System.out.println("testGet(): " + ss);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void testUpdate() {

    }

    @Override
    public void testDelete() {

    }

    @Override
    public void testList() {

    }
}
