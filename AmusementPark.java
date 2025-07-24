class AmusementPark {
    int parkId;
    String name;
    String location;
    int yearEstablished;
    int numberOfRides;
    boolean hasWaterPark;

    public void getAmusementParkInfo(){
        System.out.println("Park ID: " + parkId);
        System.out.println("Name: " + name);
        System.out.println("Location: " +location);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Has Water Park: " + hasWaterPark);
    }
}