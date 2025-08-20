package com.xworkz.gitag;

public class GiTagRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        GiTag giTagOne = new GiTag();
        giTagOne.tagId = 1;
        giTagOne.productName = "Darjeeling Tea";
        giTagOne.state = "West Bengal";
        giTagOne.yearGranted = 2011;
        giTagOne.isHandmade = true;
        giTagOne.getGiTagInfo();
        System.out.println("Main Ended");
    }
}
