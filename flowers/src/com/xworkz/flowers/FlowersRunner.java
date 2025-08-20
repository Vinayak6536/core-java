package com.xworkz.flowers;

public class FlowersRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Flowers flower = new Flowers();
        flower.flowerId = 1;
        flower.name = "Rose";
        flower.color = "Red";
        flower.type = "Perennial";
        flower.price = 10.0;
        flower.fragrance = "Sweet";
        flower.quantityAvailable = 50;
        flower.paymentMode = "Credit Card";
        flower.getFlowerInfo();
        System.out.println("Main Ended");
    }
}
