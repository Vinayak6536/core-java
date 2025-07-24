

class Facebook1{
    static String fName;
    static String lName;
    
    public static boolean userRegestration(String FirstName,String LastName){
         boolean isUserAlreadyRegestered = false;
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
            isUserAlreadyRegestered = true;

         }
        
         return  isUserAlreadyRegestered;

    }
    
        
    
    public static void getUserInfo(){
        System.out.println("The First Name is:"+fName);
        System.out.println("The Last Name is:"+lName);
       
    }
    public static void Date(){
      String DOB = "12/08/2002";
      System.out.println("Date of Birt IS:"+DOB);
    }
}