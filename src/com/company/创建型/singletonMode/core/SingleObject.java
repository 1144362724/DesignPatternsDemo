package com.company.创建型.singletonMode.core;

/**
 * 普通单例模式
 * @author MGARY
 * @date 2019-11-26 上午10:06
 */
public class SingleObject {


    /**
     * 创建 SingleObject 的一个对象
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObject() {
    }


    /**
     * 获取唯一可用的对象
     *
     * @return SingleObject
     */
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }
}
