package com.xworkz.rod;

public class RodRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Rod rod = new Rod();
        rod.rodId = 1;
        rod.rodMaterial = "Steel";
        rod.rodLengthMeters = 6.0;
        rod.rodWeightKg = 12.5;
        rod.rodType = "Solid";
        rod.paymentMode = "Cash";
        rod+
    .getRodInfo();
        System.out.println("Main Ended");
    }
}
