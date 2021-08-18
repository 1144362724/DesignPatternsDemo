package com.company.行为型.observerMode.core;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 * @author MGARY
 * @date 2019-11-28 下午5:15
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    /**
     * 状态
     */
    private int state;

    public int getState() {
        return state;
    }

    /**
     * 设定状态
     * @param state 状态
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 连接
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有观察员
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
