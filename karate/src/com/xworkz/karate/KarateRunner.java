package com.xworkz.karate;

public class KarateRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Karate karate = new Karate();
        karate.karateId = 1;
        karate.style = "Shotokan";
        karate.beltColor = "Black";
        karate.experienceYears = 5;
        karate.dojoName = "Karate Dojo";
        karate.competition = true;
        karate.rating = 4.5;
        karate.paymentMode = "Credit Card";
        karate.getKarateInfo();
        System.out.println("Main Ended");

    }
}
