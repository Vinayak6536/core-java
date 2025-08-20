package com.xworkz.amusementpark;

import com.xworkz.amusementpark.runner.AmusementPark;

public class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        AmusementPark park = new AmusementPark();
        park.setParkId(1);
        park.setName("Wonder World");
        park.setLocation("Orlando, USA");
        park.setYearEstablished(1995);
        park.setNumberOfRides(40);
        park.setHasWaterPark(true);
        park.getAmusementParkInfo();
    }
}
