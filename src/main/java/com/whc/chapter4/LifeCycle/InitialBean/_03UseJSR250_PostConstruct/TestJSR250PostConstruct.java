package com.whc.chapter4.LifeCycle.InitialBean._03UseJSR250_PostConstruct;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/16  21:20
 */
public class TestJSR250PostConstruct {

    @Test
    public void testOnlySout(){
        //1.
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-03PostConstruct.xml");
        //2.
        Singer beanC01 =  ctx.getBean("beanC01",Singer.class);
        System.out.println(beanC01);
        System.out.println("=============beanC01 end==========================");

        Singer beanC02 = ctx.getBean("beanC02", Singer.class);
        System.out.println(beanC02);
        System.out.println("============beanC02 end ===========================");

        Singer beanSetter = ctx.getBean("beanSetter", Singer.class);
        System.out.println(beanSetter);
        System.out.println("============beanSetter end =========================");
        //3.
    }
}
