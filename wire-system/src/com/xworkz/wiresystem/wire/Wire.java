package com.xworkz.wiresystem.wire;

public class Wire {

    int wireId;
    String wireBrand;
    String wireColor;
    int lengthInMts;
    double price;

    public void getWireDetails(){
        System.out.println("The Wire Id Is:"+wireId);
        System.out.println("The Wire Brand:"+wireBrand);
        System.out.println("The Wire Color Is:"+wireColor);
        System.out.println("Length Is:"+lengthInMts);
        System.out.println("Price Is"+price);
    }
}
