package cn.imoc.java.ruanqunfeng.think.enumerated;

import static net.mindview.util.Print.*;

enum Shrubbery {
    GROUND(10),
    CRAWLING(12),
    HANGING(17);
    private final int value;
    Shrubbery(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            print(s + " ordinal: " + s.ordinal());
            printnb(s.compareTo(Shrubbery.CRAWLING) + " ");
            printnb(s.equals(Shrubbery.CRAWLING) + " ");
            print(s == Shrubbery.CRAWLING);
            print(s.getDeclaringClass());
            print(s.name());
            print("==========================");
        }
        // Produce an enum value from a string name:
        for (String s : "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            print(shrub);
        }
    }
}
