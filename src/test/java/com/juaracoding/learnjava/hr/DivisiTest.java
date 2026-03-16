package com.juaracoding.learnjava.hr;


import com.hr.Divisi;
import com.hr.Karyawan;


import org.testng.Assert;         
import org.testng.annotations.Test;

public class DivisiTest {
     @Test
    public void testTambahKaryawan() {

        Divisi divisi = new Divisi("IT");

        Karyawan k1 = new Karyawan("Budi", "Manager", 10000000);
        Karyawan k2 = new Karyawan("Ani", "Staff", 8000000);

        divisi.tambahKaryawan(k1);
        divisi.tambahKaryawan(k2);

        Assert.assertEquals(divisi.getJumlahKaryawan(), 2);
    }
}
