package com.xworkz.newspaper;

public class NewsPaper {
    int newsPaperId;
    int noOfPages;
    String language;
    String date;
    String day;
    String companyName;

    public void getNewsPaperInfo() {
        System.out.println("News Paper ID: " + newsPaperId);
        System.out.println("Number of Pages: " + noOfPages);
        System.out.println("Language: " + language);
        System.out.println("Date: " + date);
        System.out.println("Day: " + day);
        System.out.println("Company Name: " + companyName);
    }
}
