package com.company.compositeMode.advanced;

import java.io.File;

/**
 * @author MGARY
 * @date 2019-11-27 下午4:25
 */

public class Clienter {
    public static void createTree(Node node) throws Exception{
        File file = new File(node.name);
        file.createNewFile();
        File[] f = file.listFiles();
        for(File fi : f){
            if(fi.isFile()){
                Filer filer = new Filer(fi.getAbsolutePath());
                node.addNode(filer);
            }
            if(fi.isDirectory()){
                Noder noder = new Noder(fi.getAbsolutePath());
                node.addNode(noder);
                //使用递归生成树结构
                createTree(noder);
            }
        }
    }
    public static void main(String[] args) {
        Node noder = new Noder("/home/mgary/ceshi");
        try {
            createTree(noder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        noder.display();
    }
}
