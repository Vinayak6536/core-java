class Blade {
    int bladeId;
    String brandName;
    String bladeType;
    String bladeMaterial;
    double bladePrice;
    String paymentMode;

    public void getBladeInfo() {
        System.out.println("Blade ID: " + bladeId);
        System.out.println("Brand Name: " + brandName);
        System.out.println("Blade Type: " + bladeType);
        System.out.println("Blade Material: " + bladeMaterial);
        System.out.println("Blade Price: " + bladePrice);
        System.out.println("Payment Mode: " + paymentMode);
    }
}