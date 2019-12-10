package com.company.创建型.abstractFactoryMode.core;

import com.company.创建型.abstractFactoryMode.core.color.Blue;
import com.company.创建型.abstractFactoryMode.core.color.Color;
import com.company.创建型.abstractFactoryMode.core.color.Green;
import com.company.创建型.abstractFactoryMode.core.color.Red;
import com.company.创建型.abstractFactoryMode.core.square.Shape;

/**
 * @author MGARY
 * @date 2019-11-25 下午4:23
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String  shapeType){
        return null;
    }

}
