class King {

    King() {
        System.out.println("King is Invoked");
    }

    King(int kingId, String name, String kingdom, int reignStartYear, int reignEndYear, boolean wasWarrior) {
        System.out.println("King is Invoked");
        this.kingId = kingId;
        this.name = name;
        this.kingdom = kingdom;
        this.reignStartYear = reignStartYear;
        this.reignEndYear = reignEndYear;
        this.wasWarrior = wasWarrior;
    }

    int kingId;
    String name;
    String kingdom;
    int reignStartYear;
    int reignEndYear;
    boolean wasWarrior;

    public void getKingInfo() {
        System.out.println("King ID: " + kingId);
        System.out.println("Name: " + name);
        System.out.println("Kingdom: " + kingdom);
        System.out.println("Reign Start Year: " + reignStartYear);
        System.out.println("Reign End Year: " + reignEndYear);
        System.out.println("Was Warrior: " + wasWarrior);
    }
}
