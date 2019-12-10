package com.company.nullObjectModea.core;

/**
 * @author MGARY
 * @date 2019-11-29 上午9:37
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }

}
