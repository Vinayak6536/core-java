package com.xworkz.app.hospital;

import com.xworkz.app.patient.Patient;

public class Hospital {
    Patient patient;
    Patient[] patients=new Patient[4];
    int index;

    public boolean addPatient(Patient p){
        Boolean isAdded=false;
        if(p != null){
              patients[index++]=p;
              isAdded=true;
        }
        else {
            System.out.println("Invalid Details");
        }

        return isAdded;

    }

    public int  getAgeByPatientName(String patientName){

           for(Patient patient1:patients){
               if(patientName.equals(patient1.getPatientName())){
                   return patient1.getAge();
                //   System.out.println(patient1.getAge());
           }

        }

        return 0;
    }

    public void getPatientDetails(){
        for (Patient patient:patients) {
            System.out.println("Patient Id:" + patient.getPatientId());
            System.out.println("Patient Name:" + patient.getPatientName());
            System.out.println("Patirnt Age:" + patient.getAge());
            System.out.println("Patient Address:" + patient.getAddress());
            System.out.println();
        }
    }
}
