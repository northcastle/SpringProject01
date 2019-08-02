package com.whc.springAnnotation.interfacea;

/**
 * author : whc
 * createTime:2019/8/2  22:17
 */
public interface MessageRender {
    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProbider();

}
