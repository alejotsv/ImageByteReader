package com.java21days;

public class Main {
    public static void main(String[] args) {
        ImageByteReader imageReader = new ImageByteReader();
        int firstLength = imageReader.getLength();
        byte[] firstImage = new byte[firstLength];
        firstImage = imageReader.getImageBytes();

    }
}
