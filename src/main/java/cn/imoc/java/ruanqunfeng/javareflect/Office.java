package cn.imoc.java.ruanqunfeng.javareflect;

public class Office {
    public static void main(String[] args) {
        // new 创建对象是静态加载类，在编译时刻就需要加载所有的可能使用到的类。
        if ("Word".equals(args[0])) {
            Word w = new Word();
            w.start();
        }
        if ("Execl".equals(args[0])) {
            Execl e = new Execl();
            e.start();
        }
    }
}
