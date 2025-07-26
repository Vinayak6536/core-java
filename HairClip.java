class HairClip {

    HairClip() {
        System.out.println("HairClip is Invoked");
    }

    HairClip(int clipId, String color, String material, String brand, double price, boolean isDecorated) {
        System.out.println("HairClip is Invoked");
        this.clipId = clipId;
        this.color = color;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.isDecorated = isDecorated;
    }

    int clipId;
    String color;
    String material;
    String brand;
    double price;
    boolean isDecorated;

    public void getHairClipInfo() {
        System.out.println("Clip ID: " + clipId);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Decorated: " + isDecorated);
    }
}
