package com.company.创建型.abstractFactoryMode.core;

import com.company.创建型.abstractFactoryMode.core.color.Color;
import com.company.创建型.abstractFactoryMode.core.square.Shape;

/**
 * @author MGARY
 * @date 2019-11-25 下午9:33
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
