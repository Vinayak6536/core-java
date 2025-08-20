package com.self.bankaccount.runner;

import com.self.bankaccount.user.accounts.AdultAccount;
import com.self.bankaccount.user.accounts.ChildAccount;
import com.self.bankaccount.user.details.AccountDetails;
import com.self.bankaccount.validation.BankValidation;

public class AccountRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setFirstName("Darshan");
        accountDetails.setLastName("O");
        accountDetails.setGender("Male");
        accountDetails.setAge(19);
        accountDetails.setDob("12/08/2008");
        accountDetails.setAdharNo(767500795494l);
        accountDetails.setPanNo("5647EPH657H");
        accountDetails.setMobNo(898347487585l);
        accountDetails.setEmailId("Dars12@Gmail.com");
        accountDetails.setAddress("At post Chitradurga");

        BankValidation bankValidation = new BankValidation();
        boolean result = bankValidation.createAccountValidation(accountDetails);
        if (result) {

                ChildAccount childAccount = new ChildAccount();
                boolean child = childAccount.createChildAccount(accountDetails);
                if (child) {
                    AdultAccount adultAccount = new AdultAccount();
                    boolean adult = adultAccount.createAdultAccount(accountDetails);
                    if (adult) {
                        adultAccount.getAdultAccountDetails();
                    } else {

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
                    else {
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
        System.out.println("Main Ended");
        }

    }






