package com.bing.lan.hibernate.day03._02_cascade;

/**
 * Created by 蓝兵 on 2018/9/21.
 */

public class SaleBillItem {

    private Long id;
    private String product;
    private SaleBill bill;

    public SaleBillItem() {
    }

    public SaleBillItem(String product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public SaleBill getBill() {
        return bill;
    }

    public void setBill(SaleBill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "SaleBillItem{" +
                "id=" + id +
                ", product='" + product + '\'' +
                '}';
    }
}
