package com.whc.chapter3.ApplicationContext01.useParent.useAnnotation;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestParentAnnotation {

    @Test
    public void test01(){
        //1.
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.
        Singer baba = ctx.getBean("baba", Singer.class);
        Singer son2 = ctx.getBean("son2", Singer.class);
        //3.
        System.out.println(baba);
        System.out.println(son2);
    }
}
