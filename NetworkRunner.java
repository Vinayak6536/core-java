class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Network networkOne = new Network();
        networkOne.networkId = 1;
        networkOne.numberOfNodes = 10;
        networkOne.networkName = "Local Area Network";
        networkOne.networkType = "Wired";
        networkOne.protocol = "TCP/IP";
        networkOne.bandwidth = 100.0;
        networkOne.paymentMode = "Credit Card";
        networkOne.getNetworkInfo();    
        System.out.println("");

        Network networkTwo = new Network();
        networkTwo.networkId = 2;
        networkTwo.numberOfNodes = 25;
        networkTwo.networkName = "Wide Area Network";
        networkTwo.networkType = "Wireless";
        networkTwo.protocol = "UDP";
        networkTwo.bandwidth = 250.0;
        networkTwo.paymentMode = "Debit Card";
        networkTwo.getNetworkInfo();
        System.out.println("");

        Network networkThree = new Network();
        networkThree.networkId = 3;
        networkThree.numberOfNodes = 50;
        networkThree.networkName = "Metropolitan Area Network";
        networkThree.networkType = "Wired";
        networkThree.protocol = "TCP/IP";
        networkThree.bandwidth = 500.0;
        networkThree.paymentMode = "Net Banking";
        networkThree.getNetworkInfo();
        System.out.println("");

        Network networkFour = new Network();
        networkFour.networkId = 4;
        networkFour.numberOfNodes = 100;
        networkFour.networkName = "Personal Area Network";
        networkFour.networkType = "Wireless";
        networkFour.protocol = "Bluetooth";
        networkFour.bandwidth = 10.0;
        networkFour.paymentMode = "UPI";
        networkFour.getNetworkInfo();
        System.out.println("");

        Network networkFive = new Network();
        networkFive.networkId = 5;
        networkFive.numberOfNodes = 5;
        networkFive.networkName = "Campus Area Network";
        networkFive.networkType = "Wired";
        networkFive.protocol = "Ethernet";
        networkFive.bandwidth = 1000.0;
        networkFive.paymentMode = "Cash";
        networkFive.getNetworkInfo();
        System.out.println("");

        Network networkSix = new Network();
        networkSix.networkId = 6;
        networkSix.numberOfNodes = 15;
        networkSix.networkName = "Enterprise Network";
        networkSix.networkType = "Wired";
        networkSix.protocol = "TCP/IP";
        networkSix.bandwidth = 2000.0;
        networkSix.paymentMode = "Credit Card";
        networkSix.getNetworkInfo();
        System.out.println("");

        Network networkSeven = new Network();
        networkSeven.networkId = 7;
        networkSeven.numberOfNodes = 30;
        networkSeven.networkName = "Virtual Private Network";
        networkSeven.networkType = "Wireless";
        networkSeven.protocol = "IPSec";
        networkSeven.bandwidth = 300.0;
        networkSeven.paymentMode = "Debit Card";
        networkSeven.getNetworkInfo();
        System.out.println("");

        Network networkEight = new Network();
        networkEight.networkId = 8;
        networkEight.numberOfNodes = 60;
        networkEight.networkName = "Storage Area Network";
        networkEight.networkType = "Wired";
        networkEight.protocol = "Fibre Channel";
        networkEight.bandwidth = 4000.0;
        networkEight.paymentMode = "Net Banking";
        networkEight.getNetworkInfo();
        System.out.println("");

        Network networkNine = new Network();
        networkNine.networkId = 9;
        networkNine.numberOfNodes = 20;
        networkNine.networkName = "Home Network";
        networkNine.networkType = "Wireless";
        networkNine.protocol = "Wi-Fi";
        networkNine.bandwidth = 150.0;
        networkNine.paymentMode = "UPI";
        networkNine.getNetworkInfo();
        System.out.println("");

        Network networkTen = new Network();
        networkTen.networkId = 10;
        networkTen.numberOfNodes = 8;
        networkTen.networkName = "Guest Network";
        networkTen.networkType = "Wireless";
        networkTen.protocol = "Wi-Fi";
        networkTen.bandwidth = 50.0;
        networkTen.paymentMode = "Cash";
        networkTen.getNetworkInfo();
        System.out.println("");

        Network networkEleven = new Network();
        networkEleven.networkId = 11;
        networkEleven.numberOfNodes = 12;
        networkEleven.networkName = "IoT Network";
        networkEleven.networkType = "Wireless";
        networkEleven.protocol = "MQTT";
        networkEleven.bandwidth = 20.0;
        networkEleven.paymentMode = "Credit Card";
        networkEleven.getNetworkInfo();
        System.out.println("");

        Network networkTwelve = new Network();
        networkTwelve.networkId = 12;
        networkTwelve.numberOfNodes = 40;
        networkTwelve.networkName = "Data Center Network";
        networkTwelve.networkType = "Wired";
        networkTwelve.protocol = "Ethernet";
        networkTwelve.bandwidth = 10000.0;
        networkTwelve.paymentMode = "Debit Card";
        networkTwelve.getNetworkInfo();
        System.out.println("");

        Network networkThirteen = new Network();
        networkThirteen.networkId = 13;
        networkThirteen.numberOfNodes = 18;
        networkThirteen.networkName = "Cloud Network";
        networkThirteen.networkType = "Wireless";
        networkThirteen.protocol = "HTTP";
        networkThirteen.bandwidth = 500.0;
        networkThirteen.paymentMode = "Net Banking";
        networkThirteen.getNetworkInfo();
        System.out.println("");

        Network networkFourteen = new Network();
        networkFourteen.networkId = 14;
        networkFourteen.numberOfNodes = 22;
        networkFourteen.networkName = "Mesh Network";
        networkFourteen.networkType = "Wireless";
        networkFourteen.protocol = "Zigbee";
        networkFourteen.bandwidth = 25.0;
        networkFourteen.paymentMode = "UPI";
        networkFourteen.getNetworkInfo();
        System.out.println("");

        Network networkFifteen = new Network();
        networkFifteen.networkId = 15;
        networkFifteen.numberOfNodes = 35;
        networkFifteen.networkName = "Sensor Network";
        networkFifteen.networkType = "Wireless";
        networkFifteen.protocol = "LoRaWAN";
        networkFifteen.bandwidth = 5.0;
        networkFifteen.paymentMode = "Cash";
        networkFifteen.getNetworkInfo();
        System.out.println("");

        Network networkSixteen = new Network();
        networkSixteen.networkId = 16;
        networkSixteen.numberOfNodes = 28;
        networkSixteen.networkName = "Satellite Network";
        networkSixteen.networkType = "Wireless";
        networkSixteen.protocol = "Satellite";
        networkSixteen.bandwidth = 100.0;
        networkSixteen.paymentMode = "Credit Card";
        networkSixteen.getNetworkInfo();
        System.out.println("");

        Network networkSeventeen = new Network();
        networkSeventeen.networkId = 17;
        networkSeventeen.numberOfNodes = 45;
        networkSeventeen.networkName = "Backbone Network";
        networkSeventeen.networkType = "Wired";
        networkSeventeen.protocol = "TCP/IP";
        networkSeventeen.bandwidth = 20000.0;
        networkSeventeen.paymentMode = "Debit Card";
        networkSeventeen.getNetworkInfo();
        System.out.println("");

        Network networkEighteen = new Network();
        networkEighteen.networkId = 18;
        networkEighteen.numberOfNodes = 55;
        networkEighteen.networkName = "Public Network";
        networkEighteen.networkType = "Wireless";
        networkEighteen.protocol = "Wi-Fi";
        networkEighteen.bandwidth = 300.0;
        networkEighteen.paymentMode = "Net Banking";
        networkEighteen.getNetworkInfo();
        System.out.println("");

        Network networkNineteen = new Network();
        networkNineteen.networkId = 19;
        networkNineteen.numberOfNodes = 65;
        networkNineteen.networkName = "Private Network";
        networkNineteen.networkType = "Wired";
        networkNineteen.protocol = "Ethernet";
        networkNineteen.bandwidth = 1500.0;
        networkNineteen.paymentMode = "UPI";
        networkNineteen.getNetworkInfo();
        System.out.println("");

        Network networkTwenty = new Network();
        networkTwenty.networkId = 20;
        networkTwenty.numberOfNodes = 80;
        networkTwenty.networkName = "Hybrid Network";
        networkTwenty.networkType = "Wired/Wireless";
        networkTwenty.protocol = "TCP/IP";
        networkTwenty.bandwidth = 5000.0;
        networkTwenty.paymentMode = "Cash";
        networkTwenty.getNetworkInfo();
        System.out.println("");

        System.out.println("Main Ended");
    }
}