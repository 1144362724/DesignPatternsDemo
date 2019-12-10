package com.company.结构型.adapterMode.core;

/**
 * @author MGARY
 * @date 2019-11-27 上午11:12
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
