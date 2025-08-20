package com.xworkz.network;

public class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Network network = new Network();
        network.networkId = 1;
        network.numberOfNodes = 10;
        network.networkName = "Local Area Network";
        network.networkType = "Wired";
        network.protocol = "TCP/IP";
        network.bandwidth = 100.0;
        network.paymentMode = "Credit Card";
        network.getNetworkInfo();
        System.out.println("Main Ended");
    }
}
