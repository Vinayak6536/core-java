class UUCMSRunner{
    public static void main(String[] login){
        boolean isAlreadyUsed = UUCMS.userLogin("Abc","Abc@123");
        System.out.println(" Is user Already Registered:"+isAlreadyUsed);

        UUCMS.getUserInfo();
        
    }
}