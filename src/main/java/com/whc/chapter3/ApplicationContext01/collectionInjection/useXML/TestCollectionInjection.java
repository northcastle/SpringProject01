package com.whc.chapter3.ApplicationContext01.collectionInjection.useXML;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/10  15:23
 */
public class TestCollectionInjection {
    @Test
    public  void testcollectoininject(){
        //1.
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-CollectionInjection.xml");
        //2.
        CollectionInjection collectionbean01 = ctx.getBean("collectionbean01", CollectionInjection.class);
        //3.
        System.out.println(collectionbean01);
    }
}
