package cn.imoc.java.ruanqunfeng.think.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress {
    private String s;
    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("HELLO")));
        System.out.println("list = " + list);
        Collections.fill(list, new StringAddress("WORLD"));
        System.out.println("list = " + list);
    }
}
