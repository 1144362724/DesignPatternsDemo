package com.company.compositeMode.advanced;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现目录节点
 * @author MGARY
 * @date 2019-11-27 下午4:21
 */
public class Noder extends Node {

    /**
     * 内部节点列表（包括文件和下级目录）
     */
    List<Node> nodeList = new ArrayList<>();


    /**
     * @param name 通过构造器为当前目录节点赋名
     */
    public Noder(String name) {
        super(name);
    }

    /**
     * 新增节点
     * @param node 节点
     * @throws Exception
     */
    @Override
    public void addNode(Node node) throws Exception{
        nodeList.add(node);
    }

    /**
     * 递归循环显示下级节点
     */
    @Override
    void display() {
        System.out.println(name);
        for(Node node:nodeList){
            node.display();
        }
    }
}
