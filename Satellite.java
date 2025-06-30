public class Satellite {

    public static String name;
    public static double orbitalAltitudeKm;
    public static double massKg;
    public static String purpose;
    public static String launchDate;
    public static String operator;
    public static double powerWatts;
    public static boolean hasCamera;
    public static boolean hasRadar;
    public static String launchVehicle;
    public static String status;
    public static double expectedLifespanYears;
    public static String[] instruments;
    public static String orbitType;
    public static boolean isGeostationary;
    public static double inclinationDeg;
    public static String groundStation;
    public static double dataRateMbps;
    public static boolean hasAutopilot;
    public static String manufacturer;

    public static void main(String[] args) {

        System.out.println("name = " + name);
        name = "Orbital One";
        System.out.println("name = " + name);

        System.out.println("orbitalAltitudeKm = " + orbitalAltitudeKm);
        orbitalAltitudeKm = 550.5;
        System.out.println("orbitalAltitudeKm = " + orbitalAltitudeKm);

        System.out.println("massKg = " + massKg);
        massKg = 1200.0;
        System.out.println("massKg = " + massKg);

        System.out.println("purpose = " + purpose);
        purpose = "Earth Observation";
        System.out.println("purpose = " + purpose);

        System.out.println("launchDate = " + launchDate);
        launchDate = "2022-07-15";
        System.out.println("launchDate = " + launchDate);

        System.out.println("operator = " + operator);
        operator = "SpaceTech Co.";
        System.out.println("operator = " + operator);

        System.out.println("powerWatts = " + powerWatts);
        powerWatts = 1500;
        System.out.println("powerWatts = " + powerWatts);

        System.out.println("hasCamera = " + hasCamera);
        hasCamera = true;
        System.out.println("hasCamera = " + hasCamera);

        System.out.println("hasRadar = " + hasRadar);
        hasRadar = false;
        System.out.println("hasRadar = " + hasRadar);

        System.out.println("launchVehicle = " + launchVehicle);
        launchVehicle = "Falcon 9";
        System.out.println("launchVehicle = " + launchVehicle);

        System.out.println("status = " + status);
        status = "Operational";
        System.out.println("status = " + status);

        System.out.println("expectedLifespanYears = " + expectedLifespanYears);
        expectedLifespanYears = 7.5;
        System.out.println("expectedLifespanYears = " + expectedLifespanYears);

        System.out.println("instruments = " + instruments);
        instruments = new String[]{"Camera", "Spectrometer"};
        System.out.println("instruments = " + String.join(", ", instruments));

        System.out.println("orbitType = " + orbitType);
        orbitType = "LEO";
        System.out.println("orbitType = " + orbitType);

        System.out.println("isGeostationary = " + isGeostationary);
        isGeostationary = false;
        System.out.println("isGeostationary = " + isGeostationary);

        System.out.println("inclinationDeg = " + inclinationDeg);
        inclinationDeg = 97.0;
        System.out.println("inclinationDeg = " + inclinationDeg);

        System.out.println("groundStation = " + groundStation);
        groundStation = "GS-Alpha";
        System.out.println("groundStation = " + groundStation);

        System.out.println("dataRateMbps = " + dataRateMbps);
        dataRateMbps = 50.0;
        System.out.println("dataRateMbps = " + dataRateMbps);

        System.out.println("hasAutopilot = " + hasAutopilot);
        hasAutopilot = true;
        System.out.println("hasAutopilot = " + hasAutopilot);

        System.out.println("manufacturer = " + manufacturer);
        manufacturer = "SpaceTech";
        System.out.println("manufacturer = " + manufacturer);
    }
}
