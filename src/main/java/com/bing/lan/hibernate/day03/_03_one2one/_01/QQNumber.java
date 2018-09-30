package com.bing.lan.hibernate.day03._03_one2one._01;

/**
 * Created by 蓝兵 on 2018/9/25.
 */

public class QQNumber {

    private Long id;
    private String qq;
    private QQZone zone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public QQZone getZone() {
        return zone;
    }

    public void setZone(QQZone zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "QQNumber{" +
                "id=" + id +
                ", qq='" + qq + '\'' +
                '}';
    }
}
