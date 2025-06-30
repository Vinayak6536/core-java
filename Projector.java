public class Projector {

    public static String brand;
    public static String model;
    public static int lumens;
    public static String resolution;
    public static double contrastRatio;
    public static boolean hasHDMI;
    public static boolean hasUSB;
    public static String lampType;
    public static int lampHours;
    public static double weight;
    public static String powerConsumption;
    public static boolean is3D;
    public static String warranty;
    public static boolean hasKeystone;
    public static String throwRatio;
    public static double price;
    public static String color;
    public static int fanNoiseDb;
    public static boolean hasWifi;
    public static String supportedOS;

    public static void main(String[] args) {

        System.out.println("brand = " + brand);
        brand = "ViewTech";
        System.out.println("brand = " + brand);

        System.out.println("model = " + model);
        model = "VT-200";
        System.out.println("model = " + model);

        System.out.println("lumens = " + lumens);
        lumens = 3000;
        System.out.println("lumens = " + lumens);

        System.out.println("resolution = " + resolution);
        resolution = "1920x1080";
        System.out.println("resolution = " + resolution);

        System.out.println("contrastRatio = " + contrastRatio);
        contrastRatio = 10000.0;
        System.out.println("contrastRatio = " + contrastRatio);

        System.out.println("hasHDMI = " + hasHDMI);
        hasHDMI = true;
        System.out.println("hasHDMI = " + hasHDMI);

        System.out.println("hasUSB = " + hasUSB);
        hasUSB = false;
        System.out.println("hasUSB = " + hasUSB);

        System.out.println("lampType = " + lampType);
        lampType = "LED";
        System.out.println("lampType = " + lampType);

        System.out.println("lampHours = " + lampHours);
        lampHours = 20000;
        System.out.println("lampHours = " + lampHours);

        System.out.println("weight = " + weight);
        weight = 2.8;
        System.out.println("weight = " + weight);

        System.out.println("powerConsumption = " + powerConsumption);
        powerConsumption = "150W";
        System.out.println("powerConsumption = " + powerConsumption);

        System.out.println("is3D = " + is3D);
        is3D = false;
        System.out.println("is3D = " + is3D);

        System.out.println("warranty = " + warranty);
        warranty = "2 years";
        System.out.println("warranty = " + warranty);

        System.out.println("hasKeystone = " + hasKeystone);
        hasKeystone = true;
        System.out.println("hasKeystone = " + hasKeystone);

        System.out.println("throwRatio = " + throwRatio);
        throwRatio = "1.5:1";
        System.out.println("throwRatio = " + throwRatio);

        System.out.println("price = " + price);
        price = 499.99;
        System.out.println("price = " + price);

        System.out.println("color = " + color);
        color = "Black";
        System.out.println("color = " + color);

        System.out.println("fanNoiseDb = " + fanNoiseDb);
        fanNoiseDb = 28;
        System.out.println("fanNoiseDb = " + fanNoiseDb);

        System.out.println("hasWifi = " + hasWifi);
        hasWifi = true;
        System.out.println("hasWifi = " + hasWifi);

        System.out.println("supportedOS = " + supportedOS);
        supportedOS = "Windows/Mac/Linux";
        System.out.println("supportedOS = " + supportedOS);
    }
}
