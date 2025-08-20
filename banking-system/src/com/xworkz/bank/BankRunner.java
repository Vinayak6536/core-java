package com.xworkz.bank;

import com.xworkz.bank.bankaccount.BankAccount;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        BankAccount veereshAccount=new BankAccount();
        veereshAccount.credit(20000.00);
        veereshAccount.debit(2000.00);

        BankAccount friendAccount=new BankAccount();
        friendAccount.transfer(friendAccount,3000.00);


        System.out.println("Veeresh Availavle balance"+veereshAccount.getBalance());
    }
}
