class Weapon {
    int weaponId;
    String weaponName;
    String weaponType;
    double weightKg;
    double lengthMeters;
    String material;
    String paymentMode;

    public void getWeaponInfo() {
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Weapon Name: " + weaponName);
        System.out.println("Weapon Type: " + weaponType);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Length (m): " + lengthMeters);
        System.out.println("Material: " + material);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
