package cn.imoc.java.ruanqunfeng.think.generic;

import java.util.ArrayList;
import java.util.List;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.third = c;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }

    public static void main(String[] args) {
        ThreeTuple<Integer,String,Float> threeTuple = new ThreeTuple<>(1,"sdgf",453.1f);
        System.out.println("threeTuple.toString() = " + threeTuple.toString());

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            test(stringList);
        }
        System.out.println("===================================");
        for (String s : stringList) {
            System.out.println("s = " + s);
        }

    }
    public static void test(List<String> list) {
        String s = String.valueOf(Math.random());
        list.add(s);
        System.out.println("s = " + s);
    }
}
