package com.company.compositeEntityMode.core;

/**
 * @author MGARY
 * @date 2019-11-29 下午2:02
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
