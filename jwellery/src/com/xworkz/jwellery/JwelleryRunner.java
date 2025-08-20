package com.xworkz.jwellery;

public class JwelleryRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Jwellery jwellery = new Jwellery();
        jwellery.jwelleryId = 1;
        jwellery.type = "Necklace";
        jwellery.material = "Gold";
        jwellery.brand = "Luxury Jewels";
        jwellery.price = 50000.00;
        jwellery.paymentMode = "Credit Card";
        jwellery.getJwelleryInfo();
        System.out.println("Main Ended");
    }
}
