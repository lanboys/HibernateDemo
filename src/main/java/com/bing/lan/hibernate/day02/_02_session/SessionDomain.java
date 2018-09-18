package com.bing.lan.hibernate.day02._02_session;

/**
 * Created by 蓝兵 on 2018/9/18.
 */

public class SessionDomain {

    private Long id;
    private String name;

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
        return "SessionDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
