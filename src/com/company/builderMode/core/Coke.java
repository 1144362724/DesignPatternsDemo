package com.company.builderMode.core;

import com.company.builderMode.core.item.ColdDrink;

/**
 * 可乐
 * @author MGARY
 * @date 2019-11-26 下午5:15
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
