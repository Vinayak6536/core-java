class ForestSafari {

    ForestSafari() {
        System.out.println("ForestSafari is Invoked");
    }

    ForestSafari(int safariId, String forestName, String location, String animalSpotted, double duration, boolean isGuided) {
        System.out.println("ForestSafari is Invoked");
        this.safariId = safariId;
        this.forestName = forestName;
        this.location = location;
        this.animalSpotted = animalSpotted;
        this.duration = duration;
        this.isGuided = isGuided;
    }

    int safariId;
    String forestName;
    String location;
    String animalSpotted;
    double duration;
    boolean isGuided;

    public void getForestSafariInfo() {
        System.out.println("Safari ID: " + safariId);
        System.out.println("Forest Name: " + forestName);
        System.out.println("Location: " + location);
        System.out.println("Animal Spotted: " + animalSpotted);
        System.out.println("Duration: " + duration);
        System.out.println("Guided: " + isGuided);
    }
}
