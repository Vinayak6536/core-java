class NewsPaperRunner{
    public static void main(String[] paper){
        System.out.println("Main Started");
        NewsPaper newspaper=new NewsPaper();
        newspaper.newsPaperId=1;
        System.out.println("The News Paper ID is:"+newspaper.newsPaperId);

        newspaper.noOfPages=12;
        System.out.println("The News Paper Pages Of:"+newspaper.noOfPages);

        newspaper.language="Kannada";
        System.out.println("The News Paper Language is:"+newspaper.language);
    
        newspaper.date="11/12/2024";
        System.out.println("The News Paper Date is:"+newspaper.date);

        newspaper.day="Sunday";
        System.out.println("The Day is:"+newspaper.day);

        newspaper.companyName="Prajavani";
        System.out.println("The News Paper Company is:"+newspaper.companyName);
    }
}