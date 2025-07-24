class Facebook1Runner{
    public static void main(String[] facebook){
        boolean UserAlreadyRegestered = Facebook1.userRegestration("Bharat","Manguli");
        System.out.println(" Is user Already Registered"+UserAlreadyRegestered);

        Facebook1.getUserInfo();
        Facebook1.Date();
    }
}