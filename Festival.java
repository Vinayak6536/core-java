class Festival {
    int festivalId;
    String name;
    String state;
    String month;
    boolean isNationalHoliday;

    public void getFestivalInfo() {
        System.out.println("Festival ID: " + festivalId);
        System.out.println("Name: " + name);
        System.out.println("State: " + state);
        System.out.println("Month: " + month);
        System.out.println("Is National Holiday: " + isNationalHoliday);
    }
}