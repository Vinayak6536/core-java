class ForestSafari {
    int safariId;
    String forestName;
    String country;
    double areaSqKm;
    String animalSpotted;
    boolean isGuided;

    public void getSafariInfo() {
        System.out.println("Safari ID: " + safariId);
        System.out.println("Forest Name: " + forestName);
        System.out.println("Country: " + country);
        System.out.println("Area (sq km): " + areaSqKm);
        System.out.println("Animal Spotted: " + animalSpotted);
        System.out.println("Is Guided: " + isGuided);
    }
}