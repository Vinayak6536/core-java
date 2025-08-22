package com.xworkz.bank.currentaccount;

import com.xworkz.bank.bankaccount.BankAccount;

public class CurrentAccount extends BankAccount {

//    public CurrentAccount(){
//
//    }

    public CurrentAccount(double minBalance){
        this.credit(minBalance);
    }
}
