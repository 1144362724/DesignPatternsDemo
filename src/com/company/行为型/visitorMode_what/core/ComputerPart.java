package com.company.行为型.visitorMode_what.core;

/**
 * 元素的接口。
 * @author MGARY
 * @date 2019-11-29 上午11:35
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
