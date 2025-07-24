class KarateRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Karate karateOne = new Karate();
        karateOne.karateId = 1;
        karateOne.style = "Shotokan";
        karateOne.beltColor = "Black";
        karateOne.experienceYears = 5;
        karateOne.dojoName = "Karate Dojo";
        karateOne.competition = true;
        karateOne.rating = 4.5;
        karateOne.paymentMode = "Credit Card";
        karateOne.getKarateInfo();
        System.out.println("");

        Karate karateTwo = new Karate();
        karateTwo.karateId = 2;
        karateTwo.style = "Goju-Ryu";
        karateTwo.beltColor = "Brown";
        karateTwo.experienceYears = 3;
        karateTwo.dojoName = "Goju Dojo";
        karateTwo.competition = false;
        karateTwo.rating = 4.0;
        karateTwo.paymentMode = "Cash";
        karateTwo.getKarateInfo();
        System.out.println("");

        Karate karateThree = new Karate();
        karateThree.karateId = 3;
        karateThree.style = "Wado-Ryu";
        karateThree.beltColor = "Blue";
        karateThree.experienceYears = 2;
        karateThree.dojoName = "Wado Dojo";
        karateThree.competition = true;
        karateThree.rating = 3.8;
        karateThree.paymentMode = "Debit Card";
        karateThree.getKarateInfo();
        System.out.println("");

        Karate karateFour = new Karate();
        karateFour.karateId = 4;
        karateFour.style = "Shito-Ryu";
        karateFour.beltColor = "Green";
        karateFour.experienceYears = 4;
        karateFour.dojoName = "Shito Dojo";
        karateFour.competition = false;
        karateFour.rating = 4.2;
        karateFour.paymentMode = "UPI";
        karateFour.getKarateInfo();
        System.out.println("");

        Karate karateFive = new Karate();
        karateFive.karateId = 5;
        karateFive.style = "Kyokushin";
        karateFive.beltColor = "Red";
        karateFive.experienceYears = 6;
        karateFive.dojoName = "Kyokushin Dojo";
        karateFive.competition = true;
        karateFive.rating = 4.7;
        karateFive.paymentMode = "Net Banking";
        karateFive.getKarateInfo();
        System.out.println("");

        Karate karateSix = new Karate();
        karateSix.karateId = 6;
        karateSix.style = "Shorin-Ryu";
        karateSix.beltColor = "Yellow";
        karateSix.experienceYears = 1;
        karateSix.dojoName = "Shorin Dojo";
        karateSix.competition = false;
        karateSix.rating = 3.5;
        karateSix.paymentMode = "Cheque";
        karateSix.getKarateInfo();
        System.out.println("");

        Karate karateSeven = new Karate();
        karateSeven.karateId = 7;
        karateSeven.style = "Chito-Ryu";
        karateSeven.beltColor = "Purple";
        karateSeven.experienceYears = 2;
        karateSeven.dojoName = "Chito Dojo";
        karateSeven.competition = true;
        karateSeven.rating = 3.9;
        karateSeven.paymentMode = "Cash";
        karateSeven.getKarateInfo();
        System.out.println("");

        Karate karateEight = new Karate();
        karateEight.karateId = 8;
        karateEight.style = "Uechi-Ryu";
        karateEight.beltColor = "Orange";
        karateEight.experienceYears = 3;
        karateEight.dojoName = "Uechi Dojo";
        karateEight.competition = false;
        karateEight.rating = 4.1;
        karateEight.paymentMode = "Credit Card";
        karateEight.getKarateInfo();
        System.out.println("");

        Karate karateNine = new Karate();
        karateNine.karateId = 9;
        karateNine.style = "Isshin-Ryu";
        karateNine.beltColor = "White";
        karateNine.experienceYears = 1;
        karateNine.dojoName = "Isshin Dojo";
        karateNine.competition = true;
        karateNine.rating = 3.7;
        karateNine.paymentMode = "UPI";
        karateNine.getKarateInfo();
        System.out.println("");

        Karate karateTen = new Karate();
        karateTen.karateId = 10;
        karateTen.style = "Enshin";
        karateTen.beltColor = "Black";
        karateTen.experienceYears = 7;
        karateTen.dojoName = "Enshin Dojo";
        karateTen.competition = false;
        karateTen.rating = 4.8;
        karateTen.paymentMode = "Net Banking";
        karateTen.getKarateInfo();
        System.out.println("");

        Karate karateEleven = new Karate();
        karateEleven.karateId = 11;
        karateEleven.style = "Ashihara";
        karateEleven.beltColor = "Brown";
        karateEleven.experienceYears = 5;
        karateEleven.dojoName = "Ashihara Dojo";
        karateEleven.competition = true;
        karateEleven.rating = 4.3;
        karateEleven.paymentMode = "Debit Card";
        karateEleven.getKarateInfo();
        System.out.println("");

        Karate karateTwelve = new Karate();
        karateTwelve.karateId = 12;
        karateTwelve.style = "Budokan";
        karateTwelve.beltColor = "Blue";
        karateTwelve.experienceYears = 2;
        karateTwelve.dojoName = "Budokan Dojo";
        karateTwelve.competition = false;
        karateTwelve.rating = 3.6;
        karateTwelve.paymentMode = "Cheque";
        karateTwelve.getKarateInfo();
        System.out.println("");

        Karate karateThirteen = new Karate();
        karateThirteen.karateId = 13;
        karateThirteen.style = "Shudokan";
        karateThirteen.beltColor = "Green";
        karateThirteen.experienceYears = 4;
        karateThirteen.dojoName = "Shudokan Dojo";
        karateThirteen.competition = true;
        karateThirteen.rating = 4.4;
        karateThirteen.paymentMode = "Cash";
        karateThirteen.getKarateInfo();
        System.out.println("");

        Karate karateFourteen = new Karate();
        karateFourteen.karateId = 14;
        karateFourteen.style = "Gensei-Ryu";
        karateFourteen.beltColor = "Red";
        karateFourteen.experienceYears = 3;
        karateFourteen.dojoName = "Gensei Dojo";
        karateFourteen.competition = false;
        karateFourteen.rating = 4.0;
        karateFourteen.paymentMode = "UPI";
        karateFourteen.getKarateInfo();
        System.out.println("");

        Karate karateFifteen = new Karate();
        karateFifteen.karateId = 15;
        karateFifteen.style = "Ryuei-Ryu";
        karateFifteen.beltColor = "Yellow";
        karateFifteen.experienceYears = 2;
        karateFifteen.dojoName = "Ryuei Dojo";
        karateFifteen.competition = true;
        karateFifteen.rating = 3.8;
        karateFifteen.paymentMode = "Credit Card";
        karateFifteen.getKarateInfo();
        System.out.println("");

        Karate karateSixteen = new Karate();
        karateSixteen.karateId = 16;
        karateSixteen.style = "Shorinji-Ryu";
        karateSixteen.beltColor = "Purple";
        karateSixteen.experienceYears = 1;
        karateSixteen.dojoName = "Shorinji Dojo";
        karateSixteen.competition = false;
        karateSixteen.rating = 3.5;
        karateSixteen.paymentMode = "Net Banking";
        karateSixteen.getKarateInfo();
        System.out.println("");

        Karate karateSeventeen = new Karate();
        karateSeventeen.karateId = 17;
        karateSeventeen.style = "Kushin-Ryu";
        karateSeventeen.beltColor = "Orange";
        karateSeventeen.experienceYears = 3;
        karateSeventeen.dojoName = "Kushin Dojo";
        karateSeventeen.competition = true;
        karateSeventeen.rating = 4.1;
        karateSeventeen.paymentMode = "Debit Card";
        karateSeventeen.getKarateInfo();
        System.out.println("");

        Karate karateEighteen = new Karate();
        karateEighteen.karateId = 18;
        karateEighteen.style = "Seido";
        karateEighteen.beltColor = "White";
        karateEighteen.experienceYears = 2;
        karateEighteen.dojoName = "Seido Dojo";
        karateEighteen.competition = false;
        karateEighteen.rating = 3.7;
        karateEighteen.paymentMode = "Cheque";
        karateEighteen.getKarateInfo();
        System.out.println("");

        Karate karateNineteen = new Karate();
        karateNineteen.karateId = 19;
        karateNineteen.style = "Shorinji-Kempo";
        karateNineteen.beltColor = "Black";
        karateNineteen.experienceYears = 6;
        karateNineteen.dojoName = "Shorinji-Kempo Dojo";
        karateNineteen.competition = true;
        karateNineteen.rating = 4.6;
        karateNineteen.paymentMode = "UPI";
        karateNineteen.getKarateInfo();
        System.out.println("");

        Karate karateTwenty = new Karate();
        karateTwenty.karateId = 20;
        karateTwenty.style = "Kempo";
        karateTwenty.beltColor = "Brown";
        karateTwenty.experienceYears = 5;
        karateTwenty.dojoName = "Kempo Dojo";
        karateTwenty.competition = false;
        karateTwenty.rating = 4.2;
        karateTwenty.paymentMode = "Cash";
        karateTwenty.getKarateInfo();
        System.out.println("");
        System.out.println("Main Ended");
    }
}
