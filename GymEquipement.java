class GymEquipement {

    GymEquipement() {
        System.out.println("GymEquipement is Invoked");
    }

    GymEquipement(int equipId, String name, String type, double weight, String brand, boolean isElectronic) {
        System.out.println("GymEquipement is Invoked");
        this.equipId = equipId;
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.brand = brand;
        this.isElectronic = isElectronic;
    }

    int equipId;
    String name;
    String type;
    double weight;
    String brand;
    boolean isElectronic;

    public void getGymEquipementInfo() {
        System.out.println("Equipement ID: " + equipId);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Brand: " + brand);
        System.out.println("Electronic: " + isElectronic);
    }
}
