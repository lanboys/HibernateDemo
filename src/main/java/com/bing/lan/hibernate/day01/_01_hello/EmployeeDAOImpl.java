package com.bing.lan.hibernate.day01._01_hello;

import com.bing.lan.hibernate.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeDAOImpl implements IEmployeeDAO {

    public void save(Employee employee) {

        Session session = HibernateUtil.getInstance().openSession();
        // 开启事务
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        // 提交事务
        transaction.commit();
        session.close();
    }

    public Employee get(Long id) {
        Session session = HibernateUtil.getInstance().openSession();
        Employee employee = session.get(Employee.class, id);
        session.close();
        return employee;
    }

    public void update(Employee employee) {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(employee);
        transaction.commit();
        session.close();
    }

    public void delete(Long id) {
        Employee employee = new Employee();
        employee.setId(id);

        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();

        //这个对象一定要有主键
        session.delete(employee);

        transaction.commit();
        session.close();
    }

    @Override
    public List<Employee> list() {

        Session session = HibernateUtil.getInstance().openSession();

        Query query = session.createQuery("select e from Employee e");

        List<Employee> list = query.list();

        session.close();
        return list;
    }
}
