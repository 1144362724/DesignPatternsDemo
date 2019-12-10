package com.company.行为型.mementoMode.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MGARY
 * @date 2019-11-28 下午4:41
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
