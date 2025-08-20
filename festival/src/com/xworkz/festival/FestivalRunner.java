package com.xworkz.festival;

public class FestivalRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Festival festival = new Festival();
        festival.festivalId = 1;
        festival.name = "Diwali";
        festival.state = "Maharashtra";
        festival.month = "October";
        festival.isNationalHoliday = true;
        festival.getFestivalInfo();
        System.out.println("Main Ended");
    }
}
