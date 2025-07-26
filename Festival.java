class Festival {

    Festival() {
        System.out.println("Festival is Invoked");
    }

    Festival(int festivalId,String name,String region,String month,int durationDays,boolean isNationalHoliday) {
        System.out.println("Festival is Invoked");
        this.festivalId=festivalId;
        this.name=name;
        this.region=region;
        this.month=month;
        this.durationDays=durationDays;
        this.isNationalHoliday=isNationalHoliday;
    }

    int festivalId;
    String name;
    String region;
    String month;
    int durationDays;
    boolean isNationalHoliday;

    public void getFestivalInfo() {
        System.out.println("Festival ID: " + festivalId);
        System.out.println("Name: " + name);
        System.out.println("Region: " + region);
        System.out.println("Month: " + month);
        System.out.println("Duration (Days): " + durationDays);
        System.out.println("National Holiday: " + isNationalHoliday);
    }
}
