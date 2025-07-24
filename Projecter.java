class Projecter{
    static int maxVolume=7;
    static int minVolume=0;
    static boolean isConnected;
    static int currentVolume;
    public static void onOrOff()
    {
        if(isConnected == false){
            isConnected = true;
            System.out.println("Projecter is on");
        }else{
            System.out.println("Projecter off");
        }
    }

    public static void increaseVolume(){
        System.out.println("Incresevolume is started");
        if(isConnected==true){
            if(currentVolume < maxVolume){
                currentVolume=currentVolume+1;
                System.out.println("The current Volume is :"+currentVolume);
            }else{
                System.out.println("The MaxVolume Reached.....");
            }
        }else{
            System.out.println("Turn on the Projecter");
        }
        
    }
    public static void decreaseVolume(){
        System.out.println("decresevolume is started");
        if(isConnected==true){
            if(currentVolume > minVolume){
                currentVolume=currentVolume-1;
                System.out.println("The current Volume is :"+currentVolume);
            }else{
                System.out.println("The MinVolume Reached.....");
            }
        }else{
            System.out.println("Turn on the Projecter");
        }
        
    }

}