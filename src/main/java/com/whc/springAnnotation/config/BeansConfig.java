package com.whc.springAnnotation.config;

import com.whc.spring.interfaceImpl.HelloWorldMessageProvider;
import com.whc.spring.interfaceImpl.StandardOutMessageRender;
import com.whc.spring.interfacea.MessageProvider;
import com.whc.spring.interfacea.MessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author : whc
 * createTime:2019/8/2  23:25
 */

@Configuration
public class BeansConfig {
    @Bean("provider")
    public MessageProvider createProvider(){
        return new HelloWorldMessageProvider();
    }

    @Bean("render")
    public MessageRender createRender(){
        StandardOutMessageRender standardOutMessageRender = new StandardOutMessageRender();
        standardOutMessageRender.setMessageProvider(this.createProvider());
        return standardOutMessageRender;
    }
}
