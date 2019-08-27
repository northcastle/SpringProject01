package com.whc.chapter4.Event;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/27  22:31
 */
public class TestEventPublishListener {

    @Test
    public void test01(){
        //1.spring容器
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-07event.xml");
        //2.获取事件发布实例
        MessagePublisher publisher = ctx.getBean("publisher",MessagePublisher.class);
        //3.发布事件
        publisher.publish("这是第一条信息");
        publisher.publish("这是第二条信息");

    }
}
