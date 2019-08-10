package com.whc.chapter3.ApplicationContext01.collectionInjection.useAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * author : whc
 * createTime:2019/8/10  15:23
 */
public class TestCollectionInjection {
    @Test
    public  void testcollectoininject(){
        //1.
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        //2.
        CollectionInjection collectionbean02 = ctx.getBean("collectionbean02", CollectionInjection.class);
        //3.
        System.out.println(collectionbean02);

    }
}
