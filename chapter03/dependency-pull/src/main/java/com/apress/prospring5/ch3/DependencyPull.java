package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyPull {
    public static void main(String... args) {
        /**
         * Using try-with-resource
         * 
         * @author manny
         * @see http://thisthread.blogspot.com/2018/09/how-to-close-spring-applicationcontext.html
         */
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml")) {
            MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
            mr.render();
        }
    }
}
