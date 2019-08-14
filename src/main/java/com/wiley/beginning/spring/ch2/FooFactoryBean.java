package com.wiley.beginning.spring.ch2;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


public class FooFactoryBean implements FactoryBean<Foo> {
    @Override
    public Foo getObject() throws Exception {
        Foo foo = new Foo();
        foo.setName("FooFactoryBean");
        return foo;
    }

    @Override
    public Class<?> getObjectType() {
        return Foo.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
