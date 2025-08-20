package com.xworkz.lokasabha.politician;

public class Politician {
    private int Id;
    private  String politicianName;
    private String Party;
    private int age;
    private String education;

    public String getPoliticianName() {
        return politicianName;
    }

    public void setPoliticianName(String politicianName) {
        this.politicianName = politicianName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getParty() {
        return Party;
    }

    public void setParty(String party) {
        Party = party;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
