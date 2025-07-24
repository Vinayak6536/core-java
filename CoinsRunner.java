class CoinsRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Coins coinOne = new Coins();
        coinOne.coinId = 1;
        System.out.println("Coin ID: " + coinOne.coinId);
        coinOne.country = "India";
        System.out.println("Country: " + coinOne.country);
        coinOne.year = 2000;
        System.out.println("Year: " + coinOne.year);
        coinOne.material = "Steel";
        System.out.println("Material: " + coinOne.material);
        coinOne.value = 1.0;
        System.out.println("Value: ₹" + coinOne.value);
        coinOne.shape = "Round";
        System.out.println("Shape: " + coinOne.shape);
        System.out.println("");

        Coins coinTwo = new Coins();
        coinTwo.coinId = 2;
        System.out.println("Coin ID: " + coinTwo.coinId);
        coinTwo.country = "USA";
        System.out.println("Country: " + coinTwo.country);
        coinTwo.year = 1999;
        System.out.println("Year: " + coinTwo.year);
        coinTwo.material = "Copper-Nickel";
        System.out.println("Material: " + coinTwo.material);
        coinTwo.value = 0.25;
        System.out.println("Value: $" + coinTwo.value);
        coinTwo.shape = "Round";
        System.out.println("Shape: " + coinTwo.shape);
        System.out.println("");

        Coins coinThree = new Coins();
        coinThree.coinId = 3;
        System.out.println("Coin ID: " + coinThree.coinId);
        coinThree.country = "UK";
        System.out.println("Country: " + coinThree.country);
        coinThree.year = 1985;
        System.out.println("Year: " + coinThree.year);
        coinThree.material = "Bronze";
        System.out.println("Material: " + coinThree.material);
        coinThree.value = 0.01;
        System.out.println("Value: £" + coinThree.value);
        coinThree.shape = "Round";
        System.out.println("Shape: " + coinThree.shape);
        System.out.println("");

        Coins coinFour = new Coins();
        coinFour.coinId = 4;
        System.out.println("Coin ID: " + coinFour.coinId);
        coinFour.country = "India";
        System.out.println("Country: " + coinFour.country);
        coinFour.year = 2020;
        System.out.println("Year: " + coinFour.year);
        coinFour.material = "Nickel Brass";
        System.out.println("Material: " + coinFour.material);
        coinFour.value = 10.0;
        System.out.println("Value: ₹" + coinFour.value);
        coinFour.shape = "Bimetallic Round";
        System.out.println("Shape: " + coinFour.shape);
        System.out.println("");

        Coins coinFive = new Coins();
        coinFive.coinId = 5;
        System.out.println("Coin ID: " + coinFive.coinId);
        coinFive.country = "Japan";
        System.out.println("Country: " + coinFive.country);
        coinFive.year = 2015;
        System.out.println("Year: " + coinFive.year);
        coinFive.material = "Aluminum";
        System.out.println("Material: " + coinFive.material);
        coinFive.value = 1.0;
        System.out.println("Value: ¥" + coinFive.value);
        coinFive.shape = "Round with hole";
        System.out.println("Shape: " + coinFive.shape);
        System.out.println("");

        Coins coinSix = new Coins();
        coinSix.coinId = 6;
        System.out.println("Coin ID: " + coinSix.coinId);
        coinSix.country = "Canada";
        System.out.println("Country: " + coinSix.country);
        coinSix.year = 2002;
        System.out.println("Year: " + coinSix.year);
        coinSix.material = "Steel/Brass";
        System.out.println("Material: " + coinSix.material);
        coinSix.value = 2.0;
        System.out.println("Value: $" + coinSix.value);
        coinSix.shape = "Round";
        System.out.println("Shape: " + coinSix.shape);
        System.out.println("");

        Coins coinSeven = new Coins();
        coinSeven.coinId = 7;
        System.out.println("Coin ID: " + coinSeven.coinId);
        coinSeven.country = "Australia";
        System.out.println("Country: " + coinSeven.country);
        coinSeven.year = 1990;
        System.out.println("Year: " + coinSeven.year);
        coinSeven.material = "Aluminum Bronze";
        System.out.println("Material: " + coinSeven.material);
        coinSeven.value = 1.0;
        System.out.println("Value: $" + coinSeven.value);
        coinSeven.shape = "Round";
        System.out.println("Shape: " + coinSeven.shape);
        System.out.println("");

        Coins coinEight = new Coins();
        coinEight.coinId = 8;
        System.out.println("Coin ID: " + coinEight.coinId);
        coinEight.country = "Germany";
        System.out.println("Country: " + coinEight.country);
        coinEight.year = 2001;
        System.out.println("Year: " + coinEight.year);
        coinEight.material = "Steel";
        System.out.println("Material: " + coinEight.material);
        coinEight.value = 0.5;
        System.out.println("Value: €" + coinEight.value);
        coinEight.shape = "Round";
        System.out.println("Shape: " + coinEight.shape);
        System.out.println("");

        Coins coinNine = new Coins();
        coinNine.coinId = 9;
        System.out.println("Coin ID: " + coinNine.coinId);
        coinNine.country = "China";
        System.out.println("Country: " + coinNine.country);
        coinNine.year = 2010;
        System.out.println("Year: " + coinNine.year);
        coinNine.material = "Copper Alloy";
        System.out.println("Material: " + coinNine.material);
        coinNine.value = 1.0;
        System.out.println("Value: ¥" + coinNine.value);
        coinNine.shape = "Round";
        System.out.println("Shape: " + coinNine.shape);
        System.out.println("");

        Coins coinTen = new Coins();
        coinTen.coinId = 10;
        System.out.println("Coin ID: " + coinTen.coinId);
        coinTen.country = "Mexico";
        System.out.println("Country: " + coinTen.country);
        coinTen.year = 2005;
        System.out.println("Year: " + coinTen.year);
        coinTen.material = "Bimetallic";
        System.out.println("Material: " + coinTen.material);
        coinTen.value = 5.0;
        System.out.println("Value: $" + coinTen.value);
        coinTen.shape = "Round";
        System.out.println("Shape: " + coinTen.shape);
        System.out.println("");

        System.out.println("Main Ended");
    }
}