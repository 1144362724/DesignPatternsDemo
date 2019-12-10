package com.company.行为型.mediatorMode.core;

/**
 * @author MGARY
 * @date 2019-11-28 下午4:24
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
