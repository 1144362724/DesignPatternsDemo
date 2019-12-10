package com.company.行为型.commandMode.core;

/**
 * @author MGARY
 * @date 2019-11-28 下午2:54
 */
public class SellStock implements Order{
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
