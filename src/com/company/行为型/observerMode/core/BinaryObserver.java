package com.company.行为型.observerMode.core;

/**
 * 二进制观察者
 *
 * @author MGARY
 * @date 2019-11-28 下午5:17
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
