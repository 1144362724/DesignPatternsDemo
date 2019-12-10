package com.company.创建型.prototypeMode;

import com.company.创建型.prototypeMode.core.AbstractShape;
import com.company.创建型.prototypeMode.core.Circle;
import com.company.创建型.prototypeMode.core.Rectangle;
import com.company.创建型.prototypeMode.core.Square;

import java.util.Hashtable;

/**
 * @author MGARY
 * @date 2019-11-27 上午11:16
 */
public class ShapeCache {

    private static Hashtable<String, AbstractShape> shapeMap = new Hashtable<String, AbstractShape>();

    public static AbstractShape getShape(String shapeId) {
        AbstractShape cachedShape = shapeMap.get(shapeId);
        return (AbstractShape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
