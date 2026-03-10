package com.OOP;

import java.util.ArrayList;
import java.util.List;

public class SampleCollection {
    public static void main(String[] args) {
    //     List <String> listNama = List.of("Dimas","Rizky","Dwi","Fajar");
    //     System.out.println("List Nama : " +listNama);
    // }
    List <String> cars = new ArrayList<String>();
    cars.add("Honda");
    cars.add("Toyota");
    cars.add("Suzuki");
    cars.add("Dhatsu");
    System.out.println("Mobil : " + cars.get(2));
    System.out.println(cars);
    
    }
}