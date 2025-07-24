class Fan{
    static int maxSpeed=3;
    static int minSpeed=0;
    static boolean isConnected;
    static int currentSpeed;
    public static void onOrOff()
    {
        if(isConnected == false){
            isConnected = true;
            System.out.println("Fan is on");
        }else{
            System.out.println("Fan off");
        }
    }

    public static void increaseSpeed(){
        System.out.println("IncreseSpeed is started");
        if(isConnected==true){
            if(currentSpeed < maxSpeed){
                currentSpeed=currentSpeed+1;
                System.out.println("The current Speed is :"+currentSpeed);
            }else{
                System.out.println("The MaxSpeed Reached.....");
            }
        }else{
            System.out.println("Turn on the Fan");
        }
        
    }
    public static void decreaseSpeed(){
        System.out.println("decreseSpeed is started");
        if(isConnected==true){
            if(currentSpeed > minSpeed){
                currentSpeed=currentSpeed-1;
                System.out.println("The current Speed is :"+currentSpeed);
            }else{
                System.out.println("The MinSpeed Reached.....");
            }
        }else{
            System.out.println("Turn on the Fan");
        }
        
    }

}