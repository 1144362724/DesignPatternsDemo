package com.company.行为型.mediatorMode.core;

import java.util.Date;

/**
 * @author MGARY
 * @date 2019-11-28 下午4:24
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
