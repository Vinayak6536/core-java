class Coins {
    int coinId;
    String country;
    int year;
    String material;
    double value;
    String shape;

    public void getCoinInfo() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Material: " + material);
        System.out.println("Value: " + value);
        System.out.println("Shape: " + shape);
    }
}