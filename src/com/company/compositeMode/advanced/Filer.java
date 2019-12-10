package com.company.compositeMode.advanced;

/**
 *
 * @author MGARY
 * @date 2019-11-27 下午4:21
 */
public class Filer extends Node {
    /**
     * 通过构造器为文件节点命名
     * @param name
     */
    public Filer(String name) {
        super(name);
    }

    /**
     * 显示文件节点
     */
    @Override
    public void display() {
        System.out.println(name);
    }
}
