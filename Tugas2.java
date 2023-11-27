package com.mycompany.tugaspbo;
import java.io.FileNotFoundException;

public class Tugas2 {
    public static void main(String[] args){
        try {
            readFileTugas2 readFile1 = new readFileTugas2();
            readFile1.bacaFile("ename.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!");
        }
    }
}
