class PassportSeva {
    static String givenName;
    static String surName;
    static String password;
    static String confirmPassword;
    public static boolean register(String gName,String sName,String pwd,String cPWD){
        boolean isUserRegistered = false;
        boolean givenNameValid=false;
        boolean surNameValid=false;
         boolean passwordValid=false;
         boolean confirmPasswordValid=false;
         
         if( gName != null){
            givenName = gName;
            givenNameValid = true;

         }else{
            System.out.println("Give Valid Name");
         }
         if( sName != null){
            surName = sName;
            surNameValid = true;

         }else{
            System.out.println("Give Valid surName");
         }

         if(pwd != null){
            password = pwd;
            passwordValid = true;
         }else{
            System.out.println("Given Valid Password");
         }

         if(cPWD != null && cPWD==pwd){
            confirmPassword = cPWD;
            confirmPasswordValid = true;
         }else{
            System.out.println("Given Same as a Password");
         }
         
         if(givenNameValid == true && surNameValid == true && passwordValid == true && confirmPasswordValid == true){
            isUserRegistered = true;

         }
        
         return  isUserRegistered;

    }
    
        
    
    public static void getUserInfo(){
        System.out.println("The Given Name is:"+givenName);
        System.out.println("The Given SurName is:"+surName);
        System.out.println("The Given Password is:"+password);
        System.out.println("The Given ConfirmPassword is:"+confirmPassword);
       
    }
    

    }
