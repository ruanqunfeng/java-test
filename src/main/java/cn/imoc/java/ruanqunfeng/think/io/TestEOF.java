package cn.imoc.java.ruanqunfeng.think.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEOF {
    public static void main(String[] args) throws IOException {
        /*DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream("C:\\Users\\alan\\Documents\\java" +
                        "\\ruanqunfeng\\src\\main\\java\\cn\\imoc\\java\\ruanqunfeng\\think\\io\\TestEOF.java")));
        while (in.available() != 0) {
            System.out.println((char)in.readByte());
        }*/

        List<String> list = new ArrayList<>(3);
        Iterator var6 = list.iterator();

        while(var6.hasNext()) {
            System.out.println("123");
            var6.next();
        }
    }
}
