package cn.imoc.java.ruanqunfeng.think.Container;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import net.mindview.util.*;

public class TestSet {

    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            set.add(random.nextInt());
        }

        //System.out.println("set.size() = " + set.size());
        test();
    }

    public static void test() {
        Set<String> strings = new TreeSet<String>(
                new TextFile("C:\\Users\\alan\\Documents\\java\\ruanqunfeng\\src\\main\\resources\\file.txt","\\w+")
        );

        System.out.println("strings = " + strings);
    }
}
