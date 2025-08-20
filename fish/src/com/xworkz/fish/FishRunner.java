package com.xworkz.fish;

public class FishRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Fish fish = new Fish();
        fish.fishId = 1;
        fish.species = "Goldfish";
        fish.color = "Golden";
        fish.weight = 0.5;
        fish.length = 10.0;
        fish.habitat = "Freshwater";
        fish.getFishInfo();
        System.out.println("Main Ended");
    }
}
