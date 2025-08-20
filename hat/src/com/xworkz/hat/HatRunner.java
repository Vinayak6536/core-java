package com.xworkz.hat;

public class HatRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Hat hat = new Hat();
        hat.hatId = 1;
        hat.brandName = "Nike";
        hat.hatSize = "Large";
        hat.hatColour = "Red";
        hat.hatPrice = 25.00;
        hat.paymentMode = "Credit Card";
        hat.getHatInfo();
        System.out.println("Main Ended");
    }
}
