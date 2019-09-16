package cn.imoc.java.ruanqunfeng;

import cn.imoc.java.ruanqunfeng.bean.Bean;
import com.spring.HelloService;
import com.spring.HelloServiceBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void test() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        /*Bean bean = context.getBean("bean",Bean.class);
        System.out.println("bean = " + bean);
        Bean bean1 = context.getBean("bean",Bean.class);
        System.out.println("bean1 = " + bean1);*/


        HelloService helloService = (HelloService) context.getBean("helloService");
        //HelloService helloFactoryBean = (HelloService) context.getBean("helloFactoryBean");
        HelloServiceBean helloFactoryBean1 = (HelloServiceBean) context.getBean("&helloFactoryBean");

        helloService.hello();
        //helloFactoryBean.hello();
        helloFactoryBean1.pring();


        context.close();
    }
}
