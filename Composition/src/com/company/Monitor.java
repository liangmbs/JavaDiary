package com.company;

/**
 * Created by steven on 7/6/16.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String manufacturer, Resolution nativeResolution, int size, String model) {
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
        this.size = size;
        this.model = model;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.print(x + "," + y);
    }
}
