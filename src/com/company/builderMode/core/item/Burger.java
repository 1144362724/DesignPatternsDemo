package com.company.builderMode.core.item;

import com.company.builderMode.core.packing.Packing;
import com.company.builderMode.core.packing.Wrapper;

/**
 * 汉堡包
 * @author MGARY
 * @date 2019-11-26 下午5:11
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
