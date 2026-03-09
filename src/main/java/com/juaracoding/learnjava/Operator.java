package com.juaracoding.learnjava;

public class Operator {
     public static void main( String[] args )
    {
        //subtotal
        //diskon
        //like count
        //tombol incroment decrement
        //rata-rata rating

        int modulus = 5 % 2;
        System.out.println(modulus);

        int x = 2;
        int num1 = 10 * x++; // suffix 
        System.out.println(num1);


        int y = 5;
        int num2 = 10 * ++y; // prefix
        System.out.println(num2);
        
        int num3 = 10 + 5 * 3;
        System.out.println(num3);

        int num4 = (10 + 5) * 3;
        System.out.println(num4);

        int a = 10000;
        int b = 5000;
        int num5 = a + b ;
        System.out.println(num5);

        //operator perbandingan 

        //gerbang logika 

        //bitwise

        int hasil = 10 | 12 ;
        System.out.println(hasil);

        int hasil1 = 10 & 12 ;
        System.out.println(hasil1);


        
    }
    
}
