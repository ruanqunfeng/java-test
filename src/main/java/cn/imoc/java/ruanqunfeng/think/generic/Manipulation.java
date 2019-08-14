package cn.imoc.java.ruanqunfeng.think.generic;

public class Manipulation {
    public static void main(String[] args) {
        HasF f = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(f);
        manipulator.manipulate();
    }
}
