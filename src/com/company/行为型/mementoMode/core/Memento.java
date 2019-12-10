package com.company.行为型.mementoMode.core;

/**
 * @author MGARY
 * @date 2019-11-28 下午4:39
 */
class Memento {
    private String state;

    Memento(String state){
        this.state = state;
    }

    String getState(){
        return state;
    }
}
