package com.xworkz.network;

public class Network {
    int networkId;
    int numberOfNodes;
    String networkName;
    String networkType;
    String protocol;
    double bandwidth;
    String paymentMode;

    public void getNetworkInfo() {
        System.out.println("Network ID: " + networkId);
        System.out.println("Number of Nodes: " + numberOfNodes);
        System.out.println("Network Name: " + networkName);
        System.out.println("Network Type: " + networkType);
        System.out.println("Protocol: " + protocol);
        System.out.println("Bandwidth: " + bandwidth);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
