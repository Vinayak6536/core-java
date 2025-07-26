class Flowers {

    Flowers() {
        System.out.println("Flowers is Invoked");
    }

    Flowers(int flowerId, String name, String color, String season, double price, boolean isFragrant) {
        System.out.println("Flowers is Invoked");
        this.flowerId = flowerId;
        this.name = name;
        this.color = color;
        this.season = season;
        this.price = price;
        this.isFragrant = isFragrant;
    }

    int flowerId;
    String name;
    String color;
    String season;
    double price;
    boolean isFragrant;

    public void getFlowersInfo() {
        System.out.println("Flower ID: " + flowerId);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Season: " + season);
        System.out.println("Price: " + price);
        System.out.println("Fragrant: " + isFragrant);
    }
}
