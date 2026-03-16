package com.hr;

public class Karyawan {
    private String nama;
    private String jabatan;
    private double gajiPokok;

    public Karyawan(String nama, String jabatan, double gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGajiTotal() {
        double tunjangan = 0;

        if (jabatan.equalsIgnoreCase("Manager")) {
            tunjangan = 5000000;
        } else if (jabatan.equalsIgnoreCase("Staff")) {
            tunjangan = 2000000;
        }

        return gajiPokok + tunjangan;
    }

    public void updateGaji(double persentase) {
        gajiPokok = gajiPokok + (gajiPokok * persentase / 100);
    }

    public double getGajiPokok() {
        return gajiPokok;
    }
}
