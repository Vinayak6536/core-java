class Doctor{
    public static void Treatment(String patientName,int age,String disease){
        System.out.println("Treatment Started");
         Nurse.assist(patientName);
         System.out.println(patientName+"You were cured from"+disease);
    System.out.println("Treatment Done...");
}
}