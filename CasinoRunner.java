class CasinoRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Casino casinoOne = new Casino();
        casinoOne.casinoId = 1;
        casinoOne.name = "Lucky Star Casino";
        casinoOne.location = "Las Vegas, USA";
        casinoOne.totalGames = 50;
        casinoOne.isOpen24Hours = true;
        casinoOne.entryFee = 20.00;
        casinoOne.owner = "John Doe";
        casinoOne.paymentMode = "Credit Card";
        casinoOne.getCasinoInfo();
        System.out.println("");

        Casino casinoTwo = new Casino();
        casinoTwo.entryFee = 20.00;
        casinoTwo.casinoId = 2;
        casinoTwo.name = "Royal Palace Casino";
        casinoTwo.location = "Macau, China";
        casinoTwo.totalGames = 100;
        casinoTwo.isOpen24Hours = false;
        casinoTwo.entryFee = 50.00;
        casinoTwo.owner = "Jane Smith";
        casinoTwo.paymentMode = "Cash";
        casinoTwo.getCasinoInfo();
        System.out.println("");

        Casino casinoThree = new Casino();
        casinoThree.casinoId = 3;
        casinoThree.name = "Sunshine Casino";
        casinoThree.location = "Monte Carlo, Monaco";
        casinoThree.totalGames = 75;
        casinoThree.isOpen24Hours = true;
        casinoThree.entryFee = 100.00;
        casinoThree.owner = "Albert Rossi";
        casinoThree.paymentMode = "Debit Card";
        casinoThree.getCasinoInfo();
        System.out.println("");

        Casino casinoFour = new Casino();
        casinoFour.casinoId = 4;
        casinoFour.name = "Emerald Bay Casino";
        casinoFour.location = "Goa, India";
        casinoFour.totalGames = 60;
        casinoFour.isOpen24Hours = false;
        casinoFour.entryFee = 30.00;
        casinoFour.owner = "Priya Patel";
        casinoFour.paymentMode = "UPI";
        casinoFour.getCasinoInfo();
        System.out.println("");

        Casino casinoFive = new Casino();
        casinoFive.casinoId = 5;
        casinoFive.name = "Golden Sands Casino";
        casinoFive.location = "Singapore";
        casinoFive.totalGames = 80;
        casinoFive.isOpen24Hours = true;
        casinoFive.entryFee = 70.00;
        casinoFive.owner = "Lee Wei";
        casinoFive.paymentMode = "Credit Card";
        casinoFive.getCasinoInfo();
        System.out.println("");

        Casino casinoSix = new Casino();
        casinoSix.casinoId = 6;
        casinoSix.name = "Ocean View Casino";
        casinoSix.location = "Sydney, Australia";
        casinoSix.totalGames = 65;
        casinoSix.isOpen24Hours = false;
        casinoSix.entryFee = 40.00;
        casinoSix.owner = "Emily Clark";
        casinoSix.paymentMode = "Cash";
        casinoSix.getCasinoInfo();
        System.out.println("");

        Casino casinoSeven = new Casino();
        casinoSeven.casinoId = 7;
        casinoSeven.name = "Diamond Crown Casino";
        casinoSeven.location = "London, UK";
        casinoSeven.totalGames = 90;
        casinoSeven.isOpen24Hours = true;
        casinoSeven.entryFee = 120.00;
        casinoSeven.owner = "Richard Brown";
        casinoSeven.paymentMode = "Debit Card";
        casinoSeven.getCasinoInfo();
        System.out.println("");

        Casino casinoEight = new Casino();
        casinoEight.casinoId = 8;
        casinoEight.name = "Ruby Fortune Casino";
        casinoEight.location = "Johannesburg, South Africa";
        casinoEight.totalGames = 55;
        casinoEight.isOpen24Hours = false;
        casinoEight.entryFee = 35.00;
        casinoEight.owner = "Thabo Mbeki";
        casinoEight.paymentMode = "Credit Card";
        casinoEight.getCasinoInfo();
        System.out.println("");

        Casino casinoNine = new Casino();
        casinoNine.casinoId = 9;
        casinoNine.name = "Pearl River Casino";
        casinoNine.location = "Seoul, South Korea";
        casinoNine.totalGames = 70;
        casinoNine.isOpen24Hours = true;
        casinoNine.entryFee = 60.00;
        casinoNine.owner = "Kim Min-Jae";
        casinoNine.paymentMode = "Cash";
        casinoNine.getCasinoInfo();
        System.out.println("");

        Casino casinoTen = new Casino();
        casinoTen.casinoId = 10;
        casinoTen.name = "Sapphire Sky Casino";
        casinoTen.location = "Dubai, UAE";
        casinoTen.totalGames = 85;
        casinoTen.isOpen24Hours = false;
        casinoTen.entryFee = 110.00;
        casinoTen.owner = "Fatima Al-Farsi";
        casinoTen.paymentMode = "Debit Card";
        casinoTen.getCasinoInfo();
        System.out.println("");

        Casino casinoEleven = new Casino();
        casinoEleven.casinoId = 11;
        casinoEleven.name = "Crystal Palace Casino";
        casinoEleven.location = "Paris, France";
        casinoEleven.totalGames = 95;
        casinoEleven.isOpen24Hours = true;
        casinoEleven.entryFee = 130.00;
        casinoEleven.owner = "Pierre Dubois";
        casinoEleven.paymentMode = "Credit Card";
        casinoEleven.getCasinoInfo();
        System.out.println("");

        Casino casinoTwelve = new Casino();
        casinoTwelve.casinoId = 12;
        casinoTwelve.name = "Starburst Casino";
        casinoTwelve.location = "Berlin, Germany";
        casinoTwelve.totalGames = 60;
        casinoTwelve.isOpen24Hours = false;
        casinoTwelve.entryFee = 45.00;
        casinoTwelve.owner = "Hans Müller";
        casinoTwelve.paymentMode = "Cash";
        casinoTwelve.getCasinoInfo();
        System.out.println("");

        Casino casinoThirteen = new Casino();
        casinoThirteen.casinoId = 13;
        casinoThirteen.name = "Mirage Casino";
        casinoThirteen.location = "Toronto, Canada";
        casinoThirteen.totalGames = 78;
        casinoThirteen.isOpen24Hours = true;
        casinoThirteen.entryFee = 80.00;
        casinoThirteen.owner = "Samantha Lee";
        casinoThirteen.paymentMode = "Debit Card";
        casinoThirteen.getCasinoInfo();
        System.out.println("");

        Casino casinoFourteen = new Casino();
        casinoFourteen.casinoId = 14;
        casinoFourteen.name = "Venetian Casino";
        casinoFourteen.location = "Venice, Italy";
        casinoFourteen.totalGames = 88;
        casinoFourteen.isOpen24Hours = false;
        casinoFourteen.entryFee = 95.00;
        casinoFourteen.owner = "Giovanni Rossi";
        casinoFourteen.paymentMode = "Credit Card";
        casinoFourteen.getCasinoInfo();
        System.out.println("");

        Casino casinoFifteen = new Casino();
        casinoFifteen.casinoId = 15;
        casinoFifteen.name = "Majestic Casino";
        casinoFifteen.location = "Madrid, Spain";
        casinoFifteen.totalGames = 72;
        casinoFifteen.isOpen24Hours = true;
        casinoFifteen.entryFee = 55.00;
        casinoFifteen.owner = "Carlos Ruiz";
        casinoFifteen.paymentMode = "Cash";
        casinoFifteen.getCasinoInfo();
        System.out.println("");

        Casino casinoSixteen = new Casino();
        casinoSixteen.casinoId = 16;
        casinoSixteen.name = "Phoenix Casino";
        casinoSixteen.location = "Bangkok, Thailand";
        casinoSixteen.totalGames = 68;
        casinoSixteen.isOpen24Hours = false;
        casinoSixteen.entryFee = 38.00;
        casinoSixteen.owner = "Ananda Chai";
        casinoSixteen.paymentMode = "Debit Card";
        casinoSixteen.getCasinoInfo();
        System.out.println("");

        Casino casinoSeventeen = new Casino();
        casinoSeventeen.casinoId = 17;
        casinoSeventeen.name = "Treasure Island Casino";
        casinoSeventeen.location = "Honolulu, Hawaii";
        casinoSeventeen.totalGames = 82;
        casinoSeventeen.isOpen24Hours = true;
        casinoSeventeen.entryFee = 75.00;
        casinoSeventeen.owner = "Lani Kealoha";
        casinoSeventeen.paymentMode = "Credit Card";
        casinoSeventeen.getCasinoInfo();
        System.out.println("");

        Casino casinoEighteen = new Casino();
        casinoEighteen.casinoId = 18;
        casinoEighteen.name = "Silver Moon Casino";
        casinoEighteen.location = "Auckland, New Zealand";
        casinoEighteen.totalGames = 66;
        casinoEighteen.isOpen24Hours = false;
        casinoEighteen.entryFee = 42.00;
        casinoEighteen.owner = "Oliver Smith";
        casinoEighteen.paymentMode = "Cash";
        casinoEighteen.getCasinoInfo();
        System.out.println("");

        Casino casinoNineteen = new Casino();
        casinoNineteen.casinoId = 19;
        casinoNineteen.name = "Galaxy Casino";
        casinoNineteen.location = "Hong Kong";
        casinoNineteen.totalGames = 77;
        casinoNineteen.isOpen24Hours = true;
        casinoNineteen.entryFee = 85.00;
        casinoNineteen.owner = "Wong Mei";
        casinoNineteen.paymentMode = "Debit Card";
        casinoNineteen.getCasinoInfo();
        System.out.println("");

        Casino casinoTwenty = new Casino();
        casinoTwenty.casinoId = 20;
        casinoTwenty.name = "Fortune Wheel Casino";
        casinoTwenty.location = "Manila, Philippines";
        casinoTwenty.totalGames = 58;
        casinoTwenty.isOpen24Hours = false;
        casinoTwenty.entryFee = 33.00;
        casinoTwenty.owner = "Jose Santos";
        casinoTwenty.paymentMode = "Credit Card";
        casinoTwenty.getCasinoInfo();
        System.out.println("");

        System.out.println("Main Ended");
    }
}