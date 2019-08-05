package com.whc.chapter3.ApplicationContext01.useXML;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/5  22:50
 */
public class TestComponentScanWithXML {

    @Test
    public void testxml(){
        String path = "springChapter3/applicationcontext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println(beanDefinitionName);
        }
    }
}
