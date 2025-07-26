class Casino {

    int casinoId;
    String name;
    String location;
    int yearOpened;
    int numberOfTables;
    boolean hasHotel;

    Casino() {
        System.out.println("Casino is Invoked");
    }

    Casino(int casinoId, String name, String location, int yearOpened, int numberOfTables, boolean hasHotel) {
        System.out.println("Casino is Invoked");
        this.casinoId = casinoId;
        this.name = name;
        this.location = location;
        this.yearOpened = yearOpened;
        this.numberOfTables = numberOfTables;
        this.hasHotel = hasHotel;
    }

    public void getCasinoInfo() {
        System.out.println("Casino ID: " + casinoId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Year Opened: " + yearOpened);
        System.out.println("Number of Tables: " + numberOfTables);
        System.out.println("Has Hotel: " + hasHotel);
    }
}
