package cn.imoc.java.ruanqunfeng;

import com.wiley.beginning.spring.ch2.Foo;
import com.wiley.beginning.spring.ch2.FooFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FooFactoryBeanTest {

    @Test
    public void test() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        /*Foo bean = (Foo)context.getBean("factoryBean");
        System.out.println("bean = " + bean);
        FooFactoryBean bean1 = (FooFactoryBean)context.getBean("&factoryBean");
        System.out.println("bean1 = " + bean1);*/
        
        Foo bean = context.getBean("factoryBean",Foo.class);
        System.out.println("bean = " + bean);

        FooFactoryBean bean1 = context.getBean("&factoryBean",FooFactoryBean.class);
        System.out.println("bean1 = " + bean1);
    }
}
