package com.java21days;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageByteReader {

    public ImageByteReader() throws IOException {
        String path = getClass().getResource("pagedataicon.gif").getPath();
        System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        int newByte = 0;
        while(newByte != -1){
            newByte = fileInputStream.read();
            if(newByte == -1){
                System.out.println("Done");
                break;
            }
            System.out.println(newByte);
        }
    }
}

