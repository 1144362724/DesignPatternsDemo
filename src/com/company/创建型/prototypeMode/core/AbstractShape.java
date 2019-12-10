package com.company.创建型.prototypeMode.core;

/**
 * 建一个实现了 Cloneable 接口的抽象类。
 * @author MGARY
 * @date 2019-11-27 上午9:51
 */
public  abstract class AbstractShape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();
    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
