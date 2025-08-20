package com.xworkz.wiresystem.wire;

public class WireRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Wire wire=new Wire();
        wire.wireId=1;
        wire.wireBrand="Anchor";
        wire.wireColor="red";
        wire.lengthInMts=1;
        wire.price=150.00;

        wire.getWireDetails();

        System.out.println("Main Ended");

    }
}
