package com.company.builderMode.core;

import com.company.builderMode.core.item.Burger;

/**
 * 鸡肉汉堡
 * @author MGARY
 * @date 2019-11-26 下午5:15
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
