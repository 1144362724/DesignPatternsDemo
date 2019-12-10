package com.company.nullObjectModea.core;

/**
 * @author MGARY
 * @date 2019-11-29 上午9:37
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

}
