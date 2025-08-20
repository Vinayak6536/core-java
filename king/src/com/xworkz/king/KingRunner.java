package com.xworkz.king;

public class KingRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        King king = new King();
        king.kingId = 1;
        king.name = "King Arthur";
        king.kingdom = "Camelot";
        king.reignYears = 20;
        king.capitalCity = "Camelot City";
        king.religion = "Christianity";
        king.wealth = 1000000.00;
        king.paymentMode = "Gold Coins";
        king.getKingInfo();
        System.out.println("Main Ended");
    }
}
