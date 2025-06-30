public class PoliceStation {
    public static String name = "Central Police Station";
    public static String address = "45 Justice Rd.";
    public static int stationCode = 101;
    public static String commissioner = "Inspector John Smith";
    public static int totalOfficers = 120;
    public static boolean hasArmsDept = true;
    public static boolean hasTrafficUnit = true;
    public static boolean hasCyberCell = false;
    public static int totalCells = 10;
    public static boolean hasWatchTower = true;
    public static String jurisdiction = "City Center";
    public static double landAreaSqFt = 5000.0;
    public static boolean open24x7 = true;
    public static String contactNumber = "100";
    public static String[] vehicles = {"Patrol Car","Motorcycle","Van"};
    public static int holdingCapacity = 50;
    public static boolean hasCCTV = true;
    public static String established = "1970-05-12";
    public static boolean hasLab = true;
    public static String email = "info@cps.gov";

    public static void main(String[] args) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("stationCode = " + stationCode);
        System.out.println("commissioner = " + commissioner);
        System.out.println("totalOfficers = " + totalOfficers);
        System.out.println("hasArmsDept = " + hasArmsDept);
        System.out.println("hasTrafficUnit = " + hasTrafficUnit);
        System.out.println("hasCyberCell = " + hasCyberCell);
        System.out.println("totalCells = " + totalCells);
        System.out.println("hasWatchTower = " + hasWatchTower);
        System.out.println("jurisdiction = " + jurisdiction);
        System.out.println("landAreaSqFt = " + landAreaSqFt);
        System.out.println("open24x7 = " + open24x7);
        System.out.println("contactNumber = " + contactNumber);
        System.out.println("vehicles = " + String.join(",", vehicles));
        System.out.println("holdingCapacity = " + holdingCapacity);
        System.out.println("hasCCTV = " + hasCCTV);
        System.out.println("established = " + established);
        System.out.println("hasLab = " + hasLab);
        System.out.println("email = " + email);
    }
}
