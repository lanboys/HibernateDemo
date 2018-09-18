package com.bing.lan.hibernate.day02._02_session;

import com.bing.lan.hibernate.utils.HibernateUtil;
import com.bing.lan.hibernate.utils.IDAOTest;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 蓝兵 on 2018/9/18.
 */

public class SessionDomainTest implements IDAOTest {

    @Before
    public void testSave() {
        SessionDomain sessionDomain = new SessionDomain();
        sessionDomain.setId(2l);
        sessionDomain.setName("sessionDomainName2");

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        session.saveOrUpdate(sessionDomain);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGet() {

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        //SessionDomain sessionDomain = session.get(SessionDomain.class, 1l);
        SessionDomain sessionDomain = session.load(SessionDomain.class, 1l);
        System.out.println("testGet() --------------------");
        System.out.println("testGet(): " + sessionDomain);
        System.out.println("testGet(): " + sessionDomain.getClass());

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testUpdate() {

    }

    @Test
    public void testDelete() {

    }

    @Override
    public void testList() {

    }
}
