package com.xworkz.politician.runner;

public class Politician {
    int politicianId;

    public int getPoliticianId() {
        return politicianId;
    }

    public void setPoliticianId(int politicianId){
        this.politicianId=politicianId;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    String party;

    public String getParty() {
        return party;
    }

    public void setParty(String party){

    }
    String state;

    public String getState() {
        return state;
    }
    public void setState(String state){
        this.state=state;
    }

    String position;

    public String getPosition() {
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }

    String modeOfElection;

    public String getModeOfElection() {
        return modeOfElection;
    }

    public void setModeOfElection(String modeOfElection){
        this.modeOfElection=modeOfElection;
    }

    public void getPoliticianInfo() {
        System.out.println("Politician ID: " + this.politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("State: " + state);
        System.out.println("Position: " + position);
        System.out.println("Mode of Election: " + modeOfElection);
    }
}
