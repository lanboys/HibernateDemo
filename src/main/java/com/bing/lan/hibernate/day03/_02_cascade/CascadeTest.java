package com.bing.lan.hibernate.day03._02_cascade;

import com.bing.lan.hibernate.utils.IDAOTest;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by 蓝兵 on 2018/9/21.
 */

public class CascadeTest implements IDAOTest {

    private ISaleBillDAO dao;

    public CascadeTest() {
        dao = new SaleBillDAOImpl();
    }

    @Before
    public void testSave() {
        SaleBill saleBill = new SaleBill();
        saleBill.setSn("0001");
        saleBill.setInputTime(new Date());

        SaleBillItem p1 = new SaleBillItem("p1");
        SaleBillItem p2 = new SaleBillItem("p2");
        SaleBillItem p3 = new SaleBillItem("p3");

        p1.setBill(saleBill);
        p2.setBill(saleBill);
        p3.setBill(saleBill);

        saleBill.getItems().add(p1);
        saleBill.getItems().add(p2);
        saleBill.getItems().add(p3);

        dao.save(saleBill);
    }

    @Test
    public void testDelete() {
        dao.delete(1l);
    }

    @Test
    public void testGet() {
        dao.get(1l);
    }

    @Test
    public void testUpdate() {
        SaleBill saleBill = dao.get(1l);

        SaleBillItem item = new SaleBillItem("p-new");
        item.setBill(saleBill);
        saleBill.getItems().add(item);

        dao.update(saleBill);
    }

    @Test
    public void testUpdate2() {
        SaleBill saleBill = dao.get(1l);

        SaleBillItem item = saleBill.getItems().iterator().next();

        saleBill.getItems().remove(item);

        dao.update2(saleBill);
    }

    @Test
    public void testList() {

    }
}
