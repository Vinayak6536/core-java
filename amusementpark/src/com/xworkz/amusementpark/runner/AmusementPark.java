package com.xworkz.amusementpark.runner;

public class AmusementPark {
    int parkId;

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }

    String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    int yearEstablished;

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    int numberOfRides;

    public int getNumberOfRides() {
        return numberOfRides;
    }

    public void setNumberOfRides(int numberOfRides) {
        this.numberOfRides = numberOfRides;
    }

    boolean hasWaterPark;

    public boolean isHasWaterPark() {
        return hasWaterPark;
    }

    public void setHasWaterPark(boolean hasWaterPark) {
        this.hasWaterPark = hasWaterPark;
    }

    public void getAmusementParkInfo() {
        System.out.println("Park ID: " + parkId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Has Water Park: " + hasWaterPark);
    }
}
