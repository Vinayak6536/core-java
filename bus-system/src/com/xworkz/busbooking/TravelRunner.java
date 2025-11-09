package com.xworkz.busbooking;

import com.xworkz.busbooking.agency.TravelAgency;
import com.xworkz.busbooking.contract.AbhiBusContract;
import com.xworkz.busbooking.impl.SrsImpl;
import com.xworkz.busbooking.impl.VrlImpl;

public class TravelRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        AbhiBusContract vrl=new VrlImpl();


        TravelAgency travelAgency=new TravelAgency();
        travelAgency.doBooking(vrl);

        AbhiBusContract srs=new SrsImpl();
        travelAgency.doBooking(srs);


        System.out.println("main ended");
    }
}
