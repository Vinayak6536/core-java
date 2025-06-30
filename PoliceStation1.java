public class PoliceStation1 {

    public static String name;
    public static String address;
    public static int stationCode;
    public static String commissioner;
    public static int totalOfficers;
    public static boolean hasArmsDept;
    public static boolean hasTrafficUnit;
    public static boolean hasCyberCell;
    public static int totalCells;
    public static boolean hasWatchTower;
    public static String jurisdiction;
    public static double landAreaSqFt;
    public static boolean open24x7;
    public static String contactNumber;
    public static String[] vehicles;
    public static int holdingCapacity;
    public static boolean hasCCTV;
    public static String established;
    public static boolean hasLab;
    public static String email;

    public static void main(String[] args) {
        System.out.println("name = " + name);
        name = "Central Police Station";
        System.out.println("name = " + name);

        System.out.println("address = " + address);
        address = "45 Justice Rd.";
        System.out.println("address = " + address);

        System.out.println("stationCode = " + stationCode);
        stationCode = 101;
        System.out.println("stationCode = " + stationCode);

        System.out.println("commissioner = " + commissioner);
        commissioner = "Inspector John Smith";
        System.out.println("commissioner = " + commissioner);

        System.out.println("totalOfficers = " + totalOfficers);
        totalOfficers = 120;
        System.out.println("totalOfficers = " + totalOfficers);

        System.out.println("hasArmsDept = " + hasArmsDept);
        hasArmsDept = true;
        System.out.println("hasArmsDept = " + hasArmsDept);

        System.out.println("hasTrafficUnit = " + hasTrafficUnit);
        hasTrafficUnit = true;
        System.out.println("hasTrafficUnit = " + hasTrafficUnit);

        System.out.println("hasCyberCell = " + hasCyberCell);
        hasCyberCell = false;
        System.out.println("hasCyberCell = " + hasCyberCell);

        System.out.println("totalCells = " + totalCells);
        totalCells = 10;
        System.out.println("totalCells = " + totalCells);

        System.out.println("hasWatchTower = " + hasWatchTower);
        hasWatchTower = true;
        System.out.println("hasWatchTower = " + hasWatchTower);

        System.out.println("jurisdiction = " + jurisdiction);
        jurisdiction = "City Center";
        System.out.println("jurisdiction = " + jurisdiction);

        System.out.println("landAreaSqFt = " + landAreaSqFt);
        landAreaSqFt = 5000.0;
        System.out.println("landAreaSqFt = " + landAreaSqFt);

        System.out.println("open24x7 = " + open24x7);
        open24x7 = true;
        System.out.println("open24x7 = " + open24x7);

        System.out.println("contactNumber = " + contactNumber);
        contactNumber = "100";
        System.out.println("contactNumber = " + contactNumber);

        System.out.println("vehicles = " + vehicles);
        vehicles = new String[]{"Patrol Car", "Motorcycle", "Van"};
        System.out.println("vehicles = " + String.join(", ", vehicles));

        System.out.println("holdingCapacity = " + holdingCapacity);
        holdingCapacity = 50;
        System.out.println("holdingCapacity = " + holdingCapacity);

        System.out.println("hasCCTV = " + hasCCTV);
        hasCCTV = true;
        System.out.println("hasCCTV = " + hasCCTV);

        System.out.println("established = " + established);
        established = "1970-05-12";
        System.out.println("established = " + established);

        System.out.println("hasLab = " + hasLab);
        hasLab = true;
        System.out.println("hasLab = " + hasLab);

        System.out.println("email = " + email);
        email = "info@cps.gov";
        System.out.println("email = " + email);
    }
}
