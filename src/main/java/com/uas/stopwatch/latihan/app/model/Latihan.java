/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uas.stopwatch.latihan.app.model;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Latihan<T> implements Serializable {
    private String hari; 
    private String namaLatihan;
    private T durasi; // Generic: durasi bisa Integer, Double, dll

    public Latihan(String hari,String namaLatihan, T durasi) {
        this.hari = hari;
        this.namaLatihan = namaLatihan;
        this.durasi = durasi;
    }

     public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getNamaLatihan() {
        return namaLatihan;
    }

    public void setNamaLatihan(String namaLatihan) {
        this.namaLatihan = namaLatihan;
    }

    public T getDurasi() {
        return durasi;
    }

    public void setDurasi(T durasi) {
        this.durasi = durasi;
    }

    @Override
    public String toString() {
        return "Latihan{" +
                "hari='" + hari + '\'' +
                ", namaLatihan='" + namaLatihan + '\'' +
                ", durasi=" + durasi +
                '}';
    }  
}
