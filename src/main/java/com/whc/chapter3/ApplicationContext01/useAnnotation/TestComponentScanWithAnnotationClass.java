package com.whc.chapter3.ApplicationContext01.useAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author : whc
 * createTime:2019/8/6  21:30
 */
public class TestComponentScanWithAnnotationClass {

    @Test
    public void test(){
        //1. 获取spring容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBean.class);
        //2. 从容器中获取所有的bean name
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println(beanDefinitionName);
        }
        //3.1 从容器中获取student info bean
        StudentInfo student01 = ctx.getBean("studentinfo", StudentInfo.class);
        System.out.println(student01);
        //3.2 从容器中获取student info bean
        StudentInfo student02 = ctx.getBean("studentinfo02", StudentInfo.class);
        System.out.println(student02);

        //4.1 直接获取一个 classinfo 的对象看一下，
//        ClassInfo classinfo01 = ctx.getBean("classinfo", ClassInfo.class);
//        System.out.println(classinfo01);
//        //4.1 直接获取一个 classinfo02 的对象看一下，
//        ClassInfo classinfo02 = ctx.getBean("classinfo02", ClassInfo.class);
//        System.out.println(classinfo02);

    }
}
