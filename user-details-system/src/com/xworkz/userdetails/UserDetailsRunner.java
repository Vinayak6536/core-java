package com.xworkz.userdetails;

import com.xworkz.userdetails.playstore.PlayStoreValidate;
import com.xworkz.userdetails.user.UserDetails;

public class UserDetailsRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        UserDetails userDetails=new UserDetails();
        userDetails.setUserId(1);
        userDetails.setFirstName("Vinayak");
        userDetails.setMiddleName("G");
        userDetails.setLastName("Hiremath");
        userDetails.setAge(24);
        userDetails.setDob("22/07/2002");
        userDetails.setMobNo(7338432139l);
        userDetails.setGender('M');
        userDetails.setEmailId("vina2@gmail.com");
        userDetails.setHeight("160cm");
        userDetails.setWeight("65Kg");
        userDetails.setAddress("Chikkasindagi");
        userDetails.setState("Karnataka");
        userDetails.setCountry("India");
        userDetails.setPwd("vina@2002");
        userDetails.setConfirmPwd("vina@2002");
        userDetails.setCaptcha("12egh7");

        PlayStoreValidate playStoreValidate=new PlayStoreValidate();
        boolean result=playStoreValidate.isValidated(userDetails);
        if(result){
            playStoreValidate.getUserInfo();
        }
        System.out.println("Main Ended");

    }
}
