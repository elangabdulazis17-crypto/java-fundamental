package com.juaracoding.learnjava;

import java.util.Random;
import java.util.Scanner;

public class Percabangan {
    
   public static void main( String[] args )
    {


        // kalo kotak layang" itu desission 
        // kalo kotak biasa itu input kalo tidak output

        int stock =  0;
        int MinimalPembelian = 1;

        if (stock < MinimalPembelian) {
            System.out.println("Minimal Pembelian " + MinimalPembelian);
        }else{
            System.out.println("Tombol Clickable");
        }

        int count = 9;
        if (count > stock) {
            System.out.println("Jumlah Pembelian melebihi stok tersedia");
        }else if (count < MinimalPembelian) {
            System.out.println("Jumlah Order tidak boleh melebihi" + MinimalPembelian);
        }
        else{
            System.out.println("Tombol Clickable");
        }

        int harga = 100000;
        double diskon = 10;

        //Jika total belanja 100000 diskon 10%
        if (harga >= 100000) {
            diskon = harga * 0.10;
            System.out.println("Berhasil mendapatkan diskon");
        }else{
            System.out.println("Tidak mendapatkan diskon");
        }

        // int count = 0;
        // int minOrder = 1;
        // if (count < minOrder) {
        //     System.out.println("Jumlah order tidak boleh kurang dari " + minOrder);
        // } else {
        //     System.out.println("Pesanan berhasil diproses");
        // }
        // int stock = 9;
        // if (count > stock) {
        //     System.out.println("Jumlah order melebihi stok yang tersedia");
        // } else if (count < minOrder) {
        //     System.out.println("Jumlah order tidak boleh kurang dari " + minOrder);
        // } else {
        //     System.out.println("Pesanan berhasil diproses");
        // }


    int bilangan = 11;
    
    if (bilangan % 2 ==0) {
        System.out.println( bilangan+" Genap");
    }else{
        System.out.println(bilangan+" Ganjil");
    }


    int Nilai = 85;
    if (Nilai >= 87) {
        System.out.println(Nilai+" Sangat Baik");
    }else if (Nilai >= 84) {
        System.out.println(Nilai+"  Baik");
    }
        
    Random random = new Random();
    int otpValue = 100000 + random.nextInt(90000);
    System.out.println(otpValue);


    Scanner scanner = new Scanner(System.in);
    // System.out.println("Silahkan input OTP = ");
    // int inputOtp = scanner.nextInt();

    // if (inputOtp == otpValue) {
    //     System.out.println("Verifikasi Berhasil");
    // }else{
    //     System.out.println("Otp tidak valid");
    // }

    // String email = "Juaracoding@gmail.com";
    // System.out.println(email.equalsIgnoreCase("Juaracoding@gmail.com"));


    //switch 
    System.out.println("Plihan Menu");
    System.out.println("1. Cek Saldo");
    System.out.println("2. Deposit");
    System.out.println("3. Tarik Tunai");
    System.out.println("4 .Exit");
    System.out.println("Silahkan Plih Menu");
    
    int menu = scanner.nextInt();

    switch (menu) {
        case 1:
            System.out.println("Cek Saldo");
            //Bisnis logic cek saldo
            break;
        case 2 :
            System.out.println("Deposit");
            break;
        case 3 :
            System.out.println("Tarik Tunai");
            break;
        case 4 :
            System.exit(0);
            break;
    
        default:
            System.out.println("Tidak ada pilihan menu tersebut");
            break;
    }


    //operator ternary
    String attrType = "Password";
    String iconEye = attrType.equals("Password")? "Hide Password ":"Show Password";
    System.out.println("iconEye");




    }

  
}
