package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.shop.Shop;
import com.xworkz.shoppingmallapp.shoppingmall.ShoppingMall;

public class ShopRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        ShoppingMall shoppingMall=new ShoppingMall();
        shoppingMall.setShopId(1);
        shoppingMall.setName("Jockey");
        shoppingMall.setLocation("Lulu Mall");
        shoppingMall.setTotalStores(2);

        ShoppingMall shoppingMallOne = new ShoppingMall();
        shoppingMallOne.setShopId(13);
        shoppingMallOne.setName("Fabindia");
        shoppingMallOne.setLocation("Indiranagar");
        shoppingMallOne.setTotalStores(2);

        ShoppingMall shoppingMallTwo = new ShoppingMall();
        shoppingMallTwo.setShopId(2);
        shoppingMallTwo.setName("Levis");
        shoppingMallTwo.setLocation("Phoenix Mall");
        shoppingMallTwo.setTotalStores(3);

        ShoppingMall shoppingMallThree = new ShoppingMall();
        shoppingMallThree.setShopId(3);
        shoppingMallThree.setName("Nike");
        shoppingMallThree.setLocation("Forum Mall");
        shoppingMallThree.setTotalStores(4);

        ShoppingMall shoppingMallFour = new ShoppingMall();
        shoppingMallFour.setShopId(4);
        shoppingMallFour.setName("Adidas");
        shoppingMallFour.setLocation("Orion Mall");
        shoppingMallFour.setTotalStores(2);

        ShoppingMall shoppingMallFive = new ShoppingMall();
        shoppingMallFive.setShopId(5);
        shoppingMallFive.setName("Puma");
        shoppingMallFive.setLocation("Mantri Square");
        shoppingMallFive.setTotalStores(5);

        ShoppingMall shoppingMallSix = new ShoppingMall();
        shoppingMallSix.setShopId(6);
        shoppingMallSix.setName("Zara");
        shoppingMallSix.setLocation("UB City");
        shoppingMallSix.setTotalStores(3);

        ShoppingMall shoppingMallSeven = new ShoppingMall();
        shoppingMallSeven.setShopId(7);
        shoppingMallSeven.setName("H&M");
        shoppingMallSeven.setLocation("Garuda Mall");
        shoppingMallSeven.setTotalStores(4);

        ShoppingMall shoppingMallEight = new ShoppingMall();
        shoppingMallEight.setShopId(8);
        shoppingMallEight.setName("Westside");
        shoppingMallEight.setLocation("City Centre");
        shoppingMallEight.setTotalStores(2);

        ShoppingMall shoppingMallNine = new ShoppingMall();
        shoppingMallNine.setShopId(9);
        shoppingMallNine.setName("Max");
        shoppingMallNine.setLocation("Gopalan Mall");
        shoppingMallNine.setTotalStores(6);

        ShoppingMall shoppingMallTen = new ShoppingMall();
        shoppingMallTen.setShopId(10);
        shoppingMallTen.setName("Pantaloons");
        shoppingMallTen.setLocation("Lulu Mall");
        shoppingMallTen.setTotalStores(4);

        ShoppingMall shoppingMallEleven = new ShoppingMall();
        shoppingMallEleven.setShopId(11);
        shoppingMallEleven.setName("Reliance Trends");
        shoppingMallEleven.setLocation("Forum Shantiniketan");
        shoppingMallEleven.setTotalStores(3);

        ShoppingMall shoppingMallTwelve = new ShoppingMall();
        shoppingMallTwelve.setShopId(12);
        shoppingMallTwelve.setName("Lifestyle");
        shoppingMallTwelve.setLocation("Phoenix Marketcity");
        shoppingMallTwelve.setTotalStores(5);

        Shop shop=new Shop();
        shop.addShoppingMall(shoppingMall);
        shop.addShoppingMall(shoppingMallOne);
        shop.addShoppingMall(shoppingMallTwo);
        shop.addShoppingMall(shoppingMallThree);
        shop.addShoppingMall(shoppingMallFour);
        shop.addShoppingMall(shoppingMallFive);
        shop.addShoppingMall(shoppingMallSix);
        shop.addShoppingMall(shoppingMallSeven);
        shop.addShoppingMall(shoppingMallEight);
        shop.addShoppingMall(shoppingMallNine);
        shop.addShoppingMall(shoppingMallTen);
        shop.addShoppingMall(shoppingMallEleven);
        shop.addShoppingMall(shoppingMallTwelve);

        shop.getShoppingMallDetails();

        System.out.println("Main Ended");
    }
}
