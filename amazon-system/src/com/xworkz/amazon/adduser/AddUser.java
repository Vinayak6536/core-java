package com.xworkz.amazon.adduser;

import com.xworkz.amazon.seva.AmazonSeva;
import com.xworkz.amazon.user.AmazonUser;

public class AddUser {
    AmazonUser amazonuser;

    public boolean addUserDetails(AmazonUser amazonuser) {
        boolean isValidated = false;
        AmazonSeva amazonseva = new AmazonSeva();
        boolean result = amazonseva.createAmazonUser(amazonuser);

        if (result) {
            this.amazonuser = amazonuser;
            isValidated = false;
        }
        return isValidated;
    }

    public boolean isUpdate(int age) {
        boolean isUsed = false;
       // boolean isUpdated = false;
        amazonuser.setAge(6);
        isUsed = true;
     return isUsed;
    }


    public void getUserInfo() {
        System.out.println("User Details Feached.....");
        System.out.println("First Name Is:" + amazonuser.getFirstName());
        System.out.println("Last Name Is:" + amazonuser.getLastName());
        System.out.println("Age Is:" + amazonuser.getAge());
        System.out.println("DOB Is:" + amazonuser.getAge());
        System.out.println("Gender is:" + amazonuser.getGender());
        System.out.println("Mobile No Is:" + amazonuser.getMobNo());
        System.out.println("Email Id Is:" + amazonuser.getEmailId());
        System.out.println("Password Is:" + amazonuser.getPwd());
        System.out.println("Confirm Password Is:" + amazonuser.getConfirmPwd());
        System.out.println("Enter Captcha :" + amazonuser.getCaptcha());
    }
}
