package com.xworkz.fish;

public class Fish {
    int fishId;
    String species;
    String color;
    double weight;
    double length;
    String habitat;

    public void getFishInfo() {
        System.out.println("Fish ID: " + fishId);
        System.out.println("Species: " + species);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Length: " + length);
        System.out.println("Habitat: " + habitat);
    }
}
