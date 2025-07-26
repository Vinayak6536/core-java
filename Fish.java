class Fish {

    Fish() {
        System.out.println("Fish is Invoked");
    }

    Fish(int fishId, String name, String color, String type, double weight, boolean isFreshWater) {
        System.out.println("Fish is Invoked");
        this.fishId = fishId;
        this.name = name;
        this.color = color;
        this.type = type;
        this.weight = weight;
        this.isFreshWater = isFreshWater;
    }

    int fishId;
    String name;
    String color;
    String type;
    double weight;
    boolean isFreshWater;

    public void getFishInfo() {
        System.out.println("Fish ID: " + fishId);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Fresh Water: " + isFreshWater);
    }
}
