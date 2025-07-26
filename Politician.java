class Politician {

    Politician() {
        System.out.println("Politician is Invoked");
    }

    Politician(int politicianId, String name, String party, String constituency, int age, boolean isMinister) {
        System.out.println("Politician is Invoked");
        this.politicianId = politicianId;
        this.name = name;
        this.party = party;
        this.constituency = constituency;
        this.age = age;
        this.isMinister = isMinister;
    }

    int politicianId;
    String name;
    String party;
    String constituency;
    int age;
    boolean isMinister;

    public void getPoliticianInfo() {
        System.out.println("Politician ID: " + politicianId);
        System.out.println("Name: " + name);
        System.out.println("Party: " + party);
        System.out.println("Constituency: " + constituency);
        System.out.println("Age: " + age);
        System.out.println("Is Minister: " + isMinister);
    }
}
