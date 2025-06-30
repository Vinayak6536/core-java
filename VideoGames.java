public class VideoGames {

    public static String name;
    public static String developer;
    public static String genre;
    public static double priceUSD;
    public static double rating;
    public static boolean multiplayer;
    public static int releaseYear;
    public static String[] platforms;
    public static String publisher;
    public static boolean hasDLC;
    public static String[] DLCs;
    public static String ESRBRating;
    public static boolean isVR;
    public static String languageSupport;
    public static boolean crossPlatform;
    public static int memoryGB;
    public static String saveFormat;
    public static String website;
    public static boolean hasSoundtrack;
    public static String soundtrackComposer;

    public static void main(String[] args) {

        System.out.println("name = " + name);
        name = "Galactic Quest";
        System.out.println("name = " + name);

        System.out.println("developer = " + developer);
        developer = "FunGame Studio";
        System.out.println("developer = " + developer);

        System.out.println("genre = " + genre);
        genre = "RPG";
        System.out.println("genre = " + genre);

        System.out.println("priceUSD = " + priceUSD);
        priceUSD = 59.99;
        System.out.println("priceUSD = " + priceUSD);

        System.out.println("rating = " + rating);
        rating = 4.7;
        System.out.println("rating = " + rating);

        System.out.println("multiplayer = " + multiplayer);
        multiplayer = true;
        System.out.println("multiplayer = " + multiplayer);

        System.out.println("releaseYear = " + releaseYear);
        releaseYear = 2023;
        System.out.println("releaseYear = " + releaseYear);

        System.out.println("platforms = " + platforms);
        platforms = new String[]{"PC", "PS5", "Xbox"};
        System.out.println("platforms = " + String.join(", ", platforms));

        System.out.println("publisher = " + publisher);
        publisher = "Global Games";
        System.out.println("publisher = " + publisher);

        System.out.println("hasDLC = " + hasDLC);
        hasDLC = true;
        System.out.println("hasDLC = " + hasDLC);

        System.out.println("DLCs = " + DLCs);
        DLCs = new String[]{"Expansion Pack", "Cosmetics Pack"};
        System.out.println("DLCs = " + String.join(", ", DLCs));

        System.out.println("ESRBRating = " + ESRBRating);
        ESRBRating = "T";
        System.out.println("ESRBRating = " + ESRBRating);

        System.out.println("isVR = " + isVR);
        isVR = false;
        System.out.println("isVR = " + isVR);

        System.out.println("languageSupport = " + languageSupport);
        languageSupport = "En, Fr, Es";
        System.out.println("languageSupport = " + languageSupport);

        System.out.println("crossPlatform = " + crossPlatform);
        crossPlatform = true;
        System.out.println("crossPlatform = " + crossPlatform);

        System.out.println("memoryGB = " + memoryGB);
        memoryGB = 50;
        System.out.println("memoryGB = " + memoryGB);

        System.out.println("saveFormat = " + saveFormat);
        saveFormat = "Cloud";
        System.out.println("saveFormat = " + saveFormat);

        System.out.println("website = " + website);
        website = "www.galacticquest.com";
        System.out.println("website = " + website);

        System.out.println("hasSoundtrack = " + hasSoundtrack);
        hasSoundtrack = true;
        System.out.println("hasSoundtrack = " + hasSoundtrack);

        System.out.println("soundtrackComposer = " + soundtrackComposer);
        soundtrackComposer = "Jane Music";
        System.out.println("soundtrackComposer = " + soundtrackComposer);
    }
}
