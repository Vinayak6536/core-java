class TV{
    static int maxVolume=10;
    static int minVolume=0;
    static boolean isConnected;
    static int currentVolume;
    public static void onOrOff()
    {
        if(isConnected == false){
            isConnected = true;
            System.out.println("TV is on");
        }else{
            System.out.println("TV off");
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
            System.out.println("Turn on the TV");
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
            System.out.println("Turn on the TV");
        }
        
    }

}