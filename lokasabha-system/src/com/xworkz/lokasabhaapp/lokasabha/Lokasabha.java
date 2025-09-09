package com.xworkz.lokasabhaapp.lokasabha;

import com.xworkz.lokasabhaapp.politician.Politician;

public class Lokasabha {
Politician[] politicians=new Politician[12];
int index;

public boolean addPolitician(Politician p){
    boolean isValid=false;
    if(p != null){
        politicians[index++]=p;
        isValid=true;
    }
    else {
        System.out.println("Invalid Details");
    }
    return isValid;

}

public void getPoliticianDetails(){
    for(Politician politician:politicians){
        System.out.println("Politician Id Is:"+politician.getId());
        System.out.println("Politician Name Is:"+politician.getPoliticianName());
        System.out.println("Politician Party Is:"+politician.getParty());
        System.out.println("Politician Age Is:"+politician.getAge());
        System.out.println("Politician Education Is:"+politician.getEducation());
        System.out.println();
    }
}
}
