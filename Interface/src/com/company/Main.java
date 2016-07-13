package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ITelephone timePhone;
        timePhone =  new DeskPhone(123456);
        timePhone.powerOn();
        timePhone.callPHone(123456);
        timePhone.answer();


        timePhone = new microPhone(234567);
        timePhone.callPHone(234567);
        timePhone.answer();
    }
}
