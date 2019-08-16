package com.whc.chapter4.LifeCycle.InitialBean._04Annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author : whc
 * createTime:2019/8/16  21:20
 */
public class TestBeanAnnotation {

    @Test
    public void testOnlySout(){
        //1.
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
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
