package com.xworkz.pipe;

public class PipeRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Pipe pipe = new Pipe();
        pipe.pipeId = 1;
        pipe.pipeMaterial = "PVC";
        pipe.pipeLengthMeters = 10.5;
        pipe.pipeDiameterInches = 2.0;
        pipe.pipeType = "Drainage";
        pipe.paymentMode = "UPI";
        pipe.getPipeInfo();
        System.out.println("Main Ended");
    }
}
