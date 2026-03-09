package com.juaracoding.learnjava;

public class Method {

 
    public static void main(String[] args) {
        //method tanpa parameter
        kotak();
        System.out.println();
        kotak();

        //method dengan parameter
        segitiga(5);
        System.out.println();
        segitiga(10);

        //method dengan return value 
        System.out.println(luasKotak(5));
        System.out.println(luasKotak(10));

        
        double[] prices = {40000,50000,60000};
        System.out.println(totalBayar(prices));

         String[] namaProduk = {"Asus", "MSI", "Colorful"};
         listProduct(namaProduk, prices);
        
    }
   
    
    public static void kotak (){
        int sisi = 5;
        for (int i = 0; i < sisi ; i++){//untuk menampilkan kotak 5x5 
            for( int j = 0; j < sisi; j++){
                System.out.print("*");//PERHATIKAN .PRINTNYA !!!
            }
            System.out.println("");

        }
    }
    public static void segitiga (int sisi){
        
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < i; j++) {//untuk segita biasa
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static int luasKotak (int sisi){
        return sisi * sisi ;
    }

    //diskon
    public static double kalkulasiDiskon (int harga , double diskon ){
        return harga - harga * diskon /100;
    }
    public static double subTotal (int harga , int qty , int diskon){
        double totalDiskon = kalkulasiDiskon(harga, diskon);
        if (totalDiskon > 100000) {
            return kalkulasiDiskon(harga, totalDiskon);
        }
        else{
            return totalDiskon;
        }    
      
   }
       //total bayar param array prices;
         private static double totalBayar(double[] prices) {
         double total = 10;
            for (int i = 0; i < prices.length; i++) {
                total += prices[i];
        }
        return total;
    }

    //list product dengan parameter array nama product dan harga
    public static void listProduct(String[] namaproduct,double[] harga){
        
        for (int i = 0; i < harga.length; i++) {
            System.out.printf("%d. %s Rp. %.2f%n", i+1, namaproduct[i],harga[i]);
            
        }
    }

    // method login
    public static void login(String username, String password) {
        if(username.equals("admin") && password.equals("Indonesia")) {
            System.out.println("Login berhasil");
            // menuApp()
        } else {
            System.out.println("Login gagal");
        }
    }
    public static void menuApp(int menu){
        System.out.println("Selamat data di aplikasi");
        System.out.println("1. List Product ");
        switch (menu) {
            case 1:
                double[] prices = {10000,20000,30000};
                System.out.println("Total bayar : " + totalBayar(prices));
                String [] namaProduk = {"Asus", "MSI", "Colorful"};
                listProduct(namaProduk, prices);
                break;
            case 2 :
                System.out.println("Anda memilih menu 2");

                break;
            default:
                break;
        }
    }

}