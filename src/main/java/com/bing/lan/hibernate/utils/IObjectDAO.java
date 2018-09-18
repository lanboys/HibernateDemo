package com.bing.lan.hibernate.utils;

import java.util.List;

public interface IObjectDAO<R> {

    void save(R obj);

    R get(Long id);

    void update(R obj);

    void delete(Long id);

    List<R> list();
}
