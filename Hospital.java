class Hospital{
    public static void checkUp(String patientName,int age,long mobNo,String email,String disease){
        System.out.println("Check Up Started");
        Doctor.Treatment(patientName,age,disease);
        System.out.println("Check Up Done....");
    }
}