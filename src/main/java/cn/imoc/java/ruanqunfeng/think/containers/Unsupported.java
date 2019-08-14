package cn.imoc.java.ruanqunfeng.think.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Unsupported {
    static void test(String msg,List<String> list) {
        System.out.println("=============== msg ===============");

        Collection<String> c = list;
        Collection<String> subList = list.subList(1,2);
        Collection<String> c2 = new ArrayList<>(subList);
        try { c.clear(); } catch (Exception e) {
            System.out.println("clear(): " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D".split(" "));
        test("Modifiable Copy",new ArrayList<>(list));
    }
}
