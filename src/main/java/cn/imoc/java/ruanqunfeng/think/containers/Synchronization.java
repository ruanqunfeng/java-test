package cn.imoc.java.ruanqunfeng.think.containers;

import java.util.*;

public class Synchronization {
    public static void main(String[] args) {
        Collection<String> c = Collections.synchronizedCollection(new ArrayList<>());
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        Set<String> s = Collections.synchronizedSet(new HashSet<>());
        Set<String> ss = Collections.synchronizedSortedSet(new TreeSet<>());
        Map<String,String> m = Collections.synchronizedMap(new HashMap<>());
        Map<String,String> mm = Collections.synchronizedSortedMap(new TreeMap<>());
    }
}
