package com.whc.chapter3.ApplicationContext01.SpEL.useXML;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/7  20:16
 */
public class TestSpELxml {

    @Test
    public void test01(){
        //1. 获取Spring容器
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-SpEL.xml");

        //2.1从容器中获取student01对象
        StudentInfo student01 = ctx.getBean("student01", StudentInfo.class);
        //3.1打印student01对象
        System.out.println(student01);

        //2.2从容器中获取student01对象
        StudentInfo student02 = ctx.getBean("student02", StudentInfo.class);
        //3.2打印student01对象
        System.out.println(student02);

    }
}
