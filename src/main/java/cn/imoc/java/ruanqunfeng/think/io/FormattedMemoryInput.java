package cn.imoc.java.ruanqunfeng.think.io;
import java.io.*;
public class FormattedMemoryInput {
    public static void main(String[] args) {
        try {
            DataInputStream in = new DataInputStream((new ByteArrayInputStream(BufferedInputFile.read("C:\\Users\\alan\\Documents\\java" +
                    "\\ruanqunfeng\\src\\main\\java\\cn\\imoc\\java\\ruanqunfeng\\think\\io\\FormattedMemoryInput.java").getBytes())));
            while (true) {
                System.out.println((char) in.readByte());
            }
        } catch (EOFException e) {
            System.err.println("End of stream");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
