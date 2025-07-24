class BankAccountRunner{
    public static void main(String[] bank)
    {
      
        System.out.println("main started");
        BankAccount.credit(1000.00);
      System.out.println("The ccurrent balance is:"+BankAccount.balance);
     

       BankAccount.debit(100.00);
      System.out.println("The current Balance is:"+BankAccount.balance);

       
      System.out.println("Main Ended");


    }

}