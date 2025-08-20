package com.xworkz.casino;

public class CasinoRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Casino casino = new Casino();
        casino.casinoId = 1;
        casino.name = "Lucky Star Casino";
        casino.location = "Las Vegas, USA";
        casino.totalGames = 50;
        casino.isOpen24Hours = true;
        casino.entryFee = 20.00;
        casino.owner = "John Doe";
        casino.paymentMode = "Credit Card";
        casino.getCasinoInfo();
        System.out.println("Main Ended");
    }
}
