package cn.imoc.java.ruanqunfeng.think.io;

import java.io.*;

public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        /*BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("C:\\Users\\alan\\Documents\\java\\ruanqunfeng" +
                "\\src\\main\\java\\cn\\imoc\\java\\ruanqunfeng\\think\\io\\BasicFileOutput.java")));*/

        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\alan\\Documents\\java\\ruanqunfeng" +
                "\\src\\main\\java\\cn\\imoc\\java\\ruanqunfeng\\think\\io\\BasicFileOutput.java"));
        //PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        FileWriter out = new FileWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.write(lineCount++ + ": " + s + "\n");
        }
        out.close();
        in.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
