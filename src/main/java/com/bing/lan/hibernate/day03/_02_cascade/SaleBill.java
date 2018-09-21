package com.bing.lan.hibernate.day03._02_cascade;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 蓝兵 on 2018/9/21.
 */

public class SaleBill {

    private Long id;
    private String sn;
    private Date inputTime;

    private Set<SaleBillItem> items = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public Set<SaleBillItem> getItems() {
        return items;
    }

    public void setItems(Set<SaleBillItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SaleBill{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", inputTime=" + inputTime +
                ", items=" + items +
                '}';
    }
}
