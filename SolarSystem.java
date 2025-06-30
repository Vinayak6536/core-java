public class SolarSystem {

    public static String name;
    public static int planets;
    public static String star;
    public static boolean hasAsteroidBelt;
    public static String[] dwarfPlanets;
    public static double ageBillionYears;
    public static boolean hasKuiperBelt;
    public static double radiusAU;
    public static boolean hasOortCloud;
    public static String galaxy;
    public static double massSolarMass;
    public static int knownMoons;
    public static boolean visitedByHumans;
    public static String[] spacecraftVisited;
    public static String governingBody;
    public static double orbitalPeriodDays;
    public static boolean hasRings;
    public static String[] ringedPlanets;
    public static String notableFeature;
    public static boolean hasLife;

    public static void main(String[] args) {

        System.out.println("name = " + name);
        name = "Solar System";
        System.out.println("name = " + name);

        System.out.println("planets = " + planets);
        planets = 8;
        System.out.println("planets = " + planets);

        System.out.println("star = " + star);
        star = "Sun";
        System.out.println("star = " + star);

        System.out.println("hasAsteroidBelt = " + hasAsteroidBelt);
        hasAsteroidBelt = true;
        System.out.println("hasAsteroidBelt = " + hasAsteroidBelt);

        System.out.println("dwarfPlanets = " + dwarfPlanets);
        dwarfPlanets = new String[]{"Pluto", "Eris", "Ceres"};
        System.out.println("dwarfPlanets = " + String.join(", ", dwarfPlanets));

        System.out.println("ageBillionYears = " + ageBillionYears);
        ageBillionYears = 4.6;
        System.out.println("ageBillionYears = " + ageBillionYears);

        System.out.println("hasKuiperBelt = " + hasKuiperBelt);
        hasKuiperBelt = true;
        System.out.println("hasKuiperBelt = " + hasKuiperBelt);

        System.out.println("radiusAU = " + radiusAU);
        radiusAU = 39.5;
        System.out.println("radiusAU = " + radiusAU);

        System.out.println("hasOortCloud = " + hasOortCloud);
        hasOortCloud = true;
        System.out.println("hasOortCloud = " + hasOortCloud);

        System.out.println("galaxy = " + galaxy);
        galaxy = "Milky Way";
        System.out.println("galaxy = " + galaxy);

        System.out.println("massSolarMass = " + massSolarMass);
        massSolarMass = 1.0;
        System.out.println("massSolarMass = " + massSolarMass);

        System.out.println("knownMoons = " + knownMoons);
        knownMoons = 205;
        System.out.println("knownMoons = " + knownMoons);

        System.out.println("visitedByHumans = " + visitedByHumans);
        visitedByHumans = true;
        System.out.println("visitedByHumans = " + visitedByHumans);

        System.out.println("spacecraftVisited = " + spacecraftVisited);
        spacecraftVisited = new String[]{"Voyager 1", "Cassini", "Juno"};
        System.out.println("spacecraftVisited = " + String.join(", ", spacecraftVisited));

        System.out.println("governingBody = " + governingBody);
        governingBody = "NASA & others";
        System.out.println("governingBody = " + governingBody);

        System.out.println("orbitalPeriodDays = " + orbitalPeriodDays);
        orbitalPeriodDays = 365.25;
        System.out.println("orbitalPeriodDays = " + orbitalPeriodDays);

        System.out.println("hasRings = " + hasRings);
        hasRings = true;
        System.out.println("hasRings = " + hasRings);

        System.out.println("ringedPlanets = " + ringedPlanets);
        ringedPlanets = new String[]{"Saturn", "Jupiter", "Uranus", "Neptune"};
        System.out.println("ringedPlanets = " + String.join(", ", ringedPlanets));

        System.out.println("notableFeature = " + notableFeature);
        notableFeature = "Oort Cloud";
        System.out.println("notableFeature = " + notableFeature);

        System.out.println("hasLife = " + hasLife);
        hasLife = true;
        System.out.println("hasLife = " + hasLife);
    }
}
