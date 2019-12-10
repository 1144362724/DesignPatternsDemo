package com.company.builderMode.core.item;

import com.company.builderMode.core.packing.Packing;

/**
 * 项目类
 * @author MGARY
 * @date 2019-11-26 下午5:06
 */
public interface Item {
    String name();
    Packing packing();
    float price();


}
