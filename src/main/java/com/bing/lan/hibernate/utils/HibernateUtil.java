package com.bing.lan.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by 蓝兵 on 2018/9/17.
 */

public class HibernateUtil {

    private static final HibernateUtil instance = new HibernateUtil();
    private SessionFactory sessionFactory;

    private HibernateUtil() {
        //启动框架，读取配置文件 hibernate.cfg.xml
        Configuration cfg = new Configuration().configure();
        sessionFactory = cfg.buildSessionFactory();
    }

    public static HibernateUtil getInstance() {
        return instance;
    }

    public Session openSession() {
        return sessionFactory.openSession();
    }

    public void closeSessionFactory() {
        if (sessionFactory != null && sessionFactory.isOpen()) {
            sessionFactory.close();
        }
    }
}
