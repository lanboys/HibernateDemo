package com.bing.lan.hibernate.day03._03_one2one._01;

/**
 * Created by 蓝兵 on 2018/9/25.
 */

public class QQZone {

    private Long id;
    private String title;
    private QQNumber qqnumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public QQNumber getQqnumber() {
        return qqnumber;
    }

    public void setQqnumber(QQNumber qqnumber) {
        this.qqnumber = qqnumber;
    }

    @Override
    public String toString() {
        return "QQZone{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", qqnumber=" + qqnumber +
                '}';
    }
}
