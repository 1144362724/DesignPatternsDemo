package com.company.builderMode.core.item;

import com.company.builderMode.core.packing.Bottle;
import com.company.builderMode.core.packing.Packing;

/**
 * 冷饮
 * @author MGARY
 * @date 2019-11-26 下午5:11
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
