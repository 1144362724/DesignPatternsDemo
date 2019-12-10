package com.company.行为型.chainOfResponsibilityMode.core;

/**
 * @author MGARY
 * @date 2019-11-28 上午11:28
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console: " + message);
    }
}
