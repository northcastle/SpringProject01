package com.whc.chapter4.FactoryBeanStudy;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/19  21:59
 */
public class TestMessageigestFactoryBean {

    @Test
    public void test01(){
        //1.
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-05FactoryBean.xml");
        //2.
        MessageDigestManager digestManager = ctx.getBean("digestManager", MessageDigestManager.class);
        //3.
        digestManager.digest("我是测试的文本");
    }


    @Test
    public void test02(){
        //1.
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBeanFactoryBean.class);
        //2.
        MessageDigestManager digestManager = ctx.getBean("digestManager", MessageDigestManager.class);
        //3.
        digestManager.digest("我是测试的文本");
    }
}
