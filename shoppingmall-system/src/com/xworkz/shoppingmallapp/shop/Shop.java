package com.xworkz.shoppingmallapp.shop;

import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class Shop {
  ShoppingMall[] shoppingMalls=new ShoppingMall[13];
  int index;

  public boolean addShoppingMall(ShoppingMall s){
      boolean isValid=false;
      if(s != null){
          shoppingMalls[index++]=s;
          isValid=true;
      }
      else {
          System.out.println("Invalid Details");
      }
      return isValid;
  }

  public void getShoppingMallDetails(){
      for (ShoppingMall shoppingMall:shoppingMalls){
          System.out.println("ShoppingMall Id Is:"+shoppingMall.getShopId());
          System.out.println("ShoppingMall Name Is:"+shoppingMall.getName());
          System.out.println("ShoppingMall Lovation Is:"+shoppingMall.getLocation());
          System.out.println("Total Stores :"+shoppingMall.getTotalStores());
          System.out.println();
      }
  }
}
