class Cracker {
    int crackerId;
    String crackerName;
    String brand;
    String crackerType;
    String color;
    double price;
    String paymentMode;

    public void getCrackerInfo() {
        System.out.println("Cracker ID: " + crackerId);
        System.out.println("Cracker Name: " + crackerName);
        System.out.println("Brand: " + brand);
        System.out.println("Cracker Type: " + crackerType);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Payment Mode: " + paymentMode);
    }
}