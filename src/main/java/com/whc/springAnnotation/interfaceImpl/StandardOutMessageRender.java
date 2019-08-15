package com.whc.springAnnotation.interfaceImpl;

import com.whc.springAnnotation.interfacea.MessageProvider;
import com.whc.springAnnotation.interfacea.MessageRender;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

/**
 * author : whc
 * createTime:2019/8/2  22:22
 */
public class StandardOutMessageRender implements MessageRender {

    private MessageProvider provider;

    @Override
    public void render() {
        if (provider == null) {
            throw new RuntimeException("You must set the property provider of class:"
                + StandardOutMessageRender.class.getName());
        }else {
            System.out.println(provider.getMessage());
        }
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public MessageProvider getMessageProbider() {
        return this.provider;
    }
}
