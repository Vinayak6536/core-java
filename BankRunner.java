class BankRunner{
    public static void main(String[] login){
        boolean isSafeBank = Bank.details("Abc",586128,"Bharat");
        System.out.println(" Is Safe Bank:"+isSafeBank);

        Bank.getBankInfo();
        
    }
}