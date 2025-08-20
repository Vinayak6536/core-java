package com.xworkz.blazzer;

public class BlazzerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Blazzer blazzer = new Blazzer();
        blazzer.blazzerId = 2;
        blazzer.brandName = "Adidas";
        blazzer.blazzerSize = "Medium";
        blazzer.blazzerColour = "Blue";
        blazzer.blazzerPrice = 150.00;
        blazzer.paymentMode = "Debit Card";
        blazzer.getBlazzerInfo();
        System.out.println("Main Ended");
    }
}