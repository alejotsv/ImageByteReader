package com.java21days;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageByteWriter {
    ImageByteWriter(byte[] originImageBytes, int originImageLength) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("new_img.png");
        fileOutputStream.write(originImageBytes, 0, originImageLength);
        fileOutputStream.close();
    }
}
