package com.whc.chapter3.ApplicationContext01.useParent.useXML;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestParent {

    @Test
    public void test01(){
        //1.
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-useparent.xml");
        //2.
        Singer baba = ctx.getBean("baba", Singer.class);
        Singer son1 = ctx.getBean("son1", Singer.class);
        //3.
        System.out.println(baba);
        System.out.println(son1);
    }
}
