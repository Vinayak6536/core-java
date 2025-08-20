package com.xworkz.hospital;

import com.xworkz.hospital.hospital.Hospital;
import com.xworkz.hospital.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setPatientName("Darshan");
        patient.setAge(24);
        patient.setMobNo(7338432143l);
        patient.setGender('M');
        patient.setAddress("Chitradurga");

        Hospital hospital=new Hospital();
        boolean information=hospital.hospitalValidator(patient);
        if(information){
            hospital.getPatientDetails();
        }
        System.out.println("Main Ended");
    }
}
