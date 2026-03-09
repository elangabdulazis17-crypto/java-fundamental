package com.juaracoding.learnjava;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {
    //   for(int i = 0 ; i < 10 ; i++){
    //     System.out.println(i);
    //   }
    //     for(int i = 0 ; i < 10 ; i++){
    //         if (i %2 == 0) {//Untuk Genap lihat tanda == (artinya sisa bagi = 0 hasil nya genap)
    //              System.out.println(i);
    //         }
    //   }
    //   for(int i = 0 ; i < 10 ; i++){
    //         if (i %2 != 0) {//Untuk angka ganjil lihat tanda != (Kalau sisa bagi bukan 0 → berarti ganjil)
    //              System.out.println(i);
    //         }
    //   }
        // for(int i = 1 ; i < 10 ; i++){
        //     if (i %2 != 0) {//Untuk angka ganjil lihat tanda != (Kalau sisa bagi bukan 0 → berarti ganjil)
        //          System.out.println(i);
        //          i++;
            // }

        //kotak

        

        int sisi = 5;
        for (int i = 0; i < sisi ; i++){//untuk menampilkan kotak 5x5 
            for( int j = 0; j < sisi; j++){
                System.out.print("*");//PERHATIKAN .PRINTNYA !!!
            }
            System.out.println("");

        }

        // int sisi = 10;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*****");
            }
            System.out.println("");
        }
        
      for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < i; j++) {//untuk segita biasa
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = sisi; i > 0; i--) {
          for (int j = i; j > 0; j--) {//untuk segitiga terbalik
            System.out.print("*");
          }  
          System.out.println("");
        }

         for (int i = sisi; i >= 1; i--) {
          for (int j = 1; j <= i; j++) {//untuk segitiga terbalik
            System.out.print("*");
          }  
          System.out.println("");
        }
        //while
        int x = 1 ;
        while (x < 1) {
            System.out.println("x = "+ x);
            x++;
        }
        //do while
        int y = 1;
        do{
            System.out.println("y = "+ y);
            y++;
        }while (y < 1);
            
            Scanner scanner = new Scanner(System.in);

            int batas = 3;
            boolean isBlocked = false;
            while (batas > 0) {
                  //login gagal 3x blokir sementara hubungin cs 
                System.out.println("Masukkan User Name : ");
                String username = scanner.next();
                System.out.println("Input Password");
                String Password = scanner.next();

                if (username.equals("admin") && Password.equals("Indonesia")) {
                System.out.println("Berhasil Login");
            }else{
                System.out.println("Login Gagal ,Silahkan Login Kembali");
            }
            System.out.println(batas-1);
            batas--;
            if(batas == 0){
                isBlocked = true;
            }
             if(isBlocked){
            System.out.println("Akun terblokir sementara hub cs");
        }
    }

        


        
        int sum = 0;
        while (true) {
            System.out.println("Silahkan input angka : ");
            int angka = scanner.nextInt();
            if (angka == 100) break; 
            sum += angka;
            
            // {
            //    System.out.println("Total = "+sum);
            // }          
        }
        System.out.println("Total = "+sum);
      
    }


}
