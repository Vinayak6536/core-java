public class Stadium {

    public static String name;
    public static String location;
    public static int capacity;
    public static String sportType;
    public static boolean hasRoof;
    public static boolean floodlights;
    public static int yearBuilt;
    public static String surfaceType;
    public static boolean isMultipurpose;
    public static String owner;
    public static double areaSqFt;
    public static boolean hasVIPBox;
    public static boolean hasScoreboard;
    public static int parkingSpots;
    public static boolean hasMetroAccess;
    public static boolean hasFoodCourt;
    public static boolean hasMedicalRoom;
    public static String architect;
    public static String[] hostedEvents;
    public static String contact;

    public static void main(String[] args) {

        System.out.println("name = " + name);
        name = "National Arena";
        System.out.println("name = " + name);

        System.out.println("location = " + location);
        location = "City Central";
        System.out.println("location = " + location);

        System.out.println("capacity = " + capacity);
        capacity = 70000;
        System.out.println("capacity = " + capacity);

        System.out.println("sportType = " + sportType);
        sportType = "Football";
        System.out.println("sportType = " + sportType);

        System.out.println("hasRoof = " + hasRoof);
        hasRoof = true;
        System.out.println("hasRoof = " + hasRoof);

        System.out.println("floodlights = " + floodlights);
        floodlights = true;
        System.out.println("floodlights = " + floodlights);

        System.out.println("yearBuilt = " + yearBuilt);
        yearBuilt = 1998;
        System.out.println("yearBuilt = " + yearBuilt);

        System.out.println("surfaceType = " + surfaceType);
        surfaceType = "Grass";
        System.out.println("surfaceType = " + surfaceType);

        System.out.println("isMultipurpose = " + isMultipurpose);
        isMultipurpose = true;
        System.out.println("isMultipurpose = " + isMultipurpose);

        System.out.println("owner = " + owner);
        owner = "City Sports Authority";
        System.out.println("owner = " + owner);

        System.out.println("areaSqFt = " + areaSqFt);
        areaSqFt = 250000;
        System.out.println("areaSqFt = " + areaSqFt);

        System.out.println("hasVIPBox = " + hasVIPBox);
        hasVIPBox = true;
        System.out.println("hasVIPBox = " + hasVIPBox);

        System.out.println("hasScoreboard = " + hasScoreboard);
        hasScoreboard = true;
        System.out.println("hasScoreboard = " + hasScoreboard);

        System.out.println("parkingSpots = " + parkingSpots);
        parkingSpots = 2000;
        System.out.println("parkingSpots = " + parkingSpots);

        System.out.println("hasMetroAccess = " + hasMetroAccess);
        hasMetroAccess = true;
        System.out.println("hasMetroAccess = " + hasMetroAccess);

        System.out.println("hasFoodCourt = " + hasFoodCourt);
        hasFoodCourt = true;
        System.out.println("hasFoodCourt = " + hasFoodCourt);

        System.out.println("hasMedicalRoom = " + hasMedicalRoom);
        hasMedicalRoom = true;
        System.out.println("hasMedicalRoom = " + hasMedicalRoom);

        System.out.println("architect = " + architect);
        architect = "DesignCo";
        System.out.println("architect = " + architect);

        System.out.println("hostedEvents = " + hostedEvents);
        hostedEvents = new String[]{"World Cup", "Concert", "Olympics"};
        System.out.println("hostedEvents = " + String.join(", ", hostedEvents));

        System.out.println("contact = " + contact);
        contact = "stadium@arena.com";
        System.out.println("contact = " + contact);
    }
}
