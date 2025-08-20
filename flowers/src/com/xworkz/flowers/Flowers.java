package com.xworkz.flowers;

public class Flowers {
    int flowerId;
    String name;
    String color;
    String type;
    double price;
    String fragrance;
    int quantityAvailable;
    String paymentMode;

    public void getFlowerInfo() {
        System.out.println("Flower ID: " + flowerId);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
