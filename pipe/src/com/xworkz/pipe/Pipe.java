package com.xworkz.pipe;

public class Pipe {
    int pipeId;
    String pipeMaterial;
    double pipeLengthMeters;
    double pipeDiameterInches;
    String pipeType;
    String paymentMode;

    public void getPipeInfo() {
        System.out.println("Pipe ID: " + pipeId);
        System.out.println("Pipe Material: " + pipeMaterial);
        System.out.println("Pipe Length (meters): " + pipeLengthMeters);
        System.out.println("Pipe Diameter (inches): " + pipeDiameterInches);
        System.out.println("Pipe Type: " + pipeType);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
