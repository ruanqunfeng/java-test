package cn.imoc.java.ruanqunfeng.javareflect;

class Foo{
    void print() {
        System.out.println("true = " + true);
    }
}

public class ClassDemo1 {
    public static void main(String[] args) throws Exception {
        // Foo的实例对象如何表示
        Foo foo1 = new Foo();
        // Foo这个类 也是一个实例对象，Class类的实例对象，如何表示呢
        // 任何一个类都是Class的实例对象，这个实例对象有三种表示方式

        // 第一种表示方式---》实际在告诉我们任何一个类都有一个隐含的静态成员变量
        Class c1 = Foo.class;

        // 第二种表示方式 已经知道该类的对象通过getClass方法
        Class c2 = foo1.getClass();

        /* 官网c1,c2表示了Foo类的类类型（class type）
        *  万事万物皆对象，是Class类的实例对象
        *  这个对象我们称为该类的类类型
        *
        */

        // 不过c1 or c2都代表了Foo的类的类类型，一个类只可能是Class类的一个实例对象
        System.out.println(c1 == c2);

        // 第三种表示方式
        Class c3 = null;
        c3 = Class.forName("cn.imoc.java.ruanqunfeng.javareflect.Foo");

        System.out.println(c3 == c2);

        // 我们完全可以通过类的类类型创建该类的对象实例----》通过 c1 or c2 or c3创建Foo的实例对象
        Foo foo = (Foo)c1.newInstance();
        foo.print();
    }
}
