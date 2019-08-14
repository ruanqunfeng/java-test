package com.wiley.beginning.spring.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Configuration1 {
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        foo.setName("ALAN1");
        return foo;
    }
}
