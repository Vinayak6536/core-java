package com.xworkz.busbooking.impl;

import com.xworkz.busbooking.contract.AbhiBusContract;

public class SrsImpl implements AbhiBusContract {
    @Override
    public int minBooking() {
        return 23;
    }

    @Override
    public boolean isBusConditionGood() {
        return true;
    }
}
