package cn.imoc.java.ruanqunfeng.think.containers;

import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        a.add(1,"x");
        a.add("x");
        List<String> lists = Countries.names(25);
        a.addAll(lists);
        print(a);
        a.addAll(3,lists);
        print(a);
        b = a.contains("1");
        print(b);
        b = a.contains(lists);
        print(b);
        s = a.get(1);
        i = a.indexOf("1");
        b = a.isEmpty();
        it = a.iterator();
        lit = a.listIterator();
        System.out.println("===================================================");
        while (lit.hasNext()) {
            System.out.println(lit.next() + ", " + lit.previousIndex() + ", " + lit.nextIndex());
        }
        lit = a.listIterator(3);
        System.out.println("===================================================");
        while (lit.hasNext()) {
            System.out.println(lit.next() + ", " + lit.previousIndex() + ", " + lit.nextIndex());
        }
        System.out.println("===================================================");
        i = a.lastIndexOf("1");
        a.remove(1);
        a.remove("3");
        a.set(1,"y");
        a.retainAll(Countries.names(25));
        a.removeAll(Countries.names(25));
        i = a.size();
        a.clear();
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("20");
        basicTest(a);
        /*a.add("20");
        a.add("10");
        a.add("x");
        boolean b = a.contains("x");
        List<String> lists = new ArrayList<String>() {{
           add("1");
           add("2");
        }};
        for (String list : lists) {
            System.out.println("list = " + list);
        }
        System.out.println("b = " + b);*/
    }
}
