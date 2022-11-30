package com.java21days;

import java.io.FileInputStream;
import java.io.IOException;

public class ImageByteReader {

    public ImageByteReader() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("pagedataicon.gif");
        System.out.println(fileInputStream.read());

    }
}

