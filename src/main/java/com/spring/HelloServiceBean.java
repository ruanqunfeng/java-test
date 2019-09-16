package com.spring;

import org.springframework.beans.factory.FactoryBean;

public class HelloServiceBean implements FactoryBean {
    public void setHelloServicel(HelloService helloServicel) {
        this.helloServicel = helloServicel;
    }

    public HelloService getHelloServicel() {
        return helloServicel;
    }

    private HelloService helloServicel;
    @Override
    public Object getObject() throws Exception {
        return helloServicel;
    }

    @Override
    public Class<?> getObjectType() {
        return helloServicel.getClass();
    }

    public void pring(){
        System.out.println("我是HelloFactoryBean.");
    }
}
