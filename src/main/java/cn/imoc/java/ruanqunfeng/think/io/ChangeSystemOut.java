package cn.imoc.java.ruanqunfeng.think.io;

import java.io.*;

public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        out.println("Hello World!!!");
        out.close();
    }
}
