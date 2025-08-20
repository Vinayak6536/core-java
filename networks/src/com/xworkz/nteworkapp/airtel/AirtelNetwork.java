package com.xworkz.nteworkapp.airtel;

public class AirtelNetwork {
   public int networkid;
   public String networkName;
   public String networkArea;
   public String networkRange;

   public void getAirtelInfo(){
      System.out.println("The Airtel Network Id Is:"+networkid);
      System.out.println("The Network Name Is:"+networkName);
      System.out.println("The Airtel Network Area:"+networkArea);
      System.out.println("The Airtel Network Range Is:"+networkRange);
   }

}
