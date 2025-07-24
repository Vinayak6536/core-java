class Marble {
    int marbleId;
    String color;
    String material;
    double diameter;
    double weight;
    String finishType;
    String origin;

    public void getMarbleInfo() {
        System.out.println("Marble ID: " + marbleId);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter);
        System.out.println("Weight: " + weight);
        System.out.println("Finish Type: " + finishType);
        System.out.println("Origin: " + origin);
    }
}