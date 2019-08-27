package com.whc.chapter4.Event;

import org.springframework.context.ApplicationEvent;

/**
 * author : whc
 * createTime:2019/8/27  21:50
 * 这是一个事件类
 */
public class MessageEvent extends ApplicationEvent {

    private String msg;

    /**
     * 这个构造方法，必须要重写一下才可以！否则会提示报错
     * @param source : 这个source 是必须要进行重写的
     * @param msg
     */
    public MessageEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
