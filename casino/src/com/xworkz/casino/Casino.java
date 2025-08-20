package com.xworkz.casino;

public class Casino {
    int casinoId;
    String name;
    String location;
    int totalGames;
    boolean isOpen24Hours;
    double entryFee;
    String owner;
    String paymentMode;

    public void getCasinoInfo() {
        System.out.println("Casino ID: " + casinoId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Total Games: " + totalGames);
        System.out.println("Open 24 Hours: " + isOpen24Hours);
        System.out.println("Entry Fee: " + entryFee);
        System.out.println("Owner: " + owner);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
