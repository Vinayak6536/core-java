package com.xworkz.bank.bankaccount;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public boolean debit(double amount){
        balance -=amount;
        return false;
    }

    public void credit(double amount){
        balance +=amount;
    }

    public void transfer(BankAccount benificiaryAccount,double amount){
        this.debit(amount);
        benificiaryAccount.credit(amount);
    }
}
