package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Product product=new Product();
        product.setProductId(1);
        product.setProductName("Shenga");
        product.setQuantity("2Kg");
        product.setPrice(220.00);

        Product productOne = new Product();
        productOne.setProductId(1);
        productOne.setProductName("Shenga");
        productOne.setQuantity("2Kg");
        productOne.setPrice(220.00);

        Product productTwo = new Product();
        productTwo.setProductId(2);
        productTwo.setProductName("Akki");
        productTwo.setQuantity("5Kg");
        productTwo.setPrice(300.00);

        Product productThree = new Product();
        productThree.setProductId(3);
        productThree.setProductName("Bela");
        productThree.setQuantity("1Kg");
        productThree.setPrice(60.00);

        Product productFour = new Product();
        productFour.setProductId(4);
        productFour.setProductName("Jaggery");
        productFour.setQuantity("2Kg");
        productFour.setPrice(120.00);

        Product productFive = new Product();
        productFive.setProductId(5);
        productFive.setProductName("Hesaru Bele");
        productFive.setQuantity("1Kg");
        productFive.setPrice(110.00);

        Product productSix = new Product();
        productSix.setProductId(6);
        productSix.setProductName("Kadale Bele");
        productSix.setQuantity("1Kg");
        productSix.setPrice(100.00);

        Product productSeven = new Product();
        productSeven.setProductId(7);
        productSeven.setProductName("Tur Dal");
        productSeven.setQuantity("2Kg");
        productSeven.setPrice(240.00);

        Product productEight = new Product();
        productEight.setProductId(8);
        productEight.setProductName("Ragi");
        productEight.setQuantity("3Kg");
        productEight.setPrice(90.00);

        Product productNine = new Product();
        productNine.setProductId(9);
        productNine.setProductName("Navane");
        productNine.setQuantity("1Kg");
        productNine.setPrice(80.00);

        Product productTen = new Product();
        productTen.setProductId(10);
        productTen.setProductName("Sajje");
        productTen.setQuantity("2Kg");
        productTen.setPrice(70.00);

        Product productEleven = new Product();
        productEleven.setProductId(11);
        productEleven.setProductName("Salt");
        productEleven.setQuantity("1Kg");
        productEleven.setPrice(20.00);

        Product productTwelve = new Product();
        productTwelve.setProductId(12);
        productTwelve.setProductName("Sugar");
        productTwelve.setQuantity("2Kg");
        productTwelve.setPrice(90.00);

        Product productThirteen = new Product();
        productThirteen.setProductId(13);
        productThirteen.setProductName("Oil");
        productThirteen.setQuantity("1L");
        productThirteen.setPrice(150.00);

        Product productFourteen = new Product();
        productFourteen.setProductId(14);
        productFourteen.setProductName("Ghee");
        productFourteen.setQuantity("500ml");
        productFourteen.setPrice(180.00);

        Product productFifteen = new Product();
        productFifteen.setProductId(15);
        productFifteen.setProductName("Milk Powder");
        productFifteen.setQuantity("1Kg");
        productFifteen.setPrice(200.00);

        Product productSixteen = new Product();
        productSixteen.setProductId(16);
        productSixteen.setProductName("Coffee Powder");
        productSixteen.setQuantity("250g");
        productSixteen.setPrice(120.00);

        Product productSeventeen = new Product();
        productSeventeen.setProductId(17);
        productSeventeen.setProductName("Tea Powder");
        productSeventeen.setQuantity("250g");
        productSeventeen.setPrice(100.00);

        Product productEighteen = new Product();
        productEighteen.setProductId(18);
        productEighteen.setProductName("Masala");
        productEighteen.setQuantity("100g");
        productEighteen.setPrice(75.00);


        Amazon amazon=new Amazon();
        amazon.addProduct(product);
        amazon.addProduct(productOne);
        amazon.addProduct(productTwo);
        amazon.addProduct(productThree);
        amazon.addProduct(productFour);
        amazon.addProduct(productFive);
        amazon.addProduct(productSix);
        amazon.addProduct(productSeven);
        amazon.addProduct(productEight);
        amazon.addProduct(productNine);
        amazon.addProduct(productTen);
        amazon.addProduct(productEleven);
        amazon.addProduct(productTwelve);
        amazon.addProduct(productThirteen);
        amazon.addProduct(productFourteen);
        amazon.addProduct(productFifteen);
        amazon.addProduct(productSixteen);
        amazon.addProduct(productSeventeen);
        amazon.addProduct(productEighteen);

        amazon.getProductDetails();

        System.out.println("Main Ended");


    }
}
