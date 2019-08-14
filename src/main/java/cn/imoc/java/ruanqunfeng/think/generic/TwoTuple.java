package cn.imoc.java.ruanqunfeng.think.generic;

public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A a,B b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }

    public static void main(String[] args) {
        TwoTuple<Integer,String> twoTuple = new TwoTuple<>(1,"...");
        System.out.println("twoTuple = " + twoTuple);
    }

}
