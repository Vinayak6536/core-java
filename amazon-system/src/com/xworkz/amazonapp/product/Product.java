package com.xworkz.amazonapp.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int productId;
    private String productName;
    private String quantity;
    private Double price;
}
