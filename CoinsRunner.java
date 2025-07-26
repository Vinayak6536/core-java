class CoinsRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Coins coinOne = new Coins(1, "USA", "Gold", 1900, 33.4, true);
        coinOne.getCoinsInfo();
        System.out.println();

        Coins coinTwo = new Coins(2, "India", "Silver", 1947, 11.2, true);
        coinTwo.getCoinsInfo();
        System.out.println();

        Coins coinThree = new Coins(3, "UK", "Bronze", 1920, 9.5, false);
        coinThree.getCoinsInfo();
        System.out.println();

        Coins coinFour = new Coins(4, "Japan", "Copper", 1950, 7.8, false);
        coinFour.getCoinsInfo();
        System.out.println();

        Coins coinFive = new Coins(5, "France", "Nickel", 1933, 10.1, true);
        coinFive.getCoinsInfo();
        System.out.println();

        Coins coinSix = new Coins(6, "Germany", "Zinc", 1916, 6.3, false);
        coinSix.getCoinsInfo();
        System.out.println();

        Coins coinSeven = new Coins(7, "Russia", "Silver", 1890, 12.5, true);
        coinSeven.getCoinsInfo();
        System.out.println();

        Coins coinEight = new Coins(8, "Canada", "Gold", 2001, 31.1, false);
        coinEight.getCoinsInfo();
        System.out.println();

        Coins coinNine = new Coins(9, "China", "Copper", 1980, 8.0, false);
        coinNine.getCoinsInfo();
        System.out.println();

        Coins coinTen = new Coins(10, "Italy", "Bronze", 1965, 10.0, true);
        coinTen.getCoinsInfo();
        System.out.println();

        Coins coinEleven = new Coins(11, "Brazil", "Nickel", 1990, 11.0, false);
        coinEleven.getCoinsInfo();
        System.out.println();

        Coins coinTwelve = new Coins(12, "Australia", "Silver", 2005, 12.3, false);
        coinTwelve.getCoinsInfo();
        System.out.println();

        Coins coinThirteen = new Coins(13, "Mexico", "Gold", 1910, 34.0, true);
        coinThirteen.getCoinsInfo();
        System.out.println();

        Coins coinFourteen = new Coins(14, "Egypt", "Copper", 1922, 6.7, false);
        coinFourteen.getCoinsInfo();
        System.out.println();

        Coins coinFifteen = new Coins(15, "Spain", "Silver", 1850, 13.2, true);
        coinFifteen.getCoinsInfo();
        System.out.println();

        Coins coinSixteen = new Coins(16, "South Africa", "Nickel", 1994, 9.0, false);
        coinSixteen.getCoinsInfo();
        System.out.println();

        Coins coinSeventeen = new Coins(17, "Thailand", "Bronze", 1988, 10.4, false);
        coinSeventeen.getCoinsInfo();
        System.out.println();

        Coins coinEighteen = new Coins(18, "Argentina", "Gold", 1930, 35.0, true);
        coinEighteen.getCoinsInfo();
        System.out.println();

        Coins coinNineteen = new Coins(19, "Greece", "Silver", 1940, 11.7, true);
        coinNineteen.getCoinsInfo();
        System.out.println();

        Coins coinTwenty = new Coins(20, "Portugal", "Copper", 1875, 8.9, false);
        coinTwenty.getCoinsInfo();
        System.out.println();

        System.out.println("Main Ended");
    }
}
