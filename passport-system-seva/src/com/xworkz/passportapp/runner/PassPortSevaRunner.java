package com.xworkz.passportapp.runner;

import com.xworkz.passportapp.seva.PassportSeva;
import com.xworkz.passportapp.user.PassportUser;

public class PassPortSevaRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        PassportUser passportUser=new PassportUser();
        passportUser.setCpvLocation("");
        passportUser.setDcdrLocation("XYZ");
        passportUser.setGivenName("Darshan");
        passportUser.setSurName("O");
        passportUser.setEmailId(null);
        passportUser.setAddress("Bangalore");
        passportUser.setDob("12/08/2000");
        passportUser.setLoginId("abc@gmail.com");
        passportUser.setPwd("Abc@123");
        passportUser.setConfirmPwd("Abc@123");
        passportUser.setHintQuestion("School Name");
        passportUser.setHintAnswer("HPS Bangalore");
        passportUser.setCaptcha("12AVG8");


        PassportSeva passportSeva=new PassportSeva();
        boolean result=passportSeva.createPassportUser(passportUser);

        if (result){
            passportUser.getPassportUserInfo();
//            System.out.println("PassportUser Details Feached.....");
//            System.out.println("User CpvLocation Is:"+passportUser.getCpvLocation());
//            System.out.println("User DcdrLocation Is:"+passportUser.getDcdrLocation());
//            System.out.println("User Name Is:"+passportUser.getGivenName());
//            System.out.println("User Sur Name Is:"+passportUser.getSurName());
//            System.out.println("User EmailId Is:"+passportUser.getEmailId());
//            System.out.println("User Address Is:"+passportUser.getAddress());
//            System.out.println("User DOB Is:"+passportUser.getDob());
//            System.out.println("User Login Id Is:"+passportUser.getLoginId());
//            System.out.println("User Password Is:"+passportUser.getPwd());
//            System.out.println("User Confirm Password Is:"+passportUser.getConfirmPwd());
//            System.out.println("Hint Question Is:"+passportUser.getHintQuestion());
//            System.out.println("Hint Answer Is:"+passportUser.getHintAnswer());
//            System.out.println("Captcha Is:"+passportUser.getCaptcha());
        }
        else System.out.println("reult is false"
        );
        System.out.println("Main Ended");
    }
}
