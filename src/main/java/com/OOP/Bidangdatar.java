package com.OOP;

public class Bidangdatar {
    void Gambar (){
        System.out.println("Default draw");
    }
}
class Segitiga extends Bidangdatar {
    @Override
    void Gambar() {
        System.out.println("Gambar Sigitiga");
    }
}

class Lingkaran extends Bidangdatar {
    @Override
    void Gambar() {
        System.out.println("Gambar Lingkaran");
    }
}
