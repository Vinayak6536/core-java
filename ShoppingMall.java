public class ShoppingMall {

    public static String name;
    public static String location;
    public static int totalStores;
    public static double areaSqFt;
    public static boolean hasFoodCourt;
    public static String[] anchorTenants;
    public static int parkingSpots;
    public static boolean hasPlayArea;
    public static String openingTime;
    public static String closingTime;
    public static int floors;
    public static boolean isOpenOnHolidays;
    public static String[] facilities;
    public static String managementContact;
    public static String website;
    public static boolean hasValet;
    public static boolean hasSecurity;
    public static int elevatorCount;
    public static String email;
    public static int establishedYear;

    public static void main(String[] args) {

        System.out.println("name = " + name);
        name = "City Plaza Mall";
        System.out.println("name = " + name);

        System.out.println("location = " + location);
        location = "Uptown";
        System.out.println("location = " + location);

        System.out.println("totalStores = " + totalStores);
        totalStores = 150;
        System.out.println("totalStores = " + totalStores);

        System.out.println("areaSqFt = " + areaSqFt);
        areaSqFt = 300000;
        System.out.println("areaSqFt = " + areaSqFt);

        System.out.println("hasFoodCourt = " + hasFoodCourt);
        hasFoodCourt = true;
        System.out.println("hasFoodCourt = " + hasFoodCourt);

        System.out.println("anchorTenants = " + anchorTenants);
        anchorTenants = new String[]{"SuperMart", "CineWorld", "HomeStyle"};
        System.out.println("anchorTenants = " + String.join(", ", anchorTenants));

        System.out.println("parkingSpots = " + parkingSpots);
        parkingSpots = 1000;
        System.out.println("parkingSpots = " + parkingSpots);

        System.out.println("hasPlayArea = " + hasPlayArea);
        hasPlayArea = true;
        System.out.println("hasPlayArea = " + hasPlayArea);

        System.out.println("openingTime = " + openingTime);
        openingTime = "10:00 AM";
        System.out.println("openingTime = " + openingTime);

        System.out.println("closingTime = " + closingTime);
        closingTime = "10:00 PM";
        System.out.println("closingTime = " + closingTime);

        System.out.println("floors = " + floors);
        floors = 4;
        System.out.println("floors = " + floors);

        System.out.println("isOpenOnHolidays = " + isOpenOnHolidays);
        isOpenOnHolidays = false;
        System.out.println("isOpenOnHolidays = " + isOpenOnHolidays);

        System.out.println("facilities = " + facilities);
        facilities = new String[]{"Restrooms", "ATM", "WiFi"};
        System.out.println("facilities = " + String.join(", ", facilities));

        System.out.println("managementContact = " + managementContact);
        managementContact = "555-3456";
        System.out.println("managementContact = " + managementContact);

        System.out.println("website = " + website);
        website = "www.cityplazamall.com";
        System.out.println("website = " + website);

        System.out.println("hasValet = " + hasValet);
        hasValet = true;
        System.out.println("hasValet = " + hasValet);

        System.out.println("hasSecurity = " + hasSecurity);
        hasSecurity = true;
        System.out.println("hasSecurity = " + hasSecurity);

        System.out.println("elevatorCount = " + elevatorCount);
        elevatorCount = 8;
        System.out.println("elevatorCount = " + elevatorCount);

        System.out.println("email = " + email);
        email = "info@cityplazamall.com";
        System.out.println("email = " + email);

        System.out.println("establishedYear = " + establishedYear);
        establishedYear = 2000;
        System.out.println("establishedYear = " + establishedYear);
    }
}
