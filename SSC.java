class  SSC{
    static String userName;
    static String password;
    static String ForgotPasswod;
    public static boolean userLogin(String uName,String pass,String fPass){
        boolean isAlreadyRegister = false;
        boolean userNameValid=false;
         boolean passwordValid=false;
         boolean ForgotPasswodValid=false;
         if( uName != null){
            userName = uName;
            userNameValid = true;

         }

         if(pass != null){
            password = pass;
            passwordValid = true;
         }
         
         if(fPass != null){
            ForgotPasswod = fPass;
            ForgotPasswodValid=true;
         }
         if(userNameValid == true && passwordValid == true && ForgotPasswodValid==true){
            isAlreadyRegister = true;

         }
        
         return  isAlreadyRegister;

    }
    
        
    
    public static void getUserInfo(){
        System.out.println("The User Name is:"+userName);
        System.out.println("The Password is:"+password);
        System.out.println("The Forgot Passwoed Is:"+ForgotPasswod);
       
    }
    

    }
