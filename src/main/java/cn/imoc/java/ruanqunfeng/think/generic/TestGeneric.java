package cn.imoc.java.ruanqunfeng.think.generic;

import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.ArrayList;

class Peel {}

public class TestGeneric<T> {

    private T a;
    public TestGeneric(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return this.a;
    }

    public static void main(String[] args) {
        TestGeneric<String> testGeneric = new TestGeneric<>("1654");
        System.out.println("testGeneric.get() = " + testGeneric.get());

        TestGeneric<Integer> testGeneric1 = new TestGeneric<>(465);
        System.out.println("testGeneric.get() = " + testGeneric1.get());

        //TestGeneric<Peel>[] ps = new TestGeneric<Peel>[10]; Java不支持泛型类的数组

        List<? extends Number> foo1 = new ArrayList<>();
        List<? extends Number> foo2 = new ArrayList<>();
        List<? extends Number> foo3 = new ArrayList<>();

        List<String> list = new ArrayList<>();

        List<? super Integer> foo4 = new ArrayList<Integer>();
        List<? super Integer> foo5 = new ArrayList<Number>();
        List<? super Integer> foo6 = new ArrayList<Object>();
    }
}
