package com.java21days;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ImageByteReader imageReader = new ImageByteReader();
        int firstLength = imageReader.getLength();
        byte[] firstImage = imageReader.getImageBytes();
        new ImageByteWriter(firstImage, firstLength);
    }
}
