package cn.imoc.java.ruanqunfeng.javareflect;

public class ClassDemo2 {
    public static void main(String[] args) {
        // int的类类型
        Class c1 = int.class;
        // String类的类类型  String类字节码（自己发明的）
        Class c2 = String.class;
        //
        Class c3 = double.class;
        Class c4 = Double.class;
        Class c5 = void.class;
//      Class c6 = package.class; error
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());
        System.out.println(c4.getSimpleName());// 不含包明的名称
        System.out.println(c5.getName());
    }






















}
