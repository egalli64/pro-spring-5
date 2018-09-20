package com.apress.prospring5.ch3.annotated;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by iuliana.cosmina on 1/28/17.
 */
public class HelloWorldSpringAnnotated {

    public static void main(String... args) {
        /**
         * Using try-with-resource
         * 
         * @author manny
         * @see http://thisthread.blogspot.com/2018/09/how-to-close-spring-applicationcontext.html
         */
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                HelloWorldConfiguration.class)) {
            MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
            mr.render();
        }
    }
}
