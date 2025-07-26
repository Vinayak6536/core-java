class Jewellery {

    Jewellery() {
        System.out.println("Jewellery is Invoked");
    }

    Jewellery(int jewelleryId, String type, String material, String brand, double price, boolean isTraditional) {
        System.out.println("Jewellery is Invoked");
        this.jewelleryId = jewelleryId;
        this.type = type;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.isTraditional = isTraditional;
    }

    int jewelleryId;
    String type;
    String material;
    String brand;
    double price;
    boolean isTraditional;

    public void getJewelleryInfo() {
        System.out.println("Jewellery ID: " + jewelleryId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Traditional: " + isTraditional);
    }
}
