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
        //1.设置配置文件的位置
        String path = "springChapter3/applicationcontext.xml";
        //2.创建ApplicationContext对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        //3.获取spring容器中所有的bean name
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println(beanDefinitionName);
        }
        //4.1 获取studentinfo bean 并打印出来看一下 -- 使用传统的构造方法创建bean
        StudentInfo studentInfo = ctx.getBean("student01",StudentInfo.class);
        System.out.println(studentInfo);
        //4.2 获取studentinfo bean 并打印出来看一下 -- 使用c 名称空间的方法创建bean
        StudentInfo student02 = ctx.getBean("student02", StudentInfo.class);
        System.out.println(student02);
    }
}
