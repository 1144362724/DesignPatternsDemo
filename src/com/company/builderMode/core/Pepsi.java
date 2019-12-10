package com.company.builderMode.core;

import com.company.builderMode.core.item.ColdDrink;

/**
 * 百事可乐
 * @author MGARY
 * @date 2019-11-26 下午5:15
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
