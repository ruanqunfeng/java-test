package cn.imoc.java.ruanqunfeng.javareflect;

import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.URLDecoder;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 要获取print(int,int)方法 1.要获取一个方法就是获取类的信息，获取类的信息首先要获取类的类类型
        A a1 = new A();
        Class c = a1.getClass();
        /**
         * 2.获取方法 名称和参数列表来决定
         * getMethod获取的是public的方法
         * getDelcaredMethod自己声明的方法
         */
        try {
            //Method method = c.getMethod("print",new Class[]{int.class,int.class});
            Method m = c.getMethod("print", String.class, int.class);
            // 方法的反射操作
            //a1.print(10,20);方法的反射操作是用m对象来进行方法调用 和 a1.print调用的效果完全相同
            //方法如果没有返回值返回null，有返回值返回具体的返回值
            Object o = m.invoke(a1, new Object[]{"1", 20});
            System.out.println("===================================");
            m = c.getMethod("print",String.class,String.class);
            o = m.invoke(a1,"hello","World");
            System.out.println("===================================");
            /*Method m2 = c.getMethod("print",new Class[]{});
            o = m2.invoke(a1,new Class[]{});*/
            Method m2 = c.getDeclaredMethod("print");
            m2.setAccessible(true);
            o = m2.invoke(a1);
            System.out.println("===================================");
            Method m3 = c.getMethod("test");
            o = m3.invoke(a1);
            System.out.println((String)o);

            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("inetAddress = " + inetAddress);

            //ServerSocket
        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}

class A {
    private void print() {
        System.out.println("Hello World!!!");
    }
    public void print(int a, int b) {
        System.out.println(a + b);
    }

    public void print(String a, String b) {
        System.out.println(a.toUpperCase() + "," + b.toLowerCase());
    }

    public void print(String a, int b) {
        System.out.println(a.toUpperCase() + "," + b);
    }

    public String test() {
        return "123";
    }
}
