package com.whc.chapter3.ApplicationContext01.MethodInjection.MethodReplace.useXML;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/11  17:51
 */
public class TestMethodReplace {
    @Test
    public void teststandard(){
        //1.
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-MethodReplace.xml");
        //2.
        StudentSay student01 = ctx.getBean("student01", StudentSay.class);
        //3.
        student01.say();
        student01.say("Hello world!");
    }

    @Test
    public void testreplacer(){
        //1.
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-MethodReplace.xml");
        //2.
        StudentSay student02 = ctx.getBean("student02", StudentSay.class);
        //3.
        student02.say();
        student02.say("Hello world!");
    }
}
