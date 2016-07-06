package com.company;

/**
 * Created by steven on 7/6/16.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }


    public Monitor getMonitor() {
        return monitor;
    }


    public Motherboard getMotherboard() {
        return motherboard;
    }

}
