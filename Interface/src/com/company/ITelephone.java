package com.company;

/**
 * Created by steven on 7/13/16.
 */
public interface ITelephone {

    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPHone(int phoneNumber);
    public boolean isRinging();



}
