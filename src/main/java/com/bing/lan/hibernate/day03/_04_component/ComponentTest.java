package com.bing.lan.hibernate.day03._04_component;

import com.bing.lan.hibernate.utils.HibernateUtil;
import com.bing.lan.hibernate.utils.IDAOTest;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 蓝兵 on 2018/9/25.
 */

public class ComponentTest implements IDAOTest {

    @Before
    public void testSave() {

        Company company = new Company();
        company.setName("xmg");

        Address address = new Address();
        address.setProvince("gd");
        address.setCity("gz");
        address.setStreet("zj");

        Address regAddress = new Address();
        regAddress.setProvince("sc");
        regAddress.setCity("cd");
        regAddress.setStreet("ss");

        company.setAddress(address);
        company.setRegAddress(regAddress);

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        session.save(company);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGet() {

        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        Company company = session.get(Company.class, 1l);
        System.out.println("testGet(): " + company);

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
