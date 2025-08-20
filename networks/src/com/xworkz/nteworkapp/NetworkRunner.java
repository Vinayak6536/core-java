package com.xworkz.nteworkapp;

import com.xworkz.nteworkapp.airtel.AirtelNetwork;
import com.xworkz.nteworkapp.jio.JioNetwork;
import com.xworkz.nteworkapp.vi.ViNetwork;


public class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        System.out.println("Airtel Network Feached....");
        AirtelNetwork airtelNetwork=new AirtelNetwork();
        airtelNetwork.networkid=1;
        airtelNetwork.networkArea="Bangalore";
        airtelNetwork.networkName="Airtel";
        airtelNetwork.networkRange="5KM";
        airtelNetwork.getAirtelInfo();

        System.out.println("Jio Network Feached....");
        JioNetwork jioNetwork=new JioNetwork();
        jioNetwork.networkid=2;
        jioNetwork.networkName="Jio";
        jioNetwork.networkArea="Vijayanagar";
        jioNetwork.networkRange="6KM";
        System.out.println("The Jio Network Id Is:"+jioNetwork.networkid);
        System.out.println("The Jio Name Is:"+jioNetwork.networkName);
        System.out.println("The Jio Network Area:"+jioNetwork.networkArea);
        System.out.println("The Jio Network Range Is:"+jioNetwork.networkRange);

        System.out.println("Vi Network Feached....");
        ViNetwork viNetwork = new ViNetwork();
        viNetwork.networkid=3;
        viNetwork.networkName="Vi";
        viNetwork.networkArea="Rajajinagara";
        viNetwork.networkRange="4KM";
        System.out.println("The Vi Network Id Is:"+viNetwork.networkid);
        System.out.println("The Vi Name Is:"+viNetwork.networkName);
        System.out.println("The Vi Network Area:"+viNetwork.networkArea);
        System.out.println("The Vi Network Range Is:"+viNetwork.networkRange);


        System.out.println("Main Ended");
    }
}
