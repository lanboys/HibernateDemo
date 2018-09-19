package com.bing.lan.hibernate.day02._04_one2many;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 蓝兵 on 2018/9/19.
 */

public class Department {

    private Long id;
    private String name;
    private Set<Employee> emps=new HashSet<>();

    public Set<Employee> getEmps() {
        return emps;
    }

    public void setEmps(Set<Employee> emps) {
        this.emps = emps;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
