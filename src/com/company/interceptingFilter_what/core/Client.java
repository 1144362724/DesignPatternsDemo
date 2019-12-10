package com.company.interceptingFilter_what.core;

/**
 * @author MGARY
 * @date 2019-11-29 下午4:08
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
