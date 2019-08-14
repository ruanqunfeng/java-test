package com.wiley.beginning.spring.ch2;

import org.springframework.stereotype.Component;

@Component
public class AnotherBean {
    public AnotherBean() {
        System.out.println("AnotherBean init");
    }
}
