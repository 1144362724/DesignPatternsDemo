package com.company.businessDelegate.core;

/**
 * @author MGARY
 * @date 2019-11-29 下午1:45
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
