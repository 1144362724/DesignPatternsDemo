package com.company.行为型.stateMode.core;

/**
 * @author MGARY
 * @date 2019-11-28 下午5:26
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
