package com.bing.lan.hibernate.day03._03_one2one._01;

import com.bing.lan.hibernate.utils.HibernateUtil;
import com.bing.lan.hibernate.utils.IDAOTest;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 蓝兵 on 2018/9/25.
 */

public class One2OneTest implements IDAOTest {

    @Before
    public void testSave() {
        QQNumber qqNumber = new QQNumber();
        qqNumber.setQq("qq1069");

        QQZone qqZone = new QQZone();
        qqZone.setTitle("zonetitle");

        qqNumber.setZone(qqZone);
        qqZone.setQqnumber(qqNumber);

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        session.save(qqZone);
        session.save(qqNumber);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGet() {
        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        QQNumber qqNumber = session.get(QQNumber.class, 7l);
        QQZone zone = qqNumber.getZone();
        System.out.println("testGet(): " + zone);

        session.getTransaction().commit();
        session.close();
    }
    @Test
    public void testGet2() {
        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        QQZone qqZone = session.get(QQZone.class, 1l);
        QQNumber qqNumber = qqZone.getQqnumber();
        System.out.println("testGet2(): " + qqNumber);

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
