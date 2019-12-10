package com.company.行为型.visitorMode_what.core;

/**
 * @author MGARY
 * @date 2019-11-29 上午11:36
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
