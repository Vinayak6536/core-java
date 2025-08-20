package com.xworkz.hairclip;

public class HairClip {
    int clipId;
    String brandName;
    String clipType;
    String clipColor;
    double clipPrice;
    String paymentMode;

    public void getClipInfo() {
        System.out.println("Clip ID: " + clipId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Clip Type: " + clipType);
        System.out.println("Clip Color: " + clipColor);
        System.out.println("Clip Price: " + clipPrice);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
