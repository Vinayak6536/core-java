package com.xworkz.coins;

public class CoinsRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Coins coin = new Coins();
        coin.coinId = 1;
        coin.country = "India";
        coin.year = 2020;
        coin.material = "Copper";
        coin.value = 10.00;
        coin.shape = "Round";
        coin.getCoinInfo();

        System.out.println("Main Ended");
    }
}
