package com.company.行为型.visitorMode_what.core;

/**
 * 访问者
 * @author MGARY
 * @date 2019-11-29 上午11:37
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
