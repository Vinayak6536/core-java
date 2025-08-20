package com.xworkz.marble;

public class MarbleRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Marble marble = new Marble();
        marble.marbleId = 1;
        marble.color = "Red";
        marble.material = "Glass";
        marble.diameter = 2.5;
        marble.weight = 0.05;
        marble.finishType = "Polished";
        marble.origin = "Italy";
        marble.getMarbleInfo();
        System.out.println("Main Ended");
    }
}
