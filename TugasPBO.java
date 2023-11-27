package com.mycompany.tugaspbo;

import java.io.FileNotFoundException;

public class TugasPBO {
    // Tugas 1
    // --------------------------
    public void dataBarang(int kodeBrg, String namaBrg, String gudang, double hargaBeli, double hargaJual, int jumlah) throws MyException {
        if (hargaJual <= 0 || jumlah < 0) {
            throw new MyException ("Harga jual dan jumlah harus lebih dari 0!");
        }
        System.out.println("Barang berhasil dimasukkan.");
    }
    
    public static void main(String[] args) {
        try {
            TugasPBO dataBarang1 = new TugasPBO();
            dataBarang1.dataBarang(123456, "Pisang", "Buah", 20000, -2, 1);
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
        }
    // --------------------------
    // Tugas 2
    // --------------------------
        try {
            readFile readFile1 = new readFile();
            readFile1.bacaFile("ename.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!");
        }
    // --------------------------
    // Tugas 3
    // --------------------------
        try {
            readFile readFile2 = new readFile();
            readFile2.bacaFile("ename.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!");
        }
        catch (Exception e) {
            System.out.println("Tidak dapat membuka file!");
        }
    // --------------------------
    
    }
}
