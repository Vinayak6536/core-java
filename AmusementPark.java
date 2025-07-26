class Blade {

    Blade() {
        System.out.println("Blade is Invoked");
    }

    Blade(int bladeId, String brand, String type, String material, double price, boolean isStainless) {
        System.out.println("Blade is Invoked");
        this.bladeId = bladeId;
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.price = price;
        this.isStainless = isStainless;
    }

    int bladeId;
    String brand;
    String type;
    String material;
    double price;
    boolean isStainless;

    public void getBladeInfo() {
        System.out.println("Blade ID: " + bladeId);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Stainless: " + isStainless);
    }
}
