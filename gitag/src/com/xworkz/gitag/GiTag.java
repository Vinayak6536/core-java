package com.xworkz.gitag;

public class GiTag {
    int tagId;
    String productName;
    String state;
    int yearGranted;
    boolean isHandmade;

    public void getGiTagInfo() {
        System.out.println("GI Tag ID: " + tagId);
        System.out.println("Product Name: " + productName);
        System.out.println("State: " + state);
        System.out.println("Year Granted: " + yearGranted);
        System.out.println("Is Handmade: " + isHandmade);
    }
}
