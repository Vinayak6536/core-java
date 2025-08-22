package com.xworkz.bank.savingaccount;

import com.xworkz.bank.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(){

    }

    public SavingsAccount(double minBalance){
        this.credit(minBalance);
    }
}
