package cn.imoc.java.ruanqunfeng.think.generic;

class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter<T> {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}

public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5,5,6};
        Double[] doubles = {1.2,1.2,1.4,2.4};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        ints2 = MethodParameter.f(ints);
        doubles2 = MethodParameter.f(doubles);

        System.out.println("ints2 = " + ints2);
        System.out.println("doubles2 = " + doubles2);
    }
}
