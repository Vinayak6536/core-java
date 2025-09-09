package com.xworkz.watchapp.watchstore;

import com.xworkz.watchapp.watch.Watch;

public class WatchStore {
    Watch[] watches=new Watch[9];
    int index;

    public boolean addWatch(Watch w){
        boolean isValid=false;
        if(w != null){
            watches[index++]=w;
            isValid=true;
        }
        else {
            System.out.println("Invalid Details");
        }
        return  isValid;
    }

    public void getWatchDetails(){
        for (Watch watch:watches){
            System.out.println("Watch Id Is:"+watch.getWatchId());
            System.out.println("Watch Name Is:"+watch.getWatchName());
            System.out.println("Watch Price Is:"+watch.getWatchPrice());
            System.out.println("Company Is:"+watch.getCompany());
            System.out.println();
        }
    }
}
