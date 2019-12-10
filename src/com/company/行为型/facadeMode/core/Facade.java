package com.company.行为型.facadeMode.core;

/**
 * 外观类
 * @author MGARY
 * @date 2019-11-27 下午5:10
 */
public class Facade {
    private Computer cpu;
    private Computer ddr;
    private Computer ssd;

    public Facade() {
        cpu = new Cpu();
        ddr = new Ddr();
        ssd = new Ssd();
    }

    public void onCPU(){
        cpu.open();
    }
    public void onDDR(){
        ddr.open();
    }
    public void onSSD(){
        ssd.open();
    }

}
