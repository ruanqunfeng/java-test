package cn.imoc.java.ruanqunfeng.think.generic;

interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create() {
        return 0;
    }
}

class Widget {
    public static class Facotry implements FactoryI<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}

public class FactoryConstraint {

    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Facotry());
    }
}
