package com.xworkz.jwellery;

public class Jwellery {
    int jwelleryId;
    String type;
    String material;
    String brand;
    double price;
    String paymentMode;

    public void getJwelleryInfo() {
        System.out.println("Jwellery ID: " + jwelleryId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
