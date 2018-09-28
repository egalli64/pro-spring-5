package com.apress.prospring5.ch3.annotated;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.stereotype.Service;

//import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("Missing messageProvider for: " + this.getClass().getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    // @Override
    // @Autowired // Spring only
    // public void setMessageProvider(MessageProvider provider) {
    // this.messageProvider = provider;
    // }

    // @Override
    // @Inject // JSR standard
    // public void setMessageProvider(MessageProvider provider) {
    // this.messageProvider = provider;
    // }

    // @Override
    // @Autowired
    // @Qualifier("pro2") // Spring only resource by id
    // public void setMessageProvider(MessageProvider provider) {
    // this.messageProvider = provider;
    // }
    
    // @Override
    // @Resource(name = "pro3") // JSR standard
    // public void setMessageProvider(MessageProvider provider) {
    // this.messageProvider = provider;
    // }

    @Override
    @Inject
    @Named("pro4") // JSR standard resource by id
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
