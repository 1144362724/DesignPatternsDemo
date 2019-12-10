package com.company.builderMode.core;

import com.company.builderMode.core.item.Burger;

/**
 * 蔬菜汉堡
 * @author MGARY
 * @date 2019-11-26 下午5:15
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
