class Pipe {

    Pipe() {
        System.out.println("Pipe is Invoked");
    }

    Pipe(int pipeId, String material, double length, double diameter, boolean isFlexible, String usageType) {
        System.out.println("Pipe is Invoked");
        this.pipeId = pipeId;
        this.material = material;
        this.length = length;
        this.diameter = diameter;
        this.isFlexible = isFlexible;
        this.usageType = usageType;
    }

    int pipeId;
    String material;
    double length;
    double diameter;
    boolean isFlexible;
    String usageType;

    public void getPipeInfo() {
        System.out.println("Pipe ID: " + pipeId);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length);
        System.out.println("Diameter: " + diameter);
        System.out.println("Flexible: " + isFlexible);
        System.out.println("Usage Type: " + usageType);
    }
}
