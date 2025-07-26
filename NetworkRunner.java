class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Network networkOne=new Network(1,"Jio","4G",150.5,true,"India");
        networkOne.getNetworkInfo();
        System.out.println();

        Network networkTwo=new Network(2,"Airtel","5G",300.0,true,"India");
        networkTwo.getNetworkInfo();
        System.out.println();

        Network networkThree=new Network(3,"BSNL","3G",25.0,false,"India");
        networkThree.getNetworkInfo();
        System.out.println();

        Network networkFour=new Network(4,"Verizon","5G",500.0,true,"USA");
        networkFour.getNetworkInfo();
        System.out.println();

        Network networkFive=new Network(5,"AT&T","4G",200.0,true,"USA");
        networkFive.getNetworkInfo();
        System.out.println();

        Network networkSix=new Network(6,"Vodafone","4G",180.0,true,"UK");
        networkSix.getNetworkInfo();
        System.out.println();

        Network networkSeven=new Network(7,"T-Mobile","5G",450.0,true,"Germany");
        networkSeven.getNetworkInfo();
        System.out.println();

        Network networkEight=new Network(8,"Docomo","4G",160.0,true,"Japan");
        networkEight.getNetworkInfo();
        System.out.println();

        Network networkNine=new Network(9,"SK Telecom","5G",550.0,true,"South Korea");
        networkNine.getNetworkInfo();
        System.out.println();

        Network networkTen=new Network(10,"China Mobile","4G",170.0,true,"China");
        networkTen.getNetworkInfo();
        System.out.println();

        Network networkEleven=new Network(11,"Optus","5G",400.0,true,"Australia");
        networkEleven.getNetworkInfo();
        System.out.println();

        Network networkTwelve=new Network(12,"Telstra","4G",210.0,true,"Australia");
        networkTwelve.getNetworkInfo();
        System.out.println();

        Network networkThirteen=new Network(13,"Orange","4G",190.0,true,"France");
        networkThirteen.getNetworkInfo();
        System.out.println();

        Network networkFourteen=new Network(14,"Claro","4G",130.0,true,"Brazil");
        networkFourteen.getNetworkInfo();
        System.out.println();

        Network networkFifteen=new Network(15,"MTN","4G",140.0,true,"South Africa");
        networkFifteen.getNetworkInfo();
        System.out.println();

        Network networkSixteen=new Network(16,"Telenor","4G",160.0,true,"Norway");
        networkSixteen.getNetworkInfo();
        System.out.println();

        Network networkSeventeen=new Network(17,"Rogers","5G",320.0,true,"Canada");
        networkSeventeen.getNetworkInfo();
        System.out.println();

        Network networkEighteen=new Network(18,"Telkomsel","4G",150.0,true,"Indonesia");
        networkEighteen.getNetworkInfo();
        System.out.println();

        Network networkNineteen=new Network(19,"Turkcell","4G",145.0,true,"Turkey");
        networkNineteen.getNetworkInfo();
        System.out.println();

        Network networkTwenty=new Network(20,"Movistar","4G",135.0,true,"Spain");
        networkTwenty.getNetworkInfo();
        System.out.println();

        System.out.println("Main Ended");
    }
}
