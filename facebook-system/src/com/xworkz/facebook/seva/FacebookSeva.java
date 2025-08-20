package com.xworkz.facebook.seva;

import com.xworkz.facebook.FacebookUser;

public class FacebookSeva {
    FacebookUser facebookuser;

    public boolean createUserInfo(FacebookUser user) {
        boolean isFirstNameValid = false;
        boolean isSurNameValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isMobNoValid = false;
        boolean isEmailIdValid = false;
        boolean isNewPwdValid = false;
        boolean isConfirmPwdValid = false;
        boolean isValid = false;
        boolean isValidated = false;
        if (user.getFirstName() != null) {
            isFirstNameValid = true;
        } else {
            System.out.println("Invalid FirstName");
        }

        if (user.getSurName() != null) {
            isSurNameValid = true;
        } else {
            System.out.println("Invalid SurName");
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
            System.out.println("Inavalid Mob No");
        }

        if (user.getEmailId() != null) {
            isEmailIdValid = true;
        } else {
            System.out.println("Invalid Email Id");
        }

        if (user.getNewPwd() != null) {
            isNewPwdValid = true;
        } else {
            System.out.println("Invalid Pwd");
        }

        if (user.getConfirmPwd() != null) {
            isConfirmPwdValid = true;
        } else {
            System.out.println("Invalid ConfirmPwd");
        }



            if (isFirstNameValid && isSurNameValid && isDobValid && isConfirmPwdValid && isEmailIdValid && isGenderValid && isNewPwdValid) {
                if (user.getNewPwd() == user.getConfirmPwd()) {
                isValid = true;

            }
            else {
                System.out.println("Invalid Data");
            }
        }
        else{
                System.out.println("password is incorrect");
            }
            return isValid;
        }
}


