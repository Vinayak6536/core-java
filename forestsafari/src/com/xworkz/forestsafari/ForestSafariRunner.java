package com.xworkz.forestsafari;

public class ForestSafariRunner {

        public static void main(String[] args) {
            System.out.println("Main Started");

            ForestSafari safari = new ForestSafari();
            safari.safariId = 1;
            safari.forestName = "Amazon Rainforest";
            safari.country = "Brazil";
            safari.areaSqKm = 5500000.0;
            safari.animalSpotted = "Jaguar";
            safari.isGuided = true;
            safari.getSafariInfo();
            System.out.println("Main Ended");

        }
    }


