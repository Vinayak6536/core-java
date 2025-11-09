package com.xworkz.busbooking.impl;

import com.xworkz.busbooking.contract.AbhiBusContract;

public class VrlImpl implements AbhiBusContract {

    @Override
    public boolean isBusConditionGood() {
        return true;
    }

    @Override
    public int minBooking(){
        return 3;
    }
}
