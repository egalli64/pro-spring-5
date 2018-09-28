package com.apress.prospring5.ch3.annotated;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}

@Component("pro2")
class MessageProvider2 implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello from Message Provider 2!";
    }
}

@Component("pro3")
class MessageProvider3 implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello from Message Provider 3!";
    }
}

@Component("pro4")
class MessageProvider4 implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello from Message Provider 4!";
    }
}
