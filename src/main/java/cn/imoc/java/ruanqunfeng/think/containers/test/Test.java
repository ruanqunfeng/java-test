package cn.imoc.java.ruanqunfeng.think.containers.test;

public abstract class Test<C> {
    String name;
    public Test(String name) {
        this.name = name;
    }
    abstract int test(C container, TestParam tp);
}
