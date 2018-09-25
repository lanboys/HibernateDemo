package com.bing.lan.hibernate.day03._05_many2many;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 蓝兵 on 2018/9/25.
 */

public class Student {

    private Long id;
    private String name;

    private Set<Teacher> teachers = new HashSet<>();

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

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
