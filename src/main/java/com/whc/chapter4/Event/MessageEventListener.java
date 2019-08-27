package com.whc.chapter4.Event;

import org.springframework.context.ApplicationListener;

/**
 * author : whc
 * createTime:2019/8/27  21:56
 *
 * 事件的监听器类 ，需要实现 ApplicationListener这个接口
 * 并且把MessageEvent这个事件类作为反省参数传入进来
 * 需要重写事件监听的方法才可以
 */
public class MessageEventListener implements ApplicationListener<MessageEvent> {


    /**
     * 这个就是事件监听的方法
     *   可以直接调用 对象的getMessage() 方法打印一下 接收到的信息
     * 当触发一个事件时，由Spring 进行调用此方法
     * @param messageEvent
     */
    @Override
    public void onApplicationEvent(MessageEvent messageEvent) {
        System.out.println("Received Message ： "+messageEvent.getMsg());
    }
}
