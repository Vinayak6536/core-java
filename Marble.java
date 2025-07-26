class Marble {

    Marble() {
        System.out.println("Marble is Invoked");
    }

    Marble(int marbleId, String color, String material, double diameter, boolean isShiny, String originCountry) {
        System.out.println("Marble is Invoked");
        this.marbleId = marbleId;
        this.color = color;
        this.material = material;
        this.diameter = diameter;
        this.isShiny = isShiny;
        this.originCountry = originCountry;
    }

    int marbleId;
    String color;
    String material;
    double diameter;
    boolean isShiny;
    String originCountry;

    public void getMarbleInfo() {
        System.out.println("Marble ID: " + marbleId);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter);
        System.out.println("Is Shiny: " + isShiny);
        System.out.println("Origin Country: " + originCountry);
    }
}
