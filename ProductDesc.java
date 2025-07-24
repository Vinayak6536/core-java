class ProductDesc{
    public static void description(String productName,int productprice,int productQuantity,String selectproduct){
        ProductMode.offline(productName,productprice,productQuantity);
        System.out.println("Select Product"+selectproduct);
    }
}