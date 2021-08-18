package com.company.结构型.proxyMode.core;

/**
 *
 * 真实的图片
 * @author MGARY
 * @date 2019-11-28 上午11:07
 */
public class RealImage implements Image {
    /**
     * 文件名称
     */
    private final String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    /**
     * 从磁盘加载
     * @param fileName
     */
    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
