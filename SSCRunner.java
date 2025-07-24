class SSCRunner{
    public static void main(String[] login){
        boolean isAlreadyRegister = SSC.userLogin("Abc","Abc@123","Ssc@234");
        System.out.println(" Is user Already Registered:"+isAlreadyRegister);

        SSC.getUserInfo();
        
    }
}