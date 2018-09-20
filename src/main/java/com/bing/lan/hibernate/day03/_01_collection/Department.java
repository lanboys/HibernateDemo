package com.bing.lan.hibernate.day03._01_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 蓝兵 on 2018/9/19.
 */

public class Department {

    private Long id;
    private String name;
    private List<Employee> emps = new ArrayList<>();

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
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
