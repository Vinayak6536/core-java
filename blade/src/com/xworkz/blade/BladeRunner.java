package com.xworkz.blade;

public class BladeRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Blade blade = new Blade();
        blade.bladeId = 1;
        blade.brandName = "Nike";
        blade.bladeType = "Hockey";
        blade.bladeMaterial = "Composite";
        blade.bladePrice = 150.00;
        blade.paymentMode = "Credit Card";
        blade.getBladeInfo();
    }
}
