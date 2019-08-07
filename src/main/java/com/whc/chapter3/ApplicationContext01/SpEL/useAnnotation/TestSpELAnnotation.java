package com.whc.chapter3.ApplicationContext01.SpEL.useAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author : whc
 * createTime:2019/8/7  20:55
 */
public class TestSpELAnnotation {
    @Test
    public  void testAnnotation(){
        //1.获取spring容器
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.从容器中获取student01 bean
        StudentInfo01 student01 = ctx.getBean("studentInfo01", StudentInfo01.class);
        //3.打印student01 bean
        System.out.println(student01);
    }
}
