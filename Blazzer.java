class Blazzer {

    Blazzer() {
        System.out.println("Blazzer is Invoked");
    }

    Blazzer(int blazzerId, String brand, String size, String color, double price, boolean isFormal) {
        System.out.println("Blazzer is Invoked");
        this.blazzerId = blazzerId;
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        this.isFormal = isFormal;
    }

    int blazzerId;
    String brand;
    String size;
    String color;
    double price;
    boolean isFormal;

    public void getBlazzerInfo() {
        System.out.println("Blazzer ID: " + blazzerId);
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Formal: " + isFormal);
    }
}
