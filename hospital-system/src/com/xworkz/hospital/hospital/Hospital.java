package com.xworkz.hospital.hospital;

import com.xworkz.hospital.patient.Patient;
import com.xworkz.hospital.validation.PatientValidation;

public class Hospital {
    Patient patient;
    public boolean hospitalValidator(Patient patient){
        boolean isDetailsValid=false;
        PatientValidation patientValidation=new PatientValidation();
        boolean valid=patientValidation.createPatientValidation(patient);
        if(valid){
            this.patient=patient;
            isDetailsValid=true;
        }
        return isDetailsValid;
    }

    public  void getPatientDetails(){
        System.out.println("Patient Id"+patient.getPatientId());
        System.out.println("Patient Name:"+patient.getPatientName());
        System.out.println("Mob No:"+patient.getMobNo());
        System.out.println("Age Is:"+patient.getAge());
        System.out.println("Gender Is:"+patient.getGender());
        System.out.println("Address Is:"+patient.getAddress());
    }
}
