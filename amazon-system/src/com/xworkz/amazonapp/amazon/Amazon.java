package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;

public class Amazon {
    Product[] products=new Product[19];
    int index;
    public boolean addProduct(Product p){
        boolean isValid=false;
        if(p != null){
            products[index++]=p;
            isValid=true;
        }
        else {
            System.out.println("Invalid Details");
        }
        return isValid;
    }

        public void getProductDetails(){
        for (Product product:products){
            System.out.println("Product Id Is:"+product.getProductId());
            System.out.println("Product Name Is:"+product.getProductName());
            System.out.println("Product Quantity:"+product.getQuantity());
            System.out.println("Product Price Is:"+product.getPrice());
            System.out.println();
        }
        }
}
