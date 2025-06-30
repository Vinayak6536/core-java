public class Gym {

    static String name;
    static String location;
    static int totalMachines;
    static boolean hasPool;
    static String[] equipment;
    static double monthlyFee;
    static String membershipType;
    static int trainers;
    static boolean open24x7;
    static String openingTime;
    static String closingTime;
    static boolean hasSauna;
    static boolean hasYoga;
    static int maxCapacity;
    static double areaSqFt;
    static boolean freeParking;
    static String contactNumber;
    static String email;
    static int establishedYear;
    static String ownerName;

    public static void main(String[] args) {

        System.out.println("Name: " + name);
        name = "FitLife Gym";
        System.out.println("Name: " + name);

        System.out.println("Location: " + location);
        location = "Downtown Plaza";
        System.out.println("Location: " + location);

        System.out.println("Total Machines: " + totalMachines);
        totalMachines = 30;
        System.out.println("Total Machines: " + totalMachines);

        System.out.println("Has Pool: " + hasPool);
        hasPool = true;
        System.out.println("Has Pool: " + hasPool);

        System.out.println("Equipment: " + equipment);
        equipment = new String[]{"Treadmill", "Bench Press", "Rowing Machine"};
        System.out.println("Equipment: " + String.join(", ", equipment));

        System.out.println("Monthly Fee: " + monthlyFee);
        monthlyFee = 49.99;
        System.out.println("Monthly Fee: " + monthlyFee);

        System.out.println("Membership Type: " + membershipType);
        membershipType = "Premium";
        System.out.println("Membership Type: " + membershipType);

        System.out.println("Trainers: " + trainers);
        trainers = 5;
        System.out.println("Trainers: " + trainers);

        System.out.println("Open 24x7: " + open24x7);
        open24x7 = false;
        System.out.println("Open 24x7: " + open24x7);

        System.out.println("Opening Time: " + openingTime);
        openingTime = "06:00 AM";
        System.out.println("Opening Time: " + openingTime);

        System.out.println("Closing Time: " + closingTime);
        closingTime = "10:00 PM";
        System.out.println("Closing Time: " + closingTime);

        System.out.println("Has Sauna: " + hasSauna);
        hasSauna = true;
        System.out.println("Has Sauna: " + hasSauna);

        System.out.println("Has Yoga: " + hasYoga);
        hasYoga = true;
        System.out.println("Has Yoga: " + hasYoga);

        System.out.println("Max Capacity: " + maxCapacity);
        maxCapacity = 200;
        System.out.println("Max Capacity: " + maxCapacity);

        System.out.println("Area (sqft): " + areaSqFt);
        areaSqFt = 4000;
        System.out.println("Area (sqft): " + areaSqFt);

        System.out.println("Free Parking: " + freeParking);
        freeParking = true;
        System.out.println("Free Parking: " + freeParking);

        System.out.println("Contact Number: " + contactNumber);
        contactNumber = "555-1234";
        System.out.println("Contact Number: " + contactNumber);

        System.out.println("Email: " + email);
        email = "contact@fitlife.com";
        System.out.println("Email: " + email);

        System.out.println("Established Year: " + establishedYear);
        establishedYear = 2010;
        System.out.println("Established Year: " + establishedYear);

        System.out.println("Owner Name: " + ownerName);
        ownerName = "Alice Smith";
        System.out.println("Owner Name: " + ownerName);
    }
}
