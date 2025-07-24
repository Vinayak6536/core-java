class Facebook{
    static String fName;
    static String lName;
    
    public static boolean userRegistration(String FirstName,String LastName){
         boolean isUserAlreadyRegistered = false;
         boolean fNameValid=false;
         boolean lNameValid=false;
         if( FirstName != null){
            fName = FirstName;
            fNameValid = true;

         }

         if(LastName != null){
            lName = LastName;
            lNameValid = true;
         }
         if(fNameValid == true && lNameValid == true){
            isUserAlreadyRegistered = true;

         }
        
         return  isUserAlreadyRegistered;

    }
        
    
    public static void getUserInfo(){
        System.out.println("The First Name is:"+fName);
        System.out.println("The Last Name is:"+lName);
    }
}