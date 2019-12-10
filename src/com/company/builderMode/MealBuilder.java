package com.company.builderMode;

import com.company.builderMode.core.ChickenBurger;
import com.company.builderMode.core.Coke;
import com.company.builderMode.core.Pepsi;
import com.company.builderMode.core.VegBurger;

/**
 * @author MGARY
 * @date 2019-11-26 下午5:25
 */
public class MealBuilder {

    /**
     * 素菜套餐
     * @return
     */
    Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 非素菜套餐
     * @return
     */
    Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
