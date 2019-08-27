package com.whc.chapter4.Event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * author : whc
 * createTime:2019/8/27  22:23
 *
 * 创建一个事件发布类
 * 此类必须可以访问ApplicationContext ，
 * 故可以通过实现 ApplicationContextAware接口的方法实现
 */
public class MessagePublisher implements ApplicationContextAware {

    private ApplicationContext ctx;

    /**
     * 重写方法，获取 ctx 对象
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    /**
     * 写一个方法
     * 并调用publishEvent(new MessageEvent(this,msg)); 方法，把事件发布出去即可
     * @param msg
     */
    public void publish(String msg){
        ctx.publishEvent(new MessageEvent(this,msg));
    }


}
