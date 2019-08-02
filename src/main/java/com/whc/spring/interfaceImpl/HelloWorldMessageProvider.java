package com.whc.spring.interfaceImpl;

import com.whc.spring.interfacea.MessageProvider;

/**
 * author : whc
 * createTime:2019/8/2  22:19
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
