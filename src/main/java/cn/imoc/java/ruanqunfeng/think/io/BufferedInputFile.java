package cn.imoc.java.ruanqunfeng.think.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static LinkedList<String> read1(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        LinkedList<String> list = new LinkedList<>();
        while ((s = in.readLine()) != null) {
            list.add(s);
        }
        in.close();
        return list;
    }

    public static void main(String[] args) throws IOException {
        /*System.out.println(
                read("C:\\Users\\alan\\Documents\\java\\ruanqunfeng" +
                        "\\src\\main\\java\\cn\\imoc\\java\\ruanqunfeng\\think\\io\\BufferedInputFile.java"));*/

        LinkedList<String> list = read1("C:\\Users\\alan\\Documents\\java\\ruanqunfeng" +
                "\\src\\main\\java\\cn\\imoc\\java\\ruanqunfeng\\think\\io\\BufferedInputFile.java");

        // 效率慢，LinkedList底层是双向链表，for循环遍历数据量大的时候特别慢
        /*for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }*/

        //System.out.println("==================================================");
        ListIterator<String> stringListIterator = list.listIterator(list.size());
        //System.out.println(stringListIterator.previous());
        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previous());
        }

    }
}
