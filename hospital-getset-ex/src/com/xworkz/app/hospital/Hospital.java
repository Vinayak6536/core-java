package com.xworkz.app.hospital;

import com.xworkz.app.patient.Patient;

public class Hospital {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setPatientName("darshan");
        System.out.println("Patient Id Is:"+patient.getPatientId());
        System.out.println("Patient Name Is:"+patient.getPatientName());


        System.out.println("Main Ended");
    }
}
