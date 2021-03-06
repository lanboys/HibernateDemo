package com.bing.lan.hibernate.day03._04_component;

/**
 * Created by 蓝兵 on 2018/9/25.
 */

public class Company {

    private Long id;
    private String name;
    private Address address;
    private Address regAddress;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(Address regAddress) {
        this.regAddress = regAddress;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", regAddress=" + regAddress +
                '}';
    }
}
