class PipeRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Pipe pipeOne = new Pipe(1, "PVC", 10.5, 2.0, false, "Plumbing");
        pipeOne.getPipeInfo();
        System.out.println();

        Pipe pipeTwo = new Pipe(2, "Copper", 6.0, 1.5, false, "Gas Line");
        pipeTwo.getPipeInfo();
        System.out.println();

        Pipe pipeThree = new Pipe(3, "Steel", 12.0, 2.5, false, "Construction");
        pipeThree.getPipeInfo();
        System.out.println();

        Pipe pipeFour = new Pipe(4, "Rubber", 5.0, 1.0, true, "Garden Hose");
        pipeFour.getPipeInfo();
        System.out.println();

        Pipe pipeFive = new Pipe(5, "Aluminum", 8.0, 1.8, false, "Ventilation");
        pipeFive.getPipeInfo();
        System.out.println();

        Pipe pipeSix = new Pipe(6, "CPVC", 7.5, 1.2, false, "Hot Water");
        pipeSix.getPipeInfo();
        System.out.println();

        Pipe pipeSeven = new Pipe(7, "HDPE", 15.0, 2.0, true, "Irrigation");
        pipeSeven.getPipeInfo();
        System.out.println();

        Pipe pipeEight = new Pipe(8, "Galvanized Iron", 10.0, 2.2, false, "Drainage");
        pipeEight.getPipeInfo();
        System.out.println();

        Pipe pipeNine = new Pipe(9, "PEX", 6.5, 1.1, true, "Indoor Plumbing");
        pipeNine.getPipeInfo();
        System.out.println();

        Pipe pipeTen = new Pipe(10, "Concrete", 20.0, 3.5, false, "Sewer");
        pipeTen.getPipeInfo();
        System.out.println();

        Pipe pipeEleven = new Pipe(11, "Brass", 4.0, 1.3, false, "Fittings");
        pipeEleven.getPipeInfo();
        System.out.println();

        Pipe pipeTwelve = new Pipe(12, "Plastic", 9.0, 1.7, true, "Aquarium");
        pipeTwelve.getPipeInfo();
        System.out.println();

        Pipe pipeThirteen = new Pipe(13, "Fiberglass", 11.0, 2.1, false, "Chemical Plant");
        pipeThirteen.getPipeInfo();
        System.out.println();

        Pipe pipeFourteen = new Pipe(14, "Cast Iron", 14.0, 2.8, false, "Old Buildings");
        pipeFourteen.getPipeInfo();
        System.out.println();

        Pipe pipeFifteen = new Pipe(15, "Silicone", 5.5, 1.0, true, "Medical");
        pipeFifteen.getPipeInfo();
        System.out.println();

        Pipe pipeSixteen = new Pipe(16, "Lead", 7.0, 2.0, false, "Historic");
        pipeSixteen.getPipeInfo();
        System.out.println();

        Pipe pipeSeventeen = new Pipe(17, "ABS", 9.5, 1.9, false, "Drain Waste");
        pipeSeventeen.getPipeInfo();
        System.out.println();

        Pipe pipeEighteen = new Pipe(18, "Stainless Steel", 10.0, 2.4, false, "Industrial");
        pipeEighteen.getPipeInfo();
        System.out.println();

        Pipe pipeNineteen = new Pipe(19, "Carbon Steel", 12.5, 2.6, false, "High Pressure");
        pipeNineteen.getPipeInfo();
        System.out.println();

        Pipe pipeTwenty = new Pipe(20, "Teflon", 6.0, 1.2, true, "Food Grade");
        pipeTwenty.getPipeInfo();
        System.out.println();

        System.out.println("Main Ended");
    }
}
