package com.juaracoding.learnjava.hr;


import com.hr.Karyawan;

import org.testng.Assert;         
import org.testng.annotations.Test;


public class KaryawanTest {
     @Test
    public void testHitungGajiManager() {

        Karyawan k = new Karyawan("Budi", "Manager", 10000000);

        double total = k.hitungGajiTotal();

        Assert.assertEquals(total, 15000000);
    }

    @Test
    public void testHitungGajiStaff() {

        Karyawan k = new Karyawan("Ani", "Staff", 8000000);

        double total = k.hitungGajiTotal();

        Assert.assertEquals(total, 10000000);
    }

    @Test
    public void testUpdateGaji() {

        Karyawan k = new Karyawan("Dodi", "Staff", 10000000);

        k.updateGaji(10);

        Assert.assertEquals(k.getGajiPokok(), 11000000);
    }
}
