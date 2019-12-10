package com.company.结构型.adapterMode.core;

/**
 * @author MGARY
 * @date 2019-11-27 上午11:12
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
