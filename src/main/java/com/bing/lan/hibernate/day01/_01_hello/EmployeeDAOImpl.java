package com.bing.lan.hibernate.day01._01_hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAOImpl implements IEmployeeDAO {

    public void save(Employee employee) {

        //启动框架，读取配置文件 hibernate.cfg.xml
        Configuration cfg = new Configuration().configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // 开启事务
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        // 提交事务
        transaction.commit();
        session.close();

        sessionFactory.close();
    }

    public Employee get(Long id) {
        return null;
    }

    public void update(Employee employee) {

    }

    public void delete(Long id) {

    }
}
