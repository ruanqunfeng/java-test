package cn.imoc.java.ruanqunfeng.think.containers;

import java.util.*;

import static net.mindview.util.Print.print;

class Element {
    private String ident;
    public Element(String id) {
        ident = id;
    }

    @Override
    public String toString() {
        return ident;
    }

    @Override
    public int hashCode() {
        return ident.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Element && ident.equals(((Element) obj).ident);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + getClass().getSimpleName() + " " + ident);
    }
}

class Key extends Element {
    public Key(String id) {
        super(id);
    }
}

class Value extends Element {
    public Value(String id) {
        super(id);
    }
}

public class CanonicalMapping {
    public static void main(String[] args) {
        int size = 10;
        if (args.length > 0) {
            size = new Integer(args[0]);
        }
        Key[] keys = new Key[size];
        WeakHashMap<Key,Value> map = new WeakHashMap<>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if (i % 3 == 0) {
                keys[i] = k;
            }
            map.put(k,v);
        }
        for (Key key : keys) {
            System.out.print(key);
        }
        print();
        print(map);
        System.gc();
        for (Key key : keys) {
            System.out.print(key);
        }
        print();
        print(map);
    }
}
























