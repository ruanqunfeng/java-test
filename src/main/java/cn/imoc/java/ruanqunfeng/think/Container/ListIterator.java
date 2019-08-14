package cn.imoc.java.ruanqunfeng.think.Container;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {

    public static void test() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        List<Integer> list1 = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }

        System.out.println("list1 = " + list1);
        System.out.println(((LinkedList<Integer>) list).getFirst());
        System.out.println(((LinkedList<Integer>) list).removeLast());
    }


    public static void main(String[] args) {
        //test();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(8);
        list1.add(9);

        list.addAll(3,list1);

        System.out.println("list = " + list);



        ((ArrayList<Integer>) list).ensureCapacity(2);
        System.out.println(list.size());

        java.util.ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "," + iterator.nextIndex() + "," + iterator.previousIndex() + ";");
        }

        System.out.println("");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous() + " ");
        }

        System.out.println(iterator);

        iterator = list.listIterator(3);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.set(100);
        }

        System.out.println(list);

    }
}
