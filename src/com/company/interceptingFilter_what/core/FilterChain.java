package com.company.interceptingFilter_what.core;

import com.company.interceptingFilter_what.core.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MGARY
 * @date 2019-11-29 下午4:08
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
