package com.whc.chapter4.LifeCycle.InitialBean._01RunMethod;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.Source;

public class TestRunMethod {

    @Test
    public void test01(){
        //1.
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-01RunMethod.xml");
        //2.
//        SimpleBean bean01 = ctx.getBean("bean01", SimpleBean.class);
//        SimpleBean bean02 = ctx.getBean("bean02", SimpleBean.class);
//        SimpleBean bean03 = ctx.getBean("bean03", SimpleBean.class);
        //3.
//        System.out.println(bean01);
//        System.out.println(bean02);
//        System.out.println(bean03);

        this.getBean("bean01",SimpleBean.class,ctx);
        this.getBean("bean02",SimpleBean.class,ctx);
        this.getBean("bean03",SimpleBean.class,ctx);
    }

    /**
     * 用来获取bean,
     * @param beanname
     * @param ctx
     */
    public void getBean(String beanname,Class clazz,ApplicationContext ctx){
        try {
            SimpleBean bean = (SimpleBean) ctx.getBean(beanname, clazz);
            System.out.println(bean);
            System.out.println("*************************");
        }catch (BeanCreationException ex){
            System.out.println("error message : "+ex.getMessage());
        }
    }
}
