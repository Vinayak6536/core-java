class FacebookRunner{
    public static void main(String[] facebook){
        boolean UserAlreadyRegistered = Facebook.userRegistration("Bharat","Manguli");
        System.out.println(" Is user Already Registered"+UserAlreadyRegistered);

        Facebook.getUserInfo();
    }
}