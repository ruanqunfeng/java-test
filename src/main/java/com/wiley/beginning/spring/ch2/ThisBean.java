package com.wiley.beginning.spring.ch2;

import org.springframework.stereotype.Component;

@Component
public class ThisBean {
    public ThisBean() {
        System.out.println("ThisBean init");
    }
}
