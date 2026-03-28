package com.xworkz.lokasabhaapp;

import com.xworkz.lokasabhaapp.lokasabha.Lokasabha;
import com.xworkz.lokasabhaapp.politician.Politician;

public class LokasabhaRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Politician politician=new Politician();
        politician.setId(1);
        politician.setPoliticianName("B S Y");
        politician.setParty("B J P");
        politician.setAge(60);
        politician.setEducation("Degree");

        Politician politicianOne = new Politician();
        politicianOne.setId(12);
        politicianOne.setPoliticianName("T S S");
        politicianOne.setParty("INC");
        politicianOne.setAge(59);
        politicianOne.setEducation("Graduate");

        Politician politicianTwo = new Politician();
        politicianTwo.setId(2);
        politicianTwo.setPoliticianName("R G");
        politicianTwo.setParty("INC");
        politicianTwo.setAge(52);
        politicianTwo.setEducation("Post Graduate");

        Politician politicianThree = new Politician();
        politicianThree.setId(3);
        politicianThree.setPoliticianName("N M");
        politicianThree.setParty("B J P");
        politicianThree.setAge(71);
        politicianThree.setEducation("Masters");

        Politician politicianFour = new Politician();
        politicianFour.setId(4);
        politicianFour.setPoliticianName("A K");
        politicianFour.setParty("AAP");
        politicianFour.setAge(55);
        politicianFour.setEducation("IIT Graduate");

        Politician politicianFive = new Politician();
        politicianFive.setId(5);
        politicianFive.setPoliticianName("M B");
        politicianFive.setParty("BSP");
        politicianFive.setAge(64);
        politicianFive.setEducation("LLB");

        Politician politicianSix = new Politician();
        politicianSix.setId(6);
        politicianSix.setPoliticianName("S M");
        politicianSix.setParty("SP");
        politicianSix.setAge(50);
        politicianSix.setEducation("BA");

        Politician politicianSeven = new Politician();
        politicianSeven.setId(7);
        politicianSeven.setPoliticianName("H D D");
        politicianSeven.setParty("JDS");
        politicianSeven.setAge(70);
        politicianSeven.setEducation("PUC");

        Politician politicianEight = new Politician();
        politicianEight.setId(8);
        politicianEight.setPoliticianName("Y R");
        politicianEight.setParty("YSRCP");
        politicianEight.setAge(48);
        politicianEight.setEducation("BTech");

        Politician politicianNine = new Politician();
        politicianNine.setId(9);
        politicianNine.setPoliticianName("K C R");
        politicianNine.setParty("BRS");
        politicianNine.setAge(69);
        politicianNine.setEducation("MA");

        Politician politicianTen = new Politician();
        politicianTen.setId(10);
        politicianTen.setPoliticianName("P M");
        politicianTen.setParty("Independent");
        politicianTen.setAge(45);
        politicianTen.setEducation("Diploma");

        Politician politicianEleven = new Politician();
        politicianEleven.setId(11);
        politicianEleven.setPoliticianName("S S");
        politicianEleven.setParty("B J P");
        politicianEleven.setAge(66);
        politicianEleven.setEducation("");

        Lokasabha lokasabha=new Lokasabha();
        lokasabha.addPolitician(politician);
        lokasabha.addPolitician(politicianOne);
        lokasabha.addPolitician(politicianTwo);
        lokasabha.addPolitician(politicianThree);
        lokasabha.addPolitician(politicianFour);
        lokasabha.addPolitician(politicianFive);
        lokasabha.addPolitician(politicianSix);
        lokasabha.addPolitician(politicianSeven);
        lokasabha.addPolitician(politicianEight);
        lokasabha.addPolitician(politicianNine);
        lokasabha.addPolitician(politicianTen);
        lokasabha.addPolitician(politicianEleven);

        lokasabha.getPoliticianDetails();

        System.out.println("Main Ended");

    }
}
