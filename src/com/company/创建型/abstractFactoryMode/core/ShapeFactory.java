package com.company.创建型.abstractFactoryMode.core;

import com.company.创建型.abstractFactoryMode.core.color.Color;
import com.company.创建型.abstractFactoryMode.core.square.Circle;
import com.company.创建型.abstractFactoryMode.core.square.Rectangle;
import com.company.创建型.abstractFactoryMode.core.square.Shape;
import com.company.创建型.abstractFactoryMode.core.square.Square;

/**
 * @author MGARY
 * @date 2019-11-25 下午4:23
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String  shapeType){
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            if(shapeType == null){
                return null;
            }
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
       }
        return null;
    }

}
