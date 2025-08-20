package com.xworkz.politician;

import com.xworkz.politician.runner.Politician;

public class PoliticianRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Politician politician = new Politician();
          politician.setPoliticianId(1);

        politician.setName("Arjun Mehta");
        politician.setParty("Democratic Front");
        politician.setState("Maharashtra");
        politician.setPosition("MP");
        politician.setModeOfElection("General Election");
          politician.getPoliticianInfo();
        System.out.println("Runner");
    }
}
