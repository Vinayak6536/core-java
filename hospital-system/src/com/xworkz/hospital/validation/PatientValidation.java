package com.xworkz.hospital.validation;

import com.xworkz.hospital.patient.Patient;

public class PatientValidation {
    Patient patient;
    public boolean createPatientValidation(Patient patient){
        boolean patientValid=false;
        boolean patientNameValid=false;
        boolean mobNoValid=false;
        boolean ageValid=false;
        boolean genderValid=false;
        boolean addressValid=false;
        boolean isValid=false;
        if(patient.getPatientId()!=0){
            patientValid=true;
        }
        else {
            System.out.println("Invalid Patient Id");
        }

        if(patient.getPatientName()!=null && !patient.getPatientName().isEmpty()){
            patientNameValid=true;
        }
        else {
            System.out.println("Invalid Patient Name");
        }

        if(patient.getMobNo()!=0){
            mobNoValid=true;
        }
        else {
            System.out.println("Invalid Mobile No");
        }

        if(patient.getAge()!=0){
            ageValid=true;
        }
        else {
            System.out.println("Invalid Age");
        }

        if(patient.getGender()!= 0){
            genderValid=true;
        }
        else {
            System.out.println("Invalid Gender");
        }

        if(patient.getAddress()!=null && !patient.getAddress().isEmpty()){
            addressValid=true;
        }
        else {
            System.out.println("Invalid Address");
        }

        if(patientValid && patientNameValid && ageValid && genderValid && mobNoValid && addressValid){
            isValid=true;
        }
        else {
            System.out.println("Enter proper Details");
        }
        return isValid;
    }
}
