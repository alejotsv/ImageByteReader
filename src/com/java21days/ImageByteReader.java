package com.java21days;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageByteReader {

    public ImageByteReader() {
        try {
            String path = getClass().getResource("rm.png").getPath();
            FileInputStream fileInputStream = new FileInputStream(path);
            int newByte = 0;
            while(newByte != -1){
                newByte = fileInputStream.read();
                if(newByte == -1){
                    System.out.println("Done");
                    fileInputStream.close();
                    break;
                }
                System.out.println(newByte);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Path is: " + e.getMessage());
        }
    }
}

