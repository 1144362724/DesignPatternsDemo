package com.company.businessDelegate.core;

/**
 * @author MGARY
 * @date 2019-11-29 下午1:27
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }

}
