package com.xworkz.cracker;

public class CrackerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Cracker cracker = new Cracker();
        cracker.crackerId = 101;
        cracker.crackerName = "Sparkler";
        cracker.brand = "Fireworks Co.";
        cracker.crackerType = "Sparkler";
        cracker.color = "Red";
        cracker.price = 50.00;
        cracker.paymentMode = "Credit Card";
        cracker.getCrackerInfo();
        System.out.println("Main ended");
    }
}
