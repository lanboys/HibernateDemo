package com.bing.lan.hibernate.day03._02_cascade;

import com.bing.lan.hibernate.utils.HibernateUtil;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 蓝兵 on 2018/9/21.
 */

public class SaleBillDAOImpl implements ISaleBillDAO {

    @Override
    public void save(SaleBill obj) {
        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        session.save(obj);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public SaleBill get(Long id) {
        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        SaleBill saleBill = session.get(SaleBill.class, id);
        Hibernate.initialize(saleBill.getItems());

        session.getTransaction().commit();
        session.close();

        return saleBill;
    }

    @Override
    public void update2(SaleBill saleBill) {
        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        SaleBill oldSaleBill = session.get(SaleBill.class, saleBill.getId());
        List<SaleBillItem> deletes = new ArrayList<>();

        for (SaleBillItem item : oldSaleBill.getItems()) {
            boolean find = false;
            for (SaleBillItem saleBillItem : saleBill.getItems()) {
                if (saleBillItem.getId() != null && item.getId().equals(saleBillItem.getId())) {
                    find = true;
                    break;
                }
            }
            if (!find) {
                deletes.add(item);
            }
        }

        oldSaleBill.getItems().removeAll(deletes);
        for (SaleBillItem delete : deletes) {
            delete.setBill(null);
        }

        session.update(oldSaleBill);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(SaleBill obj) {
        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        session.update(obj);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Long id) {
        Session session = HibernateUtil.getInstance().openSession();
        session.beginTransaction();

        // 有级联操作 但是没有数据 所以实际上并没有删除
        //SaleBill saleBill = new SaleBill();
        //saleBill.setId(id);

        SaleBill saleBill = session.get(SaleBill.class, id);

        session.delete(saleBill);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<SaleBill> list() {
        return null;
    }
}
