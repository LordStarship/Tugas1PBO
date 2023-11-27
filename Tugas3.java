package com.mycompany.tugaspbo;
import java.io.FileNotFoundException;

public class Tugas3 {
    public static void main(String[] args){
        try {
            readFileTugas3 readFile2 = new readFileTugas3();
            readFile2.bacaFile("ename.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!");
        }
        catch (Exception e) {
            System.out.println("Tidak dapat membuka file!");
        }
    }
}
