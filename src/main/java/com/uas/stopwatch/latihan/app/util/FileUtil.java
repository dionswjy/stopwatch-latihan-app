/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uas.stopwatch.latihan.app.util;


import java.io.*;

/**
 *
 * @author LENOVO
 */
public class FileUtil {
    public static void saveObject(Object obj, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filePath))) {
            oos.writeObject(obj);
            System.out.println("Data berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            System.err.println("Gagal menyimpan data: " + e.getMessage());
        }
    }

    public static Object loadObject(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filePath))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Gagal memuat data: " + e.getMessage());
            return null;
        }
    }
    
}
