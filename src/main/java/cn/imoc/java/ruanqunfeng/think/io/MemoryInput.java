package cn.imoc.java.ruanqunfeng.think.io;

import java.io.*;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader stringReader = new StringReader(BufferedInputFile.read("C:\\Users\\alan\\Documents\\java\\ruanqunfeng" +
                "\\src\\main\\java\\cn\\imoc\\java\\ruanqunfeng\\think\\io\\MemoryInput.java"));
        int c;
        while ((c = stringReader.read()) != -1) {
            System.out.println((char)c);
        }
    }
}
