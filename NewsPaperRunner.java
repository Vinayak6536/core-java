class NewsPaperRunner{
    public static void main(String[] paper){
        System.out.println("Main Started");
        NewsPaper newspaper=new NewsPaper();
        newspaper.newsPaperId=1;

        newspaper.noOfPages=12;

        newspaper.language="Kannada";
    
        newspaper.date="11/12/2024";

        newspaper.day="Sunday";

        newspaper.companyName="Prajavani";

        newspaper.getNewsPaperInfo();
        System.out.println("");

        System.out.println("Main Ended");
    }
}