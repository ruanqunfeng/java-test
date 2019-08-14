package cn.imoc.java.ruanqunfeng.bean;

import java.util.List;
import java.util.Map;

public class Bean {

    public void init() {
        System.out.println("Bean init");
    }

    public void destroy() {
        System.out.println("Bean destroy");
    }

    private long aLong;

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
/*
    public Bean(long aLong, AnotherBean anotherBean) {
        this.aLong = aLong;
        this.anotherBean = anotherBean;
    }*/

    private AnotherBean anotherBean;

    private List<AnotherBean> anotherBeanList;
    private List<String> list;

    public List<AnotherBean> getAnotherBeanList() {
        return anotherBeanList;
    }

    public void setAnotherBeanList(List<AnotherBean> anotherBeanList) {
        this.anotherBeanList = anotherBeanList;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, AnotherBean> getBeanHashMap() {
        return beanHashMap;
    }

    public void setBeanHashMap(Map<String, AnotherBean> beanHashMap) {
        this.beanHashMap = beanHashMap;
    }

    private Map<String,AnotherBean> beanHashMap;

    @Override
    public String toString() {
        return "Bean{" +
                "aLong=" + aLong +
                ", anotherBean=" + anotherBean +
                ", anotherBeanList=" + anotherBeanList +
                ", list=" + list +
                ", beanHashMap=" + beanHashMap +
                '}';
    }
}
