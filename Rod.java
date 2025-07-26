class Rod {

    Rod() {
        System.out.println("Rod is Invoked");
    }

    Rod(int rodId, String material, double length, double thickness, boolean isHollow, String usageType) {
        System.out.println("Rod is Invoked");
        this.rodId = rodId;
        this.material = material;
        this.length = length;
        this.thickness = thickness;
        this.isHollow = isHollow;
        this.usageType = usageType;
    }

    int rodId;
    String material;
    double length;
    double thickness;
    boolean isHollow;
    String usageType;

    public void getRodInfo() {
        System.out.println("Rod ID: " + rodId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length);
        System.out.println("Thickness: " + thickness);
        System.out.println("Hollow: " + isHollow);
        System.out.println("Usage Type: " + usageType);
    }
}
