package com.xworkz.amazon.seva;

import com.xworkz.amazon.user.AmazonUser;

public class AmazonSeva {
    AmazonUser amazonuser;

    public boolean createAmazonUser(AmazonUser user) {
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isAgeValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isMobNoValid = false;
        boolean isEmailIdValid = false;
        boolean isPwdValid = false;
        boolean isConfirmPwdValid = false;
        boolean isCaptchaValid = false;
        boolean isValid = false;
        if (user.getFirstName() != null) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid FirstName");
        }

        if (user.getLastName() != null) {
            isLastNameValid = true;
        } else {
            System.out.println("Invalid LastName");
        }

        if (user.getAge() != 0) {
            if (user.getAge() >= 18) {
                isAgeValid = true;
            } else {
                System.out.println("Invalid Age");
            }
        }

        if (user.getDob() != null) {
            isDobValid = true;
        } else {
            System.out.println("Invalid Dob");
        }

        if (user.getGender() != 0) {
            isGenderValid = true;
        } else {
            System.out.println("Invalid Gender");
        }

        if (user.getMobNo() != null) {
            isMobNoValid = true;
        } else {
            System.out.println("Invalid MobNo");
        }

        if (user.getEmailId() != null) {
            isEmailIdValid = true;
        } else {
            System.out.println("Invalid EmailId");
        }

        if (user.getPwd() != null) {
            isPwdValid = true;
        } else {
            System.out.println("Invalid Pwd");
        }

        if (user.getConfirmPwd() != null) {
            if (user.getPwd() == user.getConfirmPwd()) {
                isConfirmPwdValid = true;
            } else {
                System.out.println("Enter Same Password");
            }
        }

        if (user.getCaptcha() != null) {
            isCaptchaValid = true;
        } else {
            System.out.println("Invalid Captcha");
        }

        if (isFirstNameValid && isLastNameValid && isAgeValid && isDobValid && isGenderValid && isMobNoValid && isEmailIdValid && isPwdValid && isConfirmPwdValid && isCaptchaValid) {
            isValid = true;
        } else {
            System.out.println("Invalid User");
            System.out.println("AmazonSeva Validation");
        }
      //  this.amazonuser=amazonuser;
        return isValid;
    }


}
