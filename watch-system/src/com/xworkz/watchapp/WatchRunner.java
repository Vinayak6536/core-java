package com.xworkz.watchapp;

import com.xworkz.watchapp.watch.Watch;
import com.xworkz.watchapp.watchstore.WatchStore;

public class WatchRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Watch watch=new Watch();
        watch.setWatchId(1);
        watch.setWatchName("Wrong s22");
        watch.setWatchPrice(700.00);
        watch.setCompany("Wrong");

        Watch watchOne = new Watch();
        watchOne.setWatchId(9);
        watchOne.setWatchName("Rolex Submariner");
        watchOne.setWatchPrice(850000.00);
        watchOne.setCompany("Rolex");

        Watch watchTwo = new Watch();
        watchTwo.setWatchId(2);
        watchTwo.setWatchName("Fastrack Reflex");
        watchTwo.setWatchPrice(1500.00);
        watchTwo.setCompany("Fastrack");

        Watch watchThree = new Watch();
        watchThree.setWatchId(3);
        watchThree.setWatchName("Titan Edge");
        watchThree.setWatchPrice(12000.00);
        watchThree.setCompany("Titan");

        Watch watchFour = new Watch();
        watchFour.setWatchId(4);
        watchFour.setWatchName("Apple Watch Series 8");
        watchFour.setWatchPrice(40000.00);
        watchFour.setCompany("Apple");

        Watch watchFive = new Watch();
        watchFive.setWatchId(5);
        watchFive.setWatchName("Samsung Galaxy Watch 4");
        watchFive.setWatchPrice(25000.00);
        watchFive.setCompany("Samsung");

        Watch watchSix = new Watch();
        watchSix.setWatchId(6);
        watchSix.setWatchName("Fossil Gen 6");
        watchSix.setWatchPrice(18000.00);
        watchSix.setCompany("Fossil");

        Watch watchSeven = new Watch();
        watchSeven.setWatchId(7);
        watchSeven.setWatchName("Garmin Forerunner 945");
        watchSeven.setWatchPrice(35000.00);
        watchSeven.setCompany("Garmin");

        Watch watchEight = new Watch();
        watchEight.setWatchId(8);
        watchEight.setWatchName("Casio G-Shock");
        watchEight.setWatchPrice(9000.00);
        watchEight.setCompany("Casio");

        WatchStore watchStore=new WatchStore();
        watchStore.addWatch(watch);
        watchStore.addWatch(watchOne);
        watchStore.addWatch(watchTwo);
        watchStore.addWatch(watchThree);
        watchStore.addWatch(watchFour);
        watchStore.addWatch(watchFive);
        watchStore.addWatch(watchSix);
        watchStore.addWatch(watchSeven);
        watchStore.addWatch(watchEight);

        watchStore.getWatchDetails();

        System.out.println("Main Ended");


    }
}
