package com.xworkz.app;

import com.xworkz.app.hospital.Hospital;
import com.xworkz.app.patient.Patient;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Patient patient=new Patient();
        patient.setPatientId(2);
        patient.setPatientName("Darshan");
        patient.setAge(26);
        patient.setAddress("Chitradurga");

        Patient patientOne=new Patient();
        patientOne.setPatientId(3);
        patientOne.setPatientName("Bharat");
        patientOne.setAge(24);
        patientOne.setAddress("Baqalkot");

        Patient patientThree=new Patient();
        patientThree.setPatientId(4);
        patientThree.setPatientName("Akshay");
        patientThree.setAge(26);
        patientThree.setAddress("Hosadurga");

        Patient patientFour=new Patient();
        patientFour.setPatientId(2);
        patientFour.setPatientName("Darshan");
        patientFour.setAge(25);
        patientFour.setAddress("Ballary");

        Hospital hospital=new Hospital();
        hospital.addPatient(patient);
        hospital.addPatient(patientOne);
        hospital.addPatient(patientThree);
        hospital.addPatient(patientFour);
        hospital.getPatientDetails();

        System.out.println(hospital.getAgeByPatientName("Darshan"));





        System.out.println("Main Ended");
    }
}
