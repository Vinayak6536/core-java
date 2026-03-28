package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.police.Police;

import java.awt.print.Book;

public class PoliceStation {
    Police[] police=new Police[6];
    int index;

    public boolean addPoliceInfo(Police p){
        boolean isValid=false;
        if(p != null){
            police[index++]=p;
            isValid=true;
        }
        else {
            System.out.println("Invalid Details");
        }
        return isValid;
    }

    public void getPoliceDetails(){
        for (Police police1:police) {
            System.out.println("Police Id Is:" + police1.getPoliceID());
            System.out.println("Police Name Is:" + police1.getPoliceName());
            System.out.println("Police Designation:" + police1.getPoliceDesignation());
            System.out.println("Salary:" + police1.getSalary());
            System.out.println();
        }
    }
}
