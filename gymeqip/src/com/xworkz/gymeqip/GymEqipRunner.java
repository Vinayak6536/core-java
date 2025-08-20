package com.xworkz.gymeqip;

public class GymEqipRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        GymEqip equipement = new GymEqip();
        equipement.equipementId = 1;0oplo
        equipement.name = "Treadmill";
        equipement.category = "Cardio";
        equipement.price = 50000.00;
        equipement.brand = "FitPro";
        equipement.paymentMode = "Credit Card";
        equipement.getEquipementInfo();
        System.out.println("Main Ended");
    }
}
