package com.company.interceptingFilter_what.core.filter;

/**
 * 创建实体过滤器。
 * @author MGARY
 * @date 2019-11-29 下午4:07
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("请求日志: " + request);
    }
}
