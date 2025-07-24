class HospitalRunner{

    static String patientName="darshan";
    static int age=25;
    static long mobNo=67677667667L;
    static String email="vinayak@gmail.com";
    static String disease="Back pain";
    public static void main(String[] hospital){
        Hospital.checkUp(patientName,age,mobNo,email,disease);
    }
}