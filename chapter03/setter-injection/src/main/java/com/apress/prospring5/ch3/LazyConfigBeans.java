package com.apress.prospring5.ch3;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 1/31/17.
 */
public class LazyConfigBeans {

    public static void main(String... args) {
        /**
         * Using try-with-resource
         * 
         * @author manny
         * @see http://thisthread.blogspot.com/2018/09/how-to-close-spring-applicationcontext.html
         */
        try (GenericXmlApplicationContext ctx = new GenericXmlApplicationContext()) {
            ctx.load("classpath:spring/app-context-lazy-xml.xml");
            ctx.refresh();
            MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
            messageRenderer.render();
        }
    }

}
