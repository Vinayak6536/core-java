package com.xworkz.hat;

public class Hat {
    int hatId;
    String brandName;
    String hatSize;
    String hatColour;
    double hatPrice;
    String paymentMode;

    public void getHatInfo() {
        System.out.println("Hat ID: " + hatId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Hat Size: " + hatSize);
        System.out.println("Hat Colour: " + hatColour);
        System.out.println("Hat Price: " + hatPrice);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
