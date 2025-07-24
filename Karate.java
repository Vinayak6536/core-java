class Karate {
    int karateId;
    String style;
    String beltColor;
    int experienceYears;
    String dojoName;
    boolean competition;
    double rating;
    String paymentMode;

    public void getKarateInfo() {
        System.out.println("Karate ID: " + karateId);
        System.out.println("Style: " + style);
        System.out.println("Belt Color: " + beltColor);
        System.out.println("Experience Years: " + experienceYears);
        System.out.println("Dojo Name: " + dojoName);
        System.out.println("Competition: " + competition);
        System.out.println("Rating: " + rating);
        System.out.println("Payment Mode: " + paymentMode);
    }
}