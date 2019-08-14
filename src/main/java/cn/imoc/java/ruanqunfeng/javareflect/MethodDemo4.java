package cn.imoc.java.ruanqunfeng.javareflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodDemo4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        // list1.add(20);错误的
        Class c1 = list.getClass();
        Class c2 = list1.getClass();
        System.out.println(c1 == c2);
        //反射的操作都是编译之后的操作（运行时）
        /**
         * c1 == c2结果返回true说明编译之后集合的泛型是去泛型化的
         * Java中集合的泛型是泛指错误输入的，只在编译阶段有效，绕过编译就无效了
         * 验证：我们可以通过方法的反射来操作，绕过编译
         */
        try {
            Method m = c1.getMethod("add",Object.class);
            // 绕过编译去操作就绕过了泛型
            m.invoke(list1,100);
            System.out.println(list1);
            //报错，类型转换错误 java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
            /*for (String s : list1) {
                System.out.println("s = " + s);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
