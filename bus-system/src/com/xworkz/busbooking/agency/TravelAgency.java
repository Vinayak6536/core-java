package com.xworkz.busbooking.agency;

import com.xworkz.busbooking.contract.AbhiBusContract;

public class TravelAgency {
    AbhiBusContract contract;

    public boolean doBooking(AbhiBusContract contract) {
        boolean isBooked = false;
        boolean isConditionGood = contract.isBusConditionGood();
        if (isConditionGood) {
            this.contract = contract;
            System.out.println("Bus Condition is Good");

            if (this.contract.minBooking() > 18) {
                isBooked = true;
                System.out.println("Bus Booking is done");
            } else System.out.println("Sorry,Booking false");
        }
        else System.out.println("Bus Condition is poor");
        return isBooked;
    }
}
