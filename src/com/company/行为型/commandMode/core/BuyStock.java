package com.company.行为型.commandMode.core;

/**
 * @author MGARY
 * @date 2019-11-28 下午2:54
 */
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
