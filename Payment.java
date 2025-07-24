class Payment{
    public static void online(String productName,int productprice,int productQuantity,String selectproduct,int amount){
        ProductDesc.description(productName,productprice,productQuantity,selectproduct);
        System.out.println("Product Amount"+amount);
    }
}