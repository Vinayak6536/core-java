package com.xworkz.space.commercial;

@FunctionalInterface
public interface Addition {
    int add(int a,int b);

   public default int add(int a,int b,int c){                    //Concrete method if possible to Java 8
       return a+b+c;
   };
    public static int add(int a,int b,int c,int d){                    //Concrete method if possible to Java 8
        return a+b+c;
    }
}
