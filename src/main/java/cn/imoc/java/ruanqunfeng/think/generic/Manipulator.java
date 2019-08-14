package cn.imoc.java.ruanqunfeng.think.generic;

public class Manipulator<T extends HasF> {
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f(); // 没有使用Manipulator<T extends HasF>前会报错
    }
}
