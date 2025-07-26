class Weapon {

    Weapon() {
        System.out.println("Weapon is Invoked");
    }

    Weapon(int weaponId, String name, String type, double weight, boolean isAutomatic, String originCountry) {
        System.out.println("Weapon is Invoked");
        this.weaponId = weaponId;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.isAutomatic = isAutomatic;
        this.originCountry = originCountry;
    }

    int weaponId;
    String name;
    String type;
    double weight;
    boolean isAutomatic;
    String originCountry;

    public void getWeaponInfo() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Origin Country: " + originCountry);
    }
}
