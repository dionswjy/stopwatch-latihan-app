/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uas.stopwatch.latihan.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
// JadwalLatihan menyimpan daftar Latihan
public class JadwalLatihan<T> implements Serializable {
    private List<Latihan<T>> daftarLatihan;

    public JadwalLatihan() {
        daftarLatihan = new ArrayList<>();
    }

    public void tambahLatihan(Latihan<T> latihan) {
        daftarLatihan.add(latihan);
    }

    public void hapusLatihan(Latihan<T> latihan) {
        daftarLatihan.remove(latihan);
    }

    public List<Latihan<T>> getDaftarLatihan() {
        return daftarLatihan;
    }

    @Override
    public String toString() {
        return "JadwalLatihan{" +
                "daftarLatihan=" + daftarLatihan +
                '}';
    }
}
