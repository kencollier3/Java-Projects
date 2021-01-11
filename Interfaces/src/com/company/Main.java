package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone kensPhone;
        kensPhone = new DeskPhone(123456);
        kensPhone.powerOn();
        kensPhone.callPhone(123456);
        kensPhone.answer();

        kensPhone = new MobilePhone(23456);
        kensPhone.callPhone(23456);
        kensPhone.answer();
    }
}
