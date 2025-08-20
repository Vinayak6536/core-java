package com.xworkz.facebook.runner;

import com.xworkz.facebook.FacebookUser;
import com.xworkz.facebook.seva.FacebookSeva;

public class FacebookRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        FacebookUser facebookUser=new FacebookUser();
        facebookUser.setFirstName("Darshan");
        facebookUser.setSurName("O");
        facebookUser.setDob("12/09/2001");
        facebookUser.setGender('M');
        facebookUser.setMobNo("7338432139");
        facebookUser.setEmailId("Darshu@gmail.com");
        facebookUser.setNewPwd("Dars@2001");
        facebookUser.setConfirmPwd("Dars@2000" );

        FacebookSeva facebookseva=new FacebookSeva();
        boolean result=facebookseva.createUserInfo(facebookUser);
        if(result){
            System.out.println("First Name Is:"+facebookUser.getFirstName());
            System.out.println("Sur NAme Is:"+facebookUser.getSurName());
            System.out.println("Date Of Birth Is:"+facebookUser.getDob());
            System.out.println("Gender :"+ facebookUser.getGender());
            System.out.println("Mobile Number Is:"+facebookUser.getMobNo());
            System.out.println("Email Id Is:"+facebookUser.getEmailId());
            System.out.println("New Password Is:"+facebookUser.getNewPwd());
            System.out.println("Confirm Password Is:"+facebookUser.getConfirmPwd());

        }

        System.out.println("Main Ended");
    }
}
