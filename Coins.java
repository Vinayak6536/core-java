class Coins {

    int coinId;
    String country;
    String metalType;
    int yearMinted;
    double weightInGrams;
    boolean isCollectible;

    Coins() {
        System.out.println("Coins is Invoked");
    }

    Coins(int coinId, String country, String metalType, int yearMinted, double weightInGrams, boolean isCollectible) {
        System.out.println("Coins is Invoked");
        this.coinId = coinId;
        this.country = country;
        this.metalType = metalType;
        this.yearMinted = yearMinted;
        this.weightInGrams = weightInGrams;
        this.isCollectible = isCollectible;
    }

    public void getCoinsInfo() {
        System.out.println("Coin ID: " + coinId);
        System.out.println("Country: " + country);
        System.out.println("Metal Type: " + metalType);
        System.out.println("Year Minted: " + yearMinted);
        System.out.println("Weight (g): " + weightInGrams);
        System.out.println("Is Collectible: " + isCollectible);
    }
}
