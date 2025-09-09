package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.trainee.Trainee;

public class Institution {
    Trainee[] trainees=new Trainee[16];
    int index;

    public boolean addTrainees(Trainee t){
        boolean isValid=false;
        if(t != null){
            trainees[index++]=t;
            isValid=true;
        }
        else {
            System.out.println("Invalid Details");
        }
        return isValid;
    }

    public void getTraineeDetails(){
        for (Trainee trainee:trainees){
            System.out.println("Trainee Id:"+trainee.getTraineeId());
            System.out.println("Trainee Name Is:"+trainee.getTraineeName());
            System.out.println("Trainee Language Is:"+trainee.getTraineeLan());
            System.out.println("Trainee Age Is:"+trainee.getAge());
            System.out.println();
        }
    }
}
