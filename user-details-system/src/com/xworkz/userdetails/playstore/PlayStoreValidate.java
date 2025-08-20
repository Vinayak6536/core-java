package com.xworkz.userdetails.playstore;

import com.xworkz.userdetails.user.UserDetails;
import com.xworkz.userdetails.validate.UserValidate;

public class PlayStoreValidate {
    UserDetails userDetails;

    public boolean isValidated(UserDetails userDetails) {
        boolean isUserValidated = false;

        UserValidate userValidate = new UserValidate();
        boolean valid = userValidate.createdUserDetails(userDetails);
        if (valid) {

            isUserValidated = true;
            this.userDetails=userDetails;
        }
        return isUserValidated;
    }

    public void getUserInfo() {
        System.out.println("User Id:" + userDetails.getUserId());
        System.out.println("User FirstName:" + userDetails.getFirstName());
        System.out.println("User Middle Name:" + userDetails.getMiddleName());
        System.out.println("User Last Name:" + userDetails.getLastName());
        System.out.println("User Age" + userDetails.getAge());
        System.out.println("User Dob" + userDetails.getDob());
        System.out.println("User Mobile No:" + userDetails.getMobNo());
        System.out.println("User Gender:" + userDetails.getGender());
        System.out.println("User EmailId:" + userDetails.getEmailId());
        System.out.println("User Height" + userDetails.getHeight());
        System.out.println("User Weight" + userDetails.getWeight());
        System.out.println("User Address" + userDetails.getAddress());
        System.out.println("User State" + userDetails.getState());
        System.out.println("User Country" + userDetails.getCountry());
        System.out.println("User Pwd:" + userDetails.getPwd());
        System.out.println("User ConfirmPassword:" + userDetails.getConfirmPwd());
        System.out.println("Captcha:" + userDetails.getCaptcha());


    }
}
