package com.xworkz.policeapp.police;

import com.xworkz.policeapp.policestation.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Police police=new Police();
        police.setPoliceID(1);
        police.setPoliceName("Darshan");
        police.setPoliceDesignation("Ai");
        police.setSalary(35000.00);

        Police policeOne = new Police();
        policeOne.setPoliceID(1);
        policeOne.setPoliceName("Darshan");
        policeOne.setPoliceDesignation("AI");
        policeOne.setSalary(35000.00);

        Police policeTwo = new Police();
        policeTwo.setPoliceID(2);
        policeTwo.setPoliceName("Sudeep");
        policeTwo.setPoliceDesignation("SI");
        policeTwo.setSalary(32000.00);

        Police policeThree = new Police();
        policeThree.setPoliceID(3);
        policeThree.setPoliceName("Puneeth");
        policeThree.setPoliceDesignation("Inspector");
        policeThree.setSalary(40000.00);

        Police policeFour = new Police();
        policeFour.setPoliceID(4);
        policeFour.setPoliceName("Ramesh");
        policeFour.setPoliceDesignation("Sub-Inspector");
        policeFour.setSalary(31000.00);

        Police policeFive = new Police();
        policeFive.setPoliceID(5);
        policeFive.setPoliceName("Anil");
        policeFive.setPoliceDesignation("Constable");
        policeFive.setSalary(28000.00);

        PoliceStation policeStation=new PoliceStation();
        policeStation.addPoliceInfo(police);
        policeStation.addPoliceInfo(policeOne);
        policeStation.addPoliceInfo(policeTwo);
        policeStation.addPoliceInfo(policeThree);
        policeStation.addPoliceInfo(policeFour);
        policeStation.addPoliceInfo(policeFive);

        policeStation.getPoliceDetails();

        System.out.println("Main Ended");

    }
}
