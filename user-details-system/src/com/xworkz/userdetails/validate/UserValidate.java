package com.xworkz.userdetails.validate;

import com.xworkz.userdetails.user.UserDetails;

public class UserValidate {
    UserDetails userDetails;

    public boolean createdUserDetails(UserDetails details) {
        boolean isValidate = false;
        boolean isUserValidate = false;

        if (details.getUserId() != 0) {
            if (details.getFirstName() != null && !details.getFirstName().isEmpty()) {
                if (details.getMiddleName() != null && !details.getMiddleName().isEmpty()) {
                    if (details.getLastName() != null && !details.getLastName().isEmpty()) {
                        if (details.getAge() != 0) {
                            if (details.getDob() != null && !details.getDob().isEmpty()) {
                                if (details.getMobNo() != 0) {
                                    if (details.getGender() != 0) {
                                        if (details.getEmailId() != null && !details.getEmailId().isEmpty()) {
                                            if (details.getHeight() != null && !details.getHeight().isEmpty()) {
                                                if (details.getWeight() != null && !details.getWeight().isEmpty()) {
                                                    if (details.getAddress() != null && !details.getAddress().isEmpty()) {
                                                        if (details.getState() != null && !details.getState().isEmpty()) {
                                                            if (details.getCountry() != null && !details.getCountry().isEmpty()) {
                                                                if (details.getPwd() != null && !details.getPwd().isEmpty()) {
                                                                    if (details.getConfirmPwd() != null && !details.getConfirmPwd().isEmpty()) {
                                                                        if (details.getCaptcha() != null && !details.getCaptcha().isEmpty()) {
                                                                            isValidate = true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        if (isValidate) {
            isUserValidate = true;
            this.userDetails = userDetails;
        }

        return isUserValidate;
    }
}
