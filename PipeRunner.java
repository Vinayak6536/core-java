class PipeRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Pipe pipeOne = new Pipe();
        pipeOne.pipeId = 1;
        pipeOne.pipeMaterial = "PVC";
        pipeOne.pipeLengthMeters = 10.5;
        pipeOne.pipeDiameterInches = 2.0;
        pipeOne.pipeType = "Drainage";
        pipeOne.paymentMode = "UPI";
        pipeOne.getPipeInfo();
        System.out.println();

        Pipe pipeTwo = new Pipe();
        pipeTwo.pipeId = 2;
        pipeTwo.pipeMaterial = "Copper";
        pipeTwo.pipeLengthMeters = 8.0;
        pipeTwo.pipeDiameterInches = 1.5;
        pipeTwo.pipeType = "Water Supply";
        pipeTwo.paymentMode = "Credit Card";
        pipeTwo.getPipeInfo();
        System.out.println();

        Pipe pipeThree = new Pipe();
        pipeThree.pipeId = 3;
        pipeThree.pipeMaterial = "Steel";
        pipeThree.pipeLengthMeters = 15.2;
        pipeThree.pipeDiameterInches = 3.0;
        pipeThree.pipeType = "Gas Line";
        pipeThree.paymentMode = "Cash";
        pipeThree.getPipeInfo();
        System.out.println();

        Pipe pipeFour = new Pipe();
        pipeFour.pipeId = 4;
        pipeFour.pipeMaterial = "HDPE";
        pipeFour.pipeLengthMeters = 12.0;
        pipeFour.pipeDiameterInches = 2.5;
        pipeFour.pipeType = "Irrigation";
        pipeFour.paymentMode = "Net Banking";
        pipeFour.getPipeInfo();
        System.out.println();

        Pipe pipeFive = new Pipe();
        pipeFive.pipeId = 5;
        pipeFive.pipeMaterial = "CPVC";
        pipeFive.pipeLengthMeters = 9.0;
        pipeFive.pipeDiameterInches = 1.25;
        pipeFive.pipeType = "Hot Water";
        pipeFive.paymentMode = "Debit Card";
        pipeFive.getPipeInfo();
        System.out.println();

        Pipe pipeSix = new Pipe();
        pipeSix.pipeId = 6;
        pipeSix.pipeMaterial = "Aluminum";
        pipeSix.pipeLengthMeters = 11.0;
        pipeSix.pipeDiameterInches = 2.0;
        pipeSix.pipeType = "HVAC";
        pipeSix.paymentMode = "Cash";
        pipeSix.getPipeInfo();
        System.out.println();

        Pipe pipeSeven = new Pipe();
        pipeSeven.pipeId = 7;
        pipeSeven.pipeMaterial = "PEX";
        pipeSeven.pipeLengthMeters = 7.5;
        pipeSeven.pipeDiameterInches = 0.75;
        pipeSeven.pipeType = "Residential";
        pipeSeven.paymentMode = "Credit Card";
        pipeSeven.getPipeInfo();
        System.out.println();

        Pipe pipeEight = new Pipe();
        pipeEight.pipeId = 8;
        pipeEight.pipeMaterial = "Galvanized Steel";
        pipeEight.pipeLengthMeters = 13.0;
        pipeEight.pipeDiameterInches = 2.5;
        pipeEight.pipeType = "Fire Protection";
        pipeEight.paymentMode = "UPI";
        pipeEight.getPipeInfo();
        System.out.println();

        Pipe pipeNine = new Pipe();
        pipeNine.pipeId = 9;
        pipeNine.pipeMaterial = "Lead";
        pipeNine.pipeLengthMeters = 6.0;
        pipeNine.pipeDiameterInches = 1.0;
        pipeNine.pipeType = "Historical";
        pipeNine.paymentMode = "Cash";
        pipeNine.getPipeInfo();
        System.out.println();

        Pipe pipeTen = new Pipe();
        pipeTen.pipeId = 10;
        pipeTen.pipeMaterial = "Concrete";
        pipeTen.pipeLengthMeters = 20.0;
        pipeTen.pipeDiameterInches = 5.0;
        pipeTen.pipeType = "Sewage";
        pipeTen.paymentMode = "Net Banking";
        pipeTen.getPipeInfo();
        System.out.println();

        Pipe pipeEleven = new Pipe();
        pipeEleven.pipeId = 11;
        pipeEleven.pipeMaterial = "Cast Iron";
        pipeEleven.pipeLengthMeters = 18.0;
        pipeEleven.pipeDiameterInches = 4.0;
        pipeEleven.pipeType = "Stormwater";
        pipeEleven.paymentMode = "Debit Card";
        pipeEleven.getPipeInfo();
        System.out.println();

        Pipe pipeTwelve = new Pipe();
        pipeTwelve.pipeId = 12;
        pipeTwelve.pipeMaterial = "Brass";
        pipeTwelve.pipeLengthMeters = 7.0;
        pipeTwelve.pipeDiameterInches = 1.0;
        pipeTwelve.pipeType = "Fittings";
        pipeTwelve.paymentMode = "Credit Card";
        pipeTwelve.getPipeInfo();
        System.out.println();

        Pipe pipeThirteen = new Pipe();
        pipeThirteen.pipeId = 13;
        pipeThirteen.pipeMaterial = "Clay";
        pipeThirteen.pipeLengthMeters = 14.0;
        pipeThirteen.pipeDiameterInches = 3.5;
        pipeThirteen.pipeType = "Underground";
        pipeThirteen.paymentMode = "UPI";
        pipeThirteen.getPipeInfo();
        System.out.println();

        Pipe pipeFourteen = new Pipe();
        pipeFourteen.pipeId = 14;
        pipeFourteen.pipeMaterial = "FRP";
        pipeFourteen.pipeLengthMeters = 16.0;
        pipeFourteen.pipeDiameterInches = 2.25;
        pipeFourteen.pipeType = "Chemical";
        pipeFourteen.paymentMode = "Net Banking";
        pipeFourteen.getPipeInfo();
        System.out.println();

        Pipe pipeFifteen = new Pipe();
        pipeFifteen.pipeId = 15;
        pipeFifteen.pipeMaterial = "Polypropylene";
        pipeFifteen.pipeLengthMeters = 10.0;
        pipeFifteen.pipeDiameterInches = 1.5;
        pipeFifteen.pipeType = "Industrial";
        pipeFifteen.paymentMode = "Debit Card";
        pipeFifteen.getPipeInfo();
        System.out.println();

        Pipe pipeSixteen = new Pipe();
        pipeSixteen.pipeId = 16;
        pipeSixteen.pipeMaterial = "ABS";
        pipeSixteen.pipeLengthMeters = 9.5;
        pipeSixteen.pipeDiameterInches = 1.75;
        pipeSixteen.pipeType = "Vent";
        pipeSixteen.paymentMode = "UPI";
        pipeSixteen.getPipeInfo();
        System.out.println();

        Pipe pipeSeventeen = new Pipe();
        pipeSeventeen.pipeId = 17;
        pipeSeventeen.pipeMaterial = "Fiberglass";
        pipeSeventeen.pipeLengthMeters = 13.5;
        pipeSeventeen.pipeDiameterInches = 2.8;
        pipeSeventeen.pipeType = "Corrosive Handling";
        pipeSeventeen.paymentMode = "Credit Card";
        pipeSeventeen.getPipeInfo();
        System.out.println();

        Pipe pipeEighteen = new Pipe();
        pipeEighteen.pipeId = 18;
        pipeEighteen.pipeMaterial = "Zinc";
        pipeEighteen.pipeLengthMeters = 11.5;
        pipeEighteen.pipeDiameterInches = 1.25;
        pipeEighteen.pipeType = "Roof Drain";
        pipeEighteen.paymentMode = "Net Banking";
        pipeEighteen.getPipeInfo();
        System.out.println();

        Pipe pipeNineteen = new Pipe();
        pipeNineteen.pipeId = 19;
        pipeNineteen.pipeMaterial = "Plastic";
        pipeNineteen.pipeLengthMeters = 17.0;
        pipeNineteen.pipeDiameterInches = 2.0;
        pipeNineteen.pipeType = "Flexible Conduit";
        pipeNineteen.paymentMode = "Debit Card";
        pipeNineteen.getPipeInfo();
        System.out.println();

        Pipe pipeTwenty = new Pipe();
        pipeTwenty.pipeId = 20;
        pipeTwenty.pipeMaterial = "Stainless Steel";
        pipeTwenty.pipeLengthMeters = 19.0;
        pipeTwenty.pipeDiameterInches = 3.0;
        pipeTwenty.pipeType = "High Pressure";
        pipeTwenty.paymentMode = "Cash";
        pipeTwenty.getPipeInfo();
        System.out.println();

        System.out.println("Main Ended");
    }
}
