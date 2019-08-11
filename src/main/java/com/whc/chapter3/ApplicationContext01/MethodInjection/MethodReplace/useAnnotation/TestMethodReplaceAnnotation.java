package com.whc.chapter3.ApplicationContext01.MethodInjection.MethodReplace.useAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author : whc
 * createTime:2019/8/11  18:04
 */
public class TestMethodReplaceAnnotation {

    @Test
    public void teststandard(){
        //1.
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.
        StudentSay newstudent01 = ctx.getBean("newstudent01", StudentSay.class);
        //3.
        newstudent01.say();
        newstudent01.say("hello new world");
    }
}
