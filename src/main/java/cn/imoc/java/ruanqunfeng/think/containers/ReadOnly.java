package cn.imoc.java.ruanqunfeng.think.containers;

import java.util.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

public class ReadOnly {
    static Collection<String> data = new ArrayList<>(Countries.names(6));

    public static void main(String[] args) {
        Collection<String> c = Collections.unmodifiableCollection(new ArrayList<>(data));
        print(c); // Reading is OK
        //c.add("one"); // Can't change it Exception in thread "main" java.lang.UnsupportedOperationException

        List<String> a = Collections.unmodifiableList(new ArrayList<>(data));
        ListIterator<String> lit = a.listIterator();
        print(lit.next());
        //lit.add("one"); error java.lang.UnsupportedOperationException

        Set<String> s = Collections.unmodifiableSet(new HashSet<>(data));
        print(s);
        // s.add("one"); error
    }
}
