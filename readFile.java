package com.mycompany.tugaspbo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class readFile {
    
    public void bacaFile(String fileName) throws FileNotFoundException{
        File myFile = new File(fileName);
        myFile.exists();
        
        Scanner readFile = new Scanner(myFile);
        throw new FileNotFoundException("File tidak ditemukan!");
    }
}
