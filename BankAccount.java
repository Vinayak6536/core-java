class BankAccount{
    static double balance ;


    public static boolean credit(double  amount){
        boolean isCredited=false;
        boolean var = amount > 0.00;
        if(var)
        {
            
        balance = balance + amount ;
        System.out.println("The Credited Amount Is:"+amount);
        System.out.println("Credited Successfully");
        isCredited=true;
        
    }
        else 
        {System.out.println("Amountshouldnotbegreaterthanzero");}
        return isCredited;
    }
    public static boolean debit(double  amount){
        boolean isDebited=false;
        boolean check = amount <= balance;
        if(check){
       balance=balance - amount;
       System.out.println("The Debited Amount Is:"+amount);
       System.out.println("Debited Successfully");
       isDebited=true;
       }
       else {System.out.println("No funds Available");}
       return isDebited;
    }
}