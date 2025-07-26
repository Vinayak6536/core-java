class Network {

    Network() {
        System.out.println("Network is Invoked");
    }

    Network(int networkId, String name, String type, double speedMbps, boolean isWireless, String country) {
        System.out.println("Network is Invoked");
        this.networkId = networkId;
        this.name = name;
        this.type = type;
        this.speedMbps = speedMbps;
        this.isWireless = isWireless;
        this.country = country;
    }

    int networkId;
    String name;
    String type;
    double speedMbps;
    boolean isWireless;
    String country;

    public void getNetworkInfo() {
        System.out.println("Network ID: " + networkId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Speed (Mbps): " + speedMbps);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Country: " + country);
    }
}
