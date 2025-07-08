/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uas.stopwatch.latihan.app.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.uas.stopwatch.latihan.app.model.Latihan;
import com.uas.stopwatch.latihan.app.model.JadwalLatihan;
import org.bson.Document;

/**
 *
 * @author LENOVO
 */
public class JadwalController<T> {
    private final MongoDBConnector connector;
    private final MongoCollection<Document> collection;

    public JadwalController() {
        connector = new MongoDBConnector();
        MongoDatabase db = connector.getDatabase();
        collection = db.getCollection("jadwal_latihan");
    }

    public void tambahLatihan(String hari, Latihan<T> latihan) {
        Document doc = new Document("hari", hari)
                .append("namaLatihan", latihan.getNamaLatihan())
                .append("durasi", latihan.getDurasi().toString());
        collection.insertOne(doc);
    }

    public JadwalLatihan<T> ambilSemuaLatihan() {
        JadwalLatihan<T> jadwal = new JadwalLatihan<>();
        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                String nama = doc.getString("namaLatihan");
                String durasi = doc.getString("durasi");
                String hari = doc.getString("hari");

                // Asumsi durasi di-cast ke String, nanti bisa diolah ke Integer kalau mau
                Latihan<T> latihan = new Latihan<>(hari,nama, (T) durasi);
                jadwal.tambahLatihan(latihan);
            }
        }
        return jadwal;
    }

    public void hapusSemuaLatihan() {
        collection.deleteMany(new Document());
    }

    public void close() {
        connector.close();
    }
}
