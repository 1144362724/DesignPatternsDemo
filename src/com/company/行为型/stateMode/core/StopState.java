package com.company.行为型.stateMode.core;


/**
 * @author MGARY
 * @date 2019-11-28 下午5:24
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
