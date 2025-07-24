class  UUCMS{
    static String userName;
    static String password;
    public static boolean userLogin(String uName,String pass){
        boolean isAlreadyUsed = false;
        boolean userNameValid=false;
         boolean passwordValid=false;
         if( uName != null){
            userName = uName;
            userNameValid = true;

         }

         if(pass != null){
            password = pass;
            passwordValid = true;
         }
         if(userNameValid == true && passwordValid == true){
            isAlreadyUsed = true;

         }
        
         return  isAlreadyUsed;

    }
    
        
    
    public static void getUserInfo(){
        System.out.println("The User Name is:"+userName);
        System.out.println("The Password is:"+password);
       
    }
    

    }
