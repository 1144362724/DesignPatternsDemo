package com.company.interceptingFilter_what.core;

/**
 * @author MGARY
 * @date 2019-11-29 下午4:08
 */
public class Target {
    public void execute(String request){
        System.out.println("执行请求: " + request);
    }
}
