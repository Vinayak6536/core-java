class ProductMode{
    public static void offline(String productName,int productprice,int productQuantity){
        Product.details(productName,productprice);
        System.out.println("Product Quantity"+productQuantity);
    }
}