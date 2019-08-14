package cn.imoc.java.ruanqunfeng.think.containers;

import net.mindview.util.Countries;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static net.mindview.util.Print.print;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        ((ArrayList<String>) c).addAll(Countries.names(6));
        c.add("ten");
        c.add("eleven");
        print(c);

        Object[] array = c.toArray();

        String[] str = c.toArray(new String[0]);

        print("Collections.max(c) = " + Collections.max(c));
        print("Collections.min(c) = " + Collections.min(c));

        Collection<String> c2 = new ArrayList<>();
        ((ArrayList<String>) c2).addAll(Countries.names(6));
        ((ArrayList<String>) c).addAll(c2);

        print(c);

        c.remove(Countries.DATA[0][0]);
        print(c);

        c.remove(Countries.DATA[1][0]);
        print(c);

        c.removeAll(c2);
        print(c);

        ((ArrayList<String>) c).addAll(c2);
        print(c);

        String val = Countries.DATA[3][0];
        print("c.containsAll(c2) = " + c.containsAll(c2));

        Collection<String> c3 = ((List<String>)c).subList(3,5);
        c2.retainAll(c3);
        print(c2);

        c2.removeAll(c3);
        print("c2.isEmpty() = " + c2.isEmpty());

        c = new ArrayList<>();

        ((ArrayList<String>) c).addAll(Countries.names(6));
        print(c);
        c.clear();
        print("clear = " + c);
        print("c.isEmpty() = " + c.isEmpty());

        BigDecimal amount = new BigDecimal("2.158627");
        amount.setScale(6, RoundingMode.UNNECESSARY);
        System.out.println("amount = " + amount);

    }
}
