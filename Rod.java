class Rod {
    int rodId;
    String rodMaterial;
    double rodLengthMeters;
    double rodWeightKg;
    String rodType;
    String paymentMode;

    public void getRodInfo() {
        System.out.println("Rod ID: " + rodId);
        System.out.println("Rod Material: " + rodMaterial);
        System.out.println("Rod Length (meters): " + rodLengthMeters);
        System.out.println("Rod Weight (kg): " + rodWeightKg);
        System.out.println("Rod Type: " + rodType);
        System.out.println("Payment Mode: " + paymentMode);
    }
}
