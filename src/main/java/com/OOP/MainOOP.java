package com.OOP;

public class MainOOP {
    public static void main(String[] args) {
        
        Fruit orange = new Fruit();
        orange.grams = 1500/10;
        orange.calsPerGram = 47;
        System.out.println("Total colories in orange : " + orange.totalCalories());
        
        
        Fruit apple = new Fruit();
        apple.grams = 1000/100;
        apple.calsPerGram = 52;
        System.out.println("Total colories in apple : " + apple.totalCalories());

        Kotak kotak1 = new Kotak(5);
        kotak1.draw();
        System.out.println("Luas kotak  : " + kotak1.luas());

        Karyawan karyawan = new Karyawan();
        karyawan.nama = "Dimas";
        karyawan.divisi = "QA";
        karyawan.jabatan = "Junior QA";
        karyawan.salary = 5000000;
        karyawan.printData();

    }
}
