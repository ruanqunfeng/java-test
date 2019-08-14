package cn.imoc.java.ruanqunfeng;

import com.wiley.beginning.spring.ch2.Configuration1;
import com.wiley.beginning.spring.ch2.Configuration2;
import com.wiley.beginning.spring.ch2.Foo;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FooTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration2.class,Configuration1.class);
        Foo foo = context.getBean(Foo.class);
        System.out.println("foo = " + foo.getName());
    }
}
