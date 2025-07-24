class PassportSevaRunner{
    public static void main(String[] seva){
        boolean isUserRegistered = PassportSeva.register("XYZ","Abc@123","Ab@123");
        System.out.println(" Is user Already Registered:"+isUserRegistered);

        PassportSeva.getUserInfo();
        
    }
}