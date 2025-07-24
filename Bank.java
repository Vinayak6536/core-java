class  Bank{
    static String bankName;
    static int pincode;
    static String manager;
    public static boolean details(String bName,int pin,String mName){
        boolean isSafeBank = false;
        boolean bNameValid=false;
         boolean pinValid=false;
         boolean nameValid=false;
         if( bName != null){
            bankName = bName;
            bNameValid = true;

         }

         if(pin != 0 ){
            pincode = pin;
            pinValid = true;
         }
         if (mName != null){
            manager = mName;
            nameValid=true;
         }
         if(bNameValid == true && pinValid == true && nameValid==true){
            isSafeBank = true;

         }
        
         return  isSafeBank;

    }
    
        
    
    public static void getBankInfo(){
        System.out.println("The Bank Name is:"+bankName);
        System.out.println("The Bank Pincode is:"+pincode);
        System.out.println("The Bank Manager Name is:"+manager);
       
    }
    

    }
