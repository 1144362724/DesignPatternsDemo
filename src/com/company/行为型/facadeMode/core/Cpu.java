package com.company.行为型.facadeMode.core;

/**
 * @author MGARY
 * @date 2019-11-25 下午4:25
 */
public class Cpu implements Computer {
    @Override
    public void open() {
        System.out.println("启动CPU");
    }
}
