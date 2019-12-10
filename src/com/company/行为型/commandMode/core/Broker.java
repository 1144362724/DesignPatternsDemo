package com.company.行为型.commandMode.core;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类。
 * @author MGARY
 * @date 2019-11-28 下午2:55
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
