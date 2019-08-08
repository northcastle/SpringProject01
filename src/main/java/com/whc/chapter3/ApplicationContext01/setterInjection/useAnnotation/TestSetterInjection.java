package com.whc.chapter3.ApplicationContext01.setterInjection.useAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author : whc
 * createTime:2019/8/8  21:16
 */
public class TestSetterInjection {
    @Test
    public void testSetterInjection(){
        //1.
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.
        StudentInfo student01 = ctx.getBean("student01", StudentInfo.class);
        //3.
        System.out.println(student01);
    }
}
