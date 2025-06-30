public class Th {

    public static String name;
    public static int screens;
    public static int seatingCapacity;
    public static boolean has3D;
    public static boolean hasIMAX;
    public static String[] runningMovies;
    public static double ticketPrice;
    public static boolean hasSnacksCounter;
    public static String location;
    public static String contactNumber;
    public static String email;
    public static boolean openOnWeekends;
    public static String openingTime;
    public static String closingTime;
    public static int staffCount;
    public static boolean parkingAvailable;
    public static double areaSqFt;
    public static String managerName;
    public static String established;
    public static String website;

    public static void main(String[] args) {

        System.out.println("name = " + name);
        name = "Grand Cinema";
        System.out.println("name = " + name);

        System.out.println("screens = " + screens);
        screens = 8;
        System.out.println("screens = " + screens);

        System.out.println("seatingCapacity = " + seatingCapacity);
        seatingCapacity = 1200;
        System.out.println("seatingCapacity = " + seatingCapacity);

        System.out.println("has3D = " + has3D);
        has3D = true;
        System.out.println("has3D = " + has3D);

        System.out.println("hasIMAX = " + hasIMAX);
        hasIMAX = false;
        System.out.println("hasIMAX = " + hasIMAX);

        System.out.println("runningMovies = " + runningMovies);
        runningMovies = new String[]{"Movie A", "Movie B", "Movie C"};
        System.out.println("runningMovies = " + String.join(", ", runningMovies));

        System.out.println("ticketPrice = " + ticketPrice);
        ticketPrice = 12.50;
        System.out.println("ticketPrice = " + ticketPrice);

        System.out.println("hasSnacksCounter = " + hasSnacksCounter);
        hasSnacksCounter = true;
        System.out.println("hasSnacksCounter = " + hasSnacksCounter);

        System.out.println("location = " + location);
        location = "City Mall";
        System.out.println("location = " + location);

        System.out.println("contactNumber = " + contactNumber);
        contactNumber = "555-5678";
        System.out.println("contactNumber = " + contactNumber);

        System.out.println("email = " + email);
        email = "info@grandcinema.com";
        System.out.println("email = " + email);

        System.out.println("openOnWeekends = " + openOnWeekends);
        openOnWeekends = true;
        System.out.println("openOnWeekends = " + openOnWeekends);

        System.out.println("openingTime = " + openingTime);
        openingTime = "10:00 AM";
        System.out.println("openingTime = " + openingTime);

        System.out.println("closingTime = " + closingTime);
        closingTime = "11:00 PM";
        System.out.println("closingTime = " + closingTime);

        System.out.println("staffCount = " + staffCount);
        staffCount = 25;
        System.out.println("staffCount = " + staffCount);

        System.out.println("parkingAvailable = " + parkingAvailable);
        parkingAvailable = true;
        System.out.println("parkingAvailable = " + parkingAvailable);

        System.out.println("areaSqFt = " + areaSqFt);
        areaSqFt = 8000;
        System.out.println("areaSqFt = " + areaSqFt);

        System.out.println("managerName = " + managerName);
        managerName = "Bob Johnson";
        System.out.println("managerName = " + managerName);

        System.out.println("established = " + established);
        established = "2005-08-15";
        System.out.println("established = " + established);

        System.out.println("website = " + website);
        website = "www.grandcinema.com";
        System.out.println("website = " + website);
    }
}
