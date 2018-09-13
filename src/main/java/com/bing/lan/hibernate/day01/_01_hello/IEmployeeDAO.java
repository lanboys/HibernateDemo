package com.bing.lan.hibernate.day01._01_hello;

interface IEmployeeDAO {

    void save(Employee employee);

    Employee get(Long id);

    void update(Employee employee);

    void delete(Long id);
}
