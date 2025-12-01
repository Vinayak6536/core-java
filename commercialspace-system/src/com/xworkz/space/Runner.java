package com.xworkz.space;

import com.xworkz.space.commercial.*;

import java.time.LocalDate;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        //    (->) Lambda function
        System.out.println("main started");
        CommercialSpace commercialSpace= ()-> {
            System.out.println("Watch Business");
        };

        CommercialSpace commercialSpace1= () -> {
            System.out.println("Sandwitch Business");
        };

        CommercialSpace commercialSpace2= () -> {
            System.out.println("Sandwitch Business");
        };
        commercialSpace.doBusiness();
        commercialSpace1.doBusiness();
        commercialSpace2.doBusiness();


        // Addition
        System.out.println("Addition started");

        Addition addition =(a ,b)->{
            return a+b;
        };


        int sum =addition.add(12,23);
        System.out.println("sum="+sum);

//        Addition addition1 =(a ,b)->{
//            return a+b;
//        };
         int total= addition.add(10,20,20);
        System.out.println("additional 3 number "+total);

        int totalNoof4=Addition.add(1,4,5,6);
        System.out.println("totalNoof4="+totalNoof4);
        System.out.println("Substration started");

        Substraction substraction =(a , b)->{
            return a-b;
        };
        int sub =substraction.sub(12,23);
        System.out.println("sub="+sub);

        System.out.println("Multiflication started");

        Multiflication multiflication =(a , b)->{
            return a*b;
        };
        int mult =multiflication.mult(12,23);
        System.out.println("Mult="+mult);

        System.out.println("Division started");

        Division division =(a , b)->{
            return a/b;
        };
        int div =division.div(12,23);
        System.out.println("div="+div);


        Date date =new Date();
        System.out.println(date);

        LocalDate date1=LocalDate.of(2025,02,02);
        System.out.println(date1);


        System.out.println("main ended");
    }
}

