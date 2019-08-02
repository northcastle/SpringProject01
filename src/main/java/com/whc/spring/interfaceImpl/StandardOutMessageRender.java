package com.whc.spring.interfaceImpl;

import com.whc.spring.interfacea.MessageProvider;
import com.whc.spring.interfacea.MessageRender;

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
                +StandardOutMessageRender.class.getName());
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
