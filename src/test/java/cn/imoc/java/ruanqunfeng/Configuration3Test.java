package cn.imoc.java.ruanqunfeng;

import com.wiley.beginning.spring.ch2.AnotherBean;
import com.wiley.beginning.spring.ch2.Configuration3;
import com.wiley.beginning.spring.ch2.ThisBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Configuration3Test {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration3.class);
        ThisBean thisBean = context.getBean("thisBean",ThisBean.class);
        System.out.println("thisBean = " + thisBean);
        AnotherBean anotherBean = context.getBean("anotherBean",AnotherBean.class);
        System.out.println("anotherBean = " + anotherBean);
    }
}
