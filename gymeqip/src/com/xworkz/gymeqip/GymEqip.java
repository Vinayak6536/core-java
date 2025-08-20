package com.xworkz.gymeqip;

public class GymEqip {
    int equipementId;
    String name;
    String category;
    double price;
    String brand;
    String paymentMode;

    public void getEquipementInfo() {
        System.out.println("Equipment ID: " + equipementId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
