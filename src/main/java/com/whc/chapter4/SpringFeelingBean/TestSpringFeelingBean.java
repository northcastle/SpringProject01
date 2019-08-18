package com.whc.chapter4.SpringFeelingBean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/18  09:11
 */
public class TestSpringFeelingBean {

    /**
     * 定义一个大家都能用的ApplicationContext,
     * 省的每次操作的时候都会重新写一遍
     */
    private static   ClassPathXmlApplicationContext ctx;
    static {
        ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-04springfeelingbean.xml");
    }

    @Test
    public void testBeanNameAware(){
        _01BeanNameAware beanNameTest = ctx.getBean("beanNameTest", _01BeanNameAware.class);
        beanNameTest.sayMyBeanName();
        System.out.println(beanNameTest);
        System.out.println("==============================");

        _01BeanNameAware beanNameTest02 = ctx.getBean("beanNameTest", _01BeanNameAware.class);
        beanNameTest02.sayMyBeanName();
        System.out.println(beanNameTest02);

        ctx.close();
    }


    @Test
    public void testApplicationcontextAware(){
        _02ApplicationContextAware applicationcontextawarebean =
                ctx.getBean("applicationcontextawarebean", _02ApplicationContextAware.class);

        applicationcontextawarebean.setmyselefstring();
    }
}
