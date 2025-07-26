class Karate {

    Karate() {
        System.out.println("Karate is Invoked");
    }

    Karate(int karateId, String style, String beltLevel, String instructor, int durationMonths, boolean isCompetitive) {
        System.out.println("Karate is Invoked");
        this.karateId = karateId;
        this.style = style;
        this.beltLevel = beltLevel;
        this.instructor = instructor;
        this.durationMonths = durationMonths;
        this.isCompetitive = isCompetitive;
    }

    int karateId;
    String style;
    String beltLevel;
    String instructor;
    int durationMonths;
    boolean isCompetitive;

    public void getKarateInfo() {
        System.out.println("Karate ID: " + karateId);
        System.out.println("Style: " + style);
        System.out.println("Belt Level: " + beltLevel);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration (Months): " + durationMonths);
        System.out.println("Competitive: " + isCompetitive);
    }
}
