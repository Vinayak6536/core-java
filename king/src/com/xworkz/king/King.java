package com.xworkz.king;

public class King {
    int kingId;
    String name;
    String kingdom;
    int reignYears;
    String capitalCity;
    String religion;
    double wealth;
    String paymentMode;

    public void getKingInfo() {
        System.out.println("King ID: " + kingId);
        System.out.println("Name: " + name);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign Years: " + reignYears);
        System.out.println("Capital City: " + capitalCity);
        System.out.println("Religion: " + religion);
        System.out.println("Wealth: " + wealth);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
