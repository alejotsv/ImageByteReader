package com.java21days;

import java.io.FileInputStream;
import java.io.IOException;

public class ImageByteReader {
    byte[] imageBytes;
    int length;

    public ImageByteReader() {
        try {
            String path = getClass().getResource("rm.png").getPath();
            FileInputStream fileInputStream = new FileInputStream(path);
            length = fileInputStream.available();
            imageBytes = new byte[length];
            fileInputStream.read(imageBytes, 0, length);
            fileInputStream.close();

        } catch (IOException e){
            System.out.println(e.getMessage());

        } catch (NullPointerException e){
            System.out.println("Path is: " + e.getMessage());
        }
    }

    public byte[] getImageBytes() {
        return imageBytes;
    }

    public int getLength() {
        return length;
    }
}

