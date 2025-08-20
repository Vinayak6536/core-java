package com.self.bankaccount.user.accounts;

import com.self.bankaccount.user.details.AccountDetails;
import com.self.bankaccount.validation.BankValidation;

public class AdultAccount {
    AccountDetails accountDetails;
    BankValidation bankValidation;
    public boolean createAdultAccount(AccountDetails details){
        boolean isAdultAccountValid=false;

        if(details.getAge()>=18){

            isAdultAccountValid=true;
        }
        else {

        }

        return isAdultAccountValid;
    }
    public  void getAdultAccountDetails(){
        System.out.println("It Is Adult Account");
        System.out.println("Account Details Feached.....");
        System.out.println("First Name:" + accountDetails.getFirstName());
        System.out.println("Last Name:" + accountDetails.getLastName());
        System.out.println("Gender:" + accountDetails.getGender());
        System.out.println("Age:" + accountDetails.getAge());
        System.out.println("DOB:" + accountDetails.getDob());
        System.out.println("Adhar No:" + accountDetails.getAdharNo());
        System.out.println("Pan No:" + accountDetails.getPanNo());
        System.out.println("Mob No:" + accountDetails.getMobNo());
        System.out.println("Email Id:" + accountDetails.getEmailId());
        System.out.println("Address:" + accountDetails.getAddress());
    }
}
