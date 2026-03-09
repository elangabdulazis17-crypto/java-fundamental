package com.juaracoding.learnjava;
import java.util.Scanner;


public class Tugas {

    static int saldo = 1000000; // saldo awal

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        if(login(input)){

            int pilihan;

            while(true){

                System.out.println("\n===== MENU ATM =====");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");

                pilihan = input.nextInt();

                switch(pilihan){

                    case 1:
                        cekSaldo();
                        break;

                    case 2:
                        setor(input);
                        break;

                    case 3:
                        tarik(input);
                        break;

                    case 4:
                        System.out.println("Terima kasih telah menggunakan ATM.");
                        return;

                    default:
                        System.out.println("Menu tidak tersedia.");
                }
            }

        }else{
            System.out.println("Login gagal!");
        }

    }

    public static boolean login(Scanner input){

        String userBenar = "admin";
        String passBenar = "1234";

        System.out.println("===== LOGIN ATM =====");

        System.out.print("Masukkan Username: ");
        String username = input.nextLine();

        System.out.print("Masukkan PIN: ");
        String password = input.nextLine();

        if(username.equals(userBenar) && password.equals(passBenar)){
            System.out.println("Login berhasil!");
            return true;
        }else{
            return false;
        }

    }

    public static void cekSaldo(){
        System.out.println("Saldo Anda: Rp " + saldo);
    }

    public static void setor(Scanner input){

        System.out.print("Masukkan jumlah setor: ");
        int jumlah = input.nextInt();

        saldo += jumlah;

        System.out.println("Setor berhasil.");
        System.out.println("Saldo sekarang: Rp " + saldo);

    }

    public static void tarik(Scanner input){

        System.out.print("Masukkan jumlah tarik: ");
        int jumlah = input.nextInt();

        if(jumlah > saldo){
            System.out.println("Saldo tidak mencukupi.");
        }else{
            saldo -= jumlah;
            System.out.println("Tarik tunai berhasil.");
            System.out.println("Saldo sekarang: Rp " + saldo);
        }

    }

}

