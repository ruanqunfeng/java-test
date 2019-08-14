package com.wiley.beginning.spring.ch2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.wiley.beginning.spring.ch2")
@Lazy
public class Configuration3 {
    @Bean(name = "thisBean")
    //@DependsOn("AnotherBean")
    public ThisBean getThisBean() {
        return new ThisBean();
    }

    @Bean(name = {"anotherBean1","anotherBean2"})
    //@DependsOn("thisBean")
    public AnotherBean getAnotherBean() {
        return new AnotherBean();
    }

}
