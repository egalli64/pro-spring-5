package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String... args) {
        /**
         * Using try-with-resource
         * 
         * @author manny
         * @see http://thisthread.blogspot.com/2018/09/how-to-close-spring-applicationcontext.html
         */
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/app-context-annotation.xml");
            ctx.refresh();

            MessageProvider messageProvider = ctx.getBean("provider", MessageProvider.class);
            System.out.println(messageProvider.getMessage());
        }
    }
}
