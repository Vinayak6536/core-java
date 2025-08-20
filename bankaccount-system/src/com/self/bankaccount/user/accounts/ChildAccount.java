package com.self.bankaccount.user.accounts;

import com.self.bankaccount.user.details.AccountDetails;
import com.self.bankaccount.validation.BankValidation;

public class ChildAccount {
    AccountDetails accountDetails;
    BankValidation bankValidation;
    public boolean createChildAccount(AccountDetails details){
        boolean isChildAccount=false;

        if(details.getAge()<18){

            isChildAccount=true;

        }

        return isChildAccount;
    }
    public void getChildAccountDetails(){
        System.out.println("It Is Child Account");
        System.out.println("No Need Pan Number");
        System.out.println("Account Details Feached.....");
        System.out.println("First Name:" + accountDetails.getFirstName());
        System.out.println("Last Name:" + accountDetails.getLastName());
        System.out.println("Gender:" + accountDetails.getGender());
        System.out.println("Age:" + accountDetails.getAge());
        System.out.println("DOB:" + accountDetails.getDob());
        System.out.println("Adhar No:" + accountDetails.getAdharNo());
        // System.out.println("Pan No:" + accountDetails.getPanNo());
        System.out.println("Mob No:" + accountDetails.getMobNo());
        System.out.println("Email Id:" + accountDetails.getEmailId());
        System.out.println("Address:" + accountDetails.getAddress());
    }
}
