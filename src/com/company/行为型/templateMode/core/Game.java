package com.company.行为型.templateMode.core;

/**
 * @author MGARY
 * @date 2019-11-29 上午11:30
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
