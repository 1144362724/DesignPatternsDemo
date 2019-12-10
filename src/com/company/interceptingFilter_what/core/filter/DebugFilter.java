package com.company.interceptingFilter_what.core.filter;

/**
 * @author MGARY
 * @date 2019-11-29 下午4:07
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
