class AC{
    static int maxTemperature=25;
    static int minTemperature=16;
    static boolean isConnected;
    static int currentTemperature=16;
    public static void onOrOff()
    {
        if(isConnected == false){
            isConnected = true;
            System.out.println("AC Temperature is on");
        }else{
            System.out.println("AC Temperature off");
        }
    }

    public static void increaseTemperature(){
        System.out.println("IncreseTemperature is started");
        if(isConnected==true){
            if(currentTemperature < maxTemperature){
                currentTemperature=currentTemperature+1;
                System.out.println("The current Temperature is :"+currentTemperature);
            }else{
                System.out.println("The MaxTemperature Reached.....");
            }
        }else{
            System.out.println("Turn on the AC");
        }
        
    }
    public static void decreaseTemperature(){
        System.out.println("decreseTemperature is started");
        if(isConnected==true){
            if(currentTemperature > minTemperature){
                currentTemperature=currentTemperature-1;
                System.out.println("The current Temperature is :"+currentTemperature);
            }else{
                System.out.println("The MinTemperature Reached.....");
            }
        }else{
            System.out.println("Turn on the AC");
        }
        
    }

}