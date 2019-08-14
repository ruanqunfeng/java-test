package cn.imoc.java.ruanqunfeng.think.generic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericMethods {
    public <T, A> void f(T x, Integer a) {
        System.out.println(x.getClass().getName());
        System.out.println(a.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods g = new GenericMethods();
        g.f("", 1);
        g.f(12, 2);

        Map<Integer,List<? extends String>> map = new HashMap<>();
    }
}
