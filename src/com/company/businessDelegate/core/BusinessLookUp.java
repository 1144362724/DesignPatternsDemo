package com.company.businessDelegate.core;

/**
 * @author MGARY
 * @date 2019-11-29 下午1:39
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
