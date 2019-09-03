package cn.imoc.java.ruanqunfeng.Hedera;

public class ClassloadSort1 {

    public static void main(String[] args) {
        Singleton.getInstance();
        System.out.println("Singleton value1:" + Singleton.value1);
        System.out.println("Singleton value2:" + Singleton.value2);

        Singleton2.getInstance2();
        System.out.println("Singleton2 value1:" + Singleton2.value1);
        System.out.println("Singleton2 value2:" + Singleton2.value2);
        System.out.println("Singleton2 value3:" + Singleton2.value3);
    }
}

class Singleton {
    static {
        System.out.println(Singleton.value1 + "\t" + Singleton.value2 + "\t" + Singleton.singleton);
        //System.out.println(Singleton.value1 + "\t" + Singleton.value2);
    }

    private static Singleton singleton = new Singleton();
    public static int value1 = 5;
    public static int value2 = 3;

    private Singleton() {
        value1++;
        value2++;
    }

    public static Singleton getInstance() {
        return singleton;
    }

    int count = 10;

    {
        System.out.println("count = " + count);
    }
}

class Singleton2 {
    static {
        System.out.println(Singleton2.value1 + "\t" + Singleton2.value2 + "\t" + Singleton2.singleton2);
    }

    public static int value1 = 5;
    public static int value2 = 3;
    public static int value3 = 10;
    private static Singleton2 singleton2 = new Singleton2();
    private String sign;

    int count = 20;

    {
        System.out.println("count = " + count);
    }

    private Singleton2() {
        value1++;
        value2++;
        value3++;
    }

    public static Singleton2 getInstance2() {
        return singleton2;
    }
}
