package cn.imoc.java.ruanqunfeng.think.containers;

import java.util.*;

public class FailFast {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        Iterator<String> it = c.iterator();
        ((ArrayList<String>) c).add("one");
        try {
            String s = it.next();
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }
    }
}
