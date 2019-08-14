package cn.imoc.java.ruanqunfeng.think.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Fruit {

}

class Apple extends Fruit {

}

class Plate<T>{
    private T item;
    public Plate(T t){item=t;}
    public void set(T t){item=t;}
    public T get(){return item;}
}

class Human{
}
class Father extends Human{
}
class Son extends Father{
}
class LeiFeng extends Father {
}

public class test {
    public static List<? extends Father> test1() {
        return new ArrayList<Son>() {{
            add(new Son());
            add(new Son());
            add(new Son());
        }};
    }
    public static void main(String[] args) {
        //List<Fruit> list = new ArrayList<Apple>();

        //List<? extends Fruit> list = new ArrayList<Apple>();

        //Plate<Fruit> p=new Plate<Apple>(new Apple());

        //List<? extends Father> list = new LinkedList<>();
        //list.add(new Son());

        List<? extends Father> list1 = test1();
        //list.add(new Son());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("list.get(i).toString() = " + list1.get(i).toString());
        }

        //super只能添加Father和Father的子类，不能添加Father的父类,读取出来的东西只能存放在Object类里
        List<? super Father> list = new ArrayList<>();
        list.add(new Father());
        //list.add(new Human());//compile error
        list.add(new Son());
        //Father person1 = list.get(0);//compile error
        //Son son = list.get(0);//compile error
        Object object1 = list.get(0);
    }
}
