package com.company.interceptingFilter_what.core;

import com.company.interceptingFilter_what.core.filter.Filter;

/**
 * @author MGARY
 * @date 2019-11-29 下午4:08
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
