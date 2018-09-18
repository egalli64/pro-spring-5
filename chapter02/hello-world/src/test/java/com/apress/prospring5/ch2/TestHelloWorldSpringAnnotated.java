package com.apress.prospring5.ch2;

import com.apress.prospring5.ch2.annotated.HelloWorldConfiguration;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by iuliana.cosmina on 1/28/17.
 */
public class TestHelloWorldSpringAnnotated {

    @Test
    public void testHello() {
        /**
         * Using try-with-resource
         * 
         * @author manny
         * @see http://thisthread.blogspot.com/2018/09/how-to-close-spring-applicationcontext.html
         */
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class)) {
            MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
            assertNotNull(mr);
        }
    }
}
