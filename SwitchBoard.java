public class SwitchBoard {

    public static int totalSwitches;
    public static String manufacturer;
    public static boolean isSmart;
    public static String model;
    public static String voltage;
    public static int currentRating;
    public static boolean hasIndicator;
    public static String color;
    public static double weight;
    public static String material;
    public static boolean waterproof;
    public static String installationType;
    public static int warrantyMonths;
    public static String serialNumber;
    public static String[] supportedAppliances;
    public static double price;
    public static String countryOfOrigin;
    public static boolean isROHSCompliant;
    public static String protectionClass;
    public static String[] certifications;

    public static void main(String[] args) {

        System.out.println("totalSwitches = " + totalSwitches);
        totalSwitches = 10;
        System.out.println("totalSwitches = " + totalSwitches);

        System.out.println("manufacturer = " + manufacturer);
        manufacturer = "ElectroCo";
        System.out.println("manufacturer = " + manufacturer);

        System.out.println("isSmart = " + isSmart);
        isSmart = true;
        System.out.println("isSmart = " + isSmart);

        System.out.println("model = " + model);
        model = "SB-1000";
        System.out.println("model = " + model);

        System.out.println("voltage = " + voltage);
        voltage = "240V";
        System.out.println("voltage = " + voltage);

        System.out.println("currentRating = " + currentRating);
        currentRating = 16;
        System.out.println("currentRating = " + currentRating);

        System.out.println("hasIndicator = " + hasIndicator);
        hasIndicator = true;
        System.out.println("hasIndicator = " + hasIndicator);

        System.out.println("color = " + color);
        color = "White";
        System.out.println("color = " + color);

        System.out.println("weight = " + weight);
        weight = 0.5;
        System.out.println("weight = " + weight);

        System.out.println("material = " + material);
        material = "Plastic";
        System.out.println("material = " + material);

        System.out.println("waterproof = " + waterproof);
        waterproof = false;
        System.out.println("waterproof = " + waterproof);

        System.out.println("installationType = " + installationType);
        installationType = "Wall-mounted";
        System.out.println("installationType = " + installationType);

        System.out.println("warrantyMonths = " + warrantyMonths);
        warrantyMonths = 24;
        System.out.println("warrantyMonths = " + warrantyMonths);

        System.out.println("serialNumber = " + serialNumber);
        serialNumber = "SN12345";
        System.out.println("serialNumber = " + serialNumber);

        System.out.println("supportedAppliances = " + supportedAppliances);
        supportedAppliances = new String[]{"Light", "Fan", "AC"};
        System.out.println("supportedAppliances = " + String.join(", ", supportedAppliances));

        System.out.println("price = " + price);
        price = 29.99;
        System.out.println("price = " + price);

        System.out.println("countryOfOrigin = " + countryOfOrigin);
        countryOfOrigin = "India";
        System.out.println("countryOfOrigin = " + countryOfOrigin);

        System.out.println("isROHSCompliant = " + isROHSCompliant);
        isROHSCompliant = true;
        System.out.println("isROHSCompliant = " + isROHSCompliant);

        System.out.println("protectionClass = " + protectionClass);
        protectionClass = "IP20";
        System.out.println("protectionClass = " + protectionClass);

        System.out.println("certifications = " + certifications);
        certifications = new String[]{"CE", "UL"};
        System.out.println("certifications = " + String.join(", ", certifications));
    }
}
