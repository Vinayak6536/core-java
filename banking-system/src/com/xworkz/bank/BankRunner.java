package com.xworkz.bank;

import com.xworkz.bank.bankaccount.BankAccount;
import com.xworkz.bank.currentaccount.CurrentAccount;
import com.xworkz.bank.multiplebankaccounts.HdfcCurrentAccount;
import com.xworkz.bank.multiplebankaccounts.HdfcSavingsAccount;
import com.xworkz.bank.savingaccount.SavingsAccount;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        BankAccount veereshAccount=new BankAccount();
        veereshAccount.credit(200000.00);
        veereshAccount.debit(2000.00);
        System.out.println("Veeresh Current Balance:"+veereshAccount.getBalance());

        BankAccount devsSavingsAccount=new SavingsAccount();
        devsSavingsAccount.credit(2000.00);
        System.out.println("Devs Savings Account Current Balance:"+devsSavingsAccount.getBalance());

        BankAccount devsCurrentAccount=new CurrentAccount(1000.00);
        devsCurrentAccount.credit(5000.70);
        System.out.println("Devs Current Account Current Balance:"+devsCurrentAccount.getBalance());

        BankAccount darsiSavingsAccount=new SavingsAccount();
        darsiSavingsAccount.credit(50000.80);
        System.out.println("Darshi Savings Account Current Balance:"+darsiSavingsAccount.getBalance());

        BankAccount darshiCurrentAccount=new CurrentAccount(2000.00);
        darshiCurrentAccount.credit(40000.90);
        System.out.println("Darshi Current Account Current Balance:"+darshiCurrentAccount.getBalance());

        BankAccount bharatSavingsAccount=new SavingsAccount();
        bharatSavingsAccount.credit(80000.90);
        System.out.println("Bharat Savings Account Current Balance:"+bharatSavingsAccount.getBalance());

        BankAccount bharatCurrentAccount=new CurrentAccount(1000.00);
        bharatCurrentAccount.credit(90000.90);
        bharatCurrentAccount.debit(8000.80);
        System.out.println("Bharat Current Account Current Balance:"+bharatCurrentAccount.getBalance());

        veereshAccount.transfer(darshiCurrentAccount,5000.89);
        System.out.println("Veeresh Current Balance"+veereshAccount.getBalance());
        System.out.println("Devs Current Account Current Balance:"+devsCurrentAccount.getBalance());



        darshiCurrentAccount.transfer(darsiSavingsAccount,8000.80);
        System.out.println("Devs Current Account Current Balance:"+devsCurrentAccount.getBalance());
        System.out.println("Darshi Savings Account Current Balance:"+darsiSavingsAccount.getBalance());


        darsiSavingsAccount.transfer(devsCurrentAccount,6000.80);
        System.out.println("Darshi Savings Account Current Balance:"+darsiSavingsAccount.getBalance());
        System.out.println("Devs Current Account Current Balance:"+devsCurrentAccount.getBalance());

        devsSavingsAccount.transfer(bharatSavingsAccount,9000.80);
        System.out.println("Devs Savings Account Current Balance:"+devsSavingsAccount.getBalance());
        System.out.println("Bharat Savings Account Current Balance:"+bharatSavingsAccount.getBalance());

        System.out.println("Bharat Current Account Current Balance:"+bharatCurrentAccount.getBalance());
        bharatCurrentAccount.transfer(veereshAccount,5000.70);

        System.out.println("Veeresh Current Balance:"+veereshAccount.getBalance());
        System.out.println("Bharat Current Account Current Balance:"+bharatCurrentAccount.getBalance());

        BankAccount abhiHdfcSavingAccount=new HdfcSavingsAccount();
        abhiHdfcSavingAccount.credit(10000.00);
        System.out.println("Abhi Hdfc Savings Account CurrentBalance is:"+abhiHdfcSavingAccount.getBalance());


        BankAccount friendAccount=new SavingsAccount();
        veereshAccount.transfer(friendAccount,3000.00);

        BankAccount abhiHdfcAccount=new HdfcSavingsAccount();
        abhiHdfcAccount.credit(1200.00);
        System.out.println( "Abhi Hdfc Current Balance:"+abhiHdfcAccount.getBalance());


        abhiHdfcSavingAccount.transfer(abhiHdfcAccount,900);
        System.out.println( "Abhi Hdfc Current Balance:"+abhiHdfcAccount.getBalance());

        System.out.println("Veeresh Availavle balance"+veereshAccount.getBalance());
        System.out.println("Darshi Savings Account Available Balance:"+darsiSavingsAccount.getBalance());
        System.out.println("Darshi Current Account Available Balance:"+darshiCurrentAccount.getBalance());
        System.out.println("Bharat Savings Account Available Balance:"+bharatSavingsAccount.getBalance());
        System.out.println("Bharat Current Account Available Balance:"+bharatCurrentAccount.getBalance());
        System.out.println("Devs Savings Account Available Balance:"+devsSavingsAccount.getBalance());
        System.out.println("Devs Current Account Available Balance:"+devsCurrentAccount.getBalance());
        System.out.println("FriendAccount Savings Account Current Balance:"+friendAccount.getBalance());
    }
}
