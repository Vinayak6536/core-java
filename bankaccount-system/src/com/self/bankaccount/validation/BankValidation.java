package com.self.bankaccount.validation;

import com.self.bankaccount.user.details.AccountDetails;

public class BankValidation {
    AccountDetails accountDetails;
    public boolean createAccountValidation(AccountDetails details){
        boolean isFirstNameValid=false;
        boolean isLastNameValid=false;
        boolean isGenderValid=false;
        boolean isAgeValid=false;
        boolean isDobValid=false;
        boolean isAdharValid=false;
        boolean isPanNoValid=false;
        boolean isMobNoValid=false;
        boolean isEmailIdValid=false;
        boolean isAddressValid=false;
        boolean isValid=false;
        if(details.getFirstName()!= null){
            isFirstNameValid=true;
        }
        else {
            System.out.println("Invalid First Name");
        }

        if(details.getLastName()!=null){
            isLastNameValid=true;
        }
        else {
            System.out.println("Invalid Last Name");
        }

        if(details.getGender()!=null){
            isGenderValid=true;
        }
        else {
            System.out.println("Invalid Gender");
        }
        if(details.getAge()!=0){
            isAgeValid=true;
        }
        else {
            System.out.println("Invalid Age");
        }

        if(details.getDob()!=null){
            isDobValid=true;
        }
        else {
            System.out.println("Invalid Dob");
        }

        if(details.getAdharNo()!=0){
            isAdharValid=true;
        }
        else {
            System.out.println("Invalid Adhar No");
        }

        if(details.getPanNo()!=null){
            isPanNoValid=true;
        }
        else {
            System.out.println("Invalid Pan No");
        }

        if(details.getMobNo()!=0){
            isMobNoValid=true;
        }
        else {
            System.out.println("Invalid Mob No");
        }

        if(details.getEmailId()!=null){
            isEmailIdValid=true;
        }
        else{
            System.out.println("Invalid EmailId");
        }

        if(details.getAddress()!=null){
            isAddressValid=true;
        }
        else {
            System.out.println("Invalid Address");
        }
        if(isFirstNameValid && isLastNameValid && isAgeValid && isDobValid && isGenderValid && isAdharValid && isPanNoValid && isMobNoValid && isEmailIdValid && isAddressValid){
            isValid=true;
        }
        else {
            System.out.println("Enter proper Details");
        }
        return isValid;
    }
}
