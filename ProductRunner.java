class ProductRunner{
    public static void main(String[] product){
        String productName="SmartWatch";
        int productprice=2500;
        int productQuantity=1;
        String selectproduct="Watch";
        int amount=2600;
        Payment.online(productName,productprice,productQuantity,selectproduct,amount);
        System.out.println("Total Price:"+amount);
        System.out.println("Payment Successfully...");
        
    }
}