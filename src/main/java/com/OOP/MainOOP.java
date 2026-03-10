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

        //encapsulation
        Karyawan karyawan = new Karyawan();
        karyawan.setNama("Dimas");
        karyawan.setDivisi("QA");
        karyawan.setJabatan("Junior QA");
        karyawan.setSalary(5000000);
        System.out.println("Nama Karyawan : " + karyawan.getNama());
        System.out.println("Divisi : " + karyawan.getDivisi());
        System.out.println("Jabatan : " + karyawan.getJabatan());
        System.out.println("Salary : " + karyawan.getSalary());


        //Polymorphism
        Calculator calculator = new Calculator();
        calculator.tambah(2, 100);
        calculator.tambah(5, 5, 5);

        Bidangdatar bidangdatar = new Bidangdatar();
        bidangdatar.Gambar();

        Bidangdatar Segitiga = new Segitiga();
        Segitiga.Gambar();


        //Inheritance

        Manager manager = new Manager();
        manager.setNama("Dimas");
        manager.setJabatan("Manager");
        manager.setDivisi("QA");
        manager.setSalary(10000000);
        System.out.println("Nama Manager : " + manager.getNama());
        System.out.println("Divisi : " + manager.getDivisi());
        System.out.println("Jabatan : " + manager.getJabatan());
        System.out.println("Salary : " + manager.getSalary());

        

    }

}
