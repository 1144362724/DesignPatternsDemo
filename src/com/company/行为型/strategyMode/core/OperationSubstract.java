package com.company.行为型.strategyMode.core;

/**
 * @author MGARY
 * @date 2019-11-29 上午10:21
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
