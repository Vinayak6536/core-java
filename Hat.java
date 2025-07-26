class Hat {

    Hat() {
        System.out.println("Hat is Invoked");
    }

    Hat(int hatId, String type, String color, String brand, double price, boolean isUnisex) {
        System.out.println("Hat is Invoked");
        this.hatId = hatId;
        this.type = type;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.isUnisex = isUnisex;
    }

    int hatId;
    String type;
    String color;
    String brand;
    double price;
    boolean isUnisex;

    public void getHatInfo() {
        System.out.println("Hat ID: " + hatId);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Unisex: " + isUnisex);
    }
}
