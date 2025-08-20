package com.xworkz.amazon.runner;

import com.xworkz.amazon.adduser.AddUser;
import com.xworkz.amazon.seva.AmazonSeva;
import com.xworkz.amazon.user.AmazonUser;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        AmazonUser amazonuser=new AmazonUser();
        amazonuser.setFirstName("Darshan");
        amazonuser.setLastName("O");
        amazonuser.setAge(24);
        amazonuser.setDob("12/09/2002");
        amazonuser.setGender('M');
        amazonuser.setMobNo("7338432139");
        amazonuser.setEmailId("Darsh@gmail.com");
        amazonuser.setPwd("Dars@123");
        amazonuser.setConfirmPwd("Dars@123");
        amazonuser.setCaptcha("12gn89");

        AddUser addUser=new AddUser();

       boolean result1= addUser.addUserDetails(amazonuser);
        if(result1){
            System.out.println("Main Ended");
            addUser.getUserInfo();
       }

    }
}
