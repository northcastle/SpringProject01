package com.whc.chapter3.ApplicationContext01.beanName.useAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.stream.events.EntityReference;
import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * author : whc
 * createTime:2019/8/13  21:08
 */
public class TestBeanNames {
    @Test
    public void test01(){
        //1.get spring IoC container
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.get all bean names
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) { // iter 快捷方式
//            System.out.println(beanDefinitionName);
//        }
        //3. get all beans by type
        Map<String, StudentInfo> studentsmap = ctx.getBeansOfType(StudentInfo.class);
        Set<Map.Entry<String, StudentInfo>> studententries = studentsmap.entrySet();
        for (Map.Entry<String, StudentInfo> studententry : studententries) {
            System.out.println(studententry.getKey()+" --> "+studententry.getValue());
        }
        System.out.println("***********下面打印的是别名**************");
        for (Map.Entry<String, StudentInfo> studententry : studententries) {
            System.out.println(studententry.getKey()+" ==> "+ Arrays.toString(ctx.getAliases(studententry.getKey())) );
        }

    }

    @Test
    public  void test02(){
        //1.get spring IoC container
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.get all bean names
        //3. get all beans by type
        Map<String, StudentInfo02> beansOfTypemap = ctx.getBeansOfType(StudentInfo02.class);
        Set<Map.Entry<String, StudentInfo02>> entries = beansOfTypemap.entrySet();
        for (Map.Entry<String, StudentInfo02> entry : entries) {
            String key = entry.getKey();
            System.out.println(key +" ===> "+ Arrays.toString(ctx.getAliases(key)) );
        }

    }
}
