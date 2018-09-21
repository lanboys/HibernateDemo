package com.bing.lan.hibernate.day03._02_cascade;

import com.bing.lan.hibernate.utils.IObjectDAO;

/**
 * Created by 蓝兵 on 2018/9/21.
 */

public interface ISaleBillDAO extends IObjectDAO<SaleBill> {

    void update2(SaleBill obj);
}
