public class Temple {

    public static String name;
    public static String location;
    public static int builtYear;
    public static String deity;
    public static double areaSqFt;
    public static boolean hasPriest;
    public static int dailyVisitors;
    public static boolean isOpenAllDays;
    public static String openingTime;
    public static String closingTime;
    public static String[] festivals;
    public static boolean hasParking;
    public static boolean hasAccommodation;
    public static String website;
    public static String email;
    public static String contactNumber;
    public static String management;
    public static String architectureStyle;
    public static boolean hasGarden;
    public static int numberOfPriests;

    public static void main(String[] args) {

        System.out.println("name = " + name);
        name = "Sacred Temple";
        System.out.println("name = " + name);

        System.out.println("location = " + location);
        location = "Hilltop";
        System.out.println("location = " + location);

        System.out.println("builtYear = " + builtYear);
        builtYear = 1800;
        System.out.println("builtYear = " + builtYear);

        System.out.println("deity = " + deity);
        deity = "Divine Spirit";
        System.out.println("deity = " + deity);

        System.out.println("areaSqFt = " + areaSqFt);
        areaSqFt = 5000;
        System.out.println("areaSqFt = " + areaSqFt);

        System.out.println("hasPriest = " + hasPriest);
        hasPriest = true;
        System.out.println("hasPriest = " + hasPriest);

        System.out.println("dailyVisitors = " + dailyVisitors);
        dailyVisitors = 300;
        System.out.println("dailyVisitors = " + dailyVisitors);

        System.out.println("isOpenAllDays = " + isOpenAllDays);
        isOpenAllDays = true;
        System.out.println("isOpenAllDays = " + isOpenAllDays);

        System.out.println("openingTime = " + openingTime);
        openingTime = "05:00 AM";
        System.out.println("openingTime = " + openingTime);

        System.out.println("closingTime = " + closingTime);
        closingTime = "10:00 PM";
        System.out.println("closingTime = " + closingTime);

        System.out.println("festivals = " + festivals);
        festivals = new String[]{"Spring Fest", "Harvest Fest"};
        System.out.println("festivals = " + String.join(", ", festivals));

        System.out.println("hasParking = " + hasParking);
        hasParking = true;
        System.out.println("hasParking = " + hasParking);

        System.out.println("hasAccommodation = " + hasAccommodation);
        hasAccommodation = false;
        System.out.println("hasAccommodation = " + hasAccommodation);

        System.out.println("website = " + website);
        website = "www.sacredtemple.org";
        System.out.println("website = " + website);

        System.out.println("email = " + email);
        email = "info@sacredtemple.org";
        System.out.println("email = " + email);

        System.out.println("contactNumber = " + contactNumber);
        contactNumber = "555-2345";
        System.out.println("contactNumber = " + contactNumber);

        System.out.println("management = " + management);
        management = "Temple Trust";
        System.out.println("management = " + management);

        System.out.println("architectureStyle = " + architectureStyle);
        architectureStyle = "Ancient";
        System.out.println("architectureStyle = " + architectureStyle);

        System.out.println("hasGarden = " + hasGarden);
        hasGarden = true;
        System.out.println("hasGarden = " + hasGarden);

        System.out.println("numberOfPriests = " + numberOfPriests);
        numberOfPriests = 3;
        System.out.println("numberOfPriests = " + numberOfPriests);
    }
}
