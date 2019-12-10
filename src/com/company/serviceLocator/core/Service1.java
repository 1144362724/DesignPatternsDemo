package com.company.serviceLocator.core;

/**
 * @author MGARY
 * @date 2019-11-29 下午5:29
 */
public class Service1 implements Service {
    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
