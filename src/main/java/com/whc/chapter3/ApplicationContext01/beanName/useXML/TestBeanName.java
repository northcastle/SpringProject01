package com.whc.chapter3.ApplicationContext01.beanName.useXML;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * author : whc
 * createTime:2019/8/13  20:09
 */
public class TestBeanName {
    @Test
    public void testnameOnly(){
        //1.get spring IoC container
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-beanName.xml");
        //2.get all beans
        Map<String, String> beansOfType = ctx.getBeansOfType(String.class);
        //3.print every bean's name
        Set<Map.Entry<String, String>> entries = beansOfType.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }

    }

    @Test
    public void beannamesalias(){
        //1.get spring IoC container
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-beanName.xml");
        //2.get all bean by different names
        String string01 =  ctx.getBean("wang",String.class);
        String string02 =  ctx.getBean("wang02",String.class);
        String string03 =  ctx.getBean("wang03",String.class);
        String string04 =  ctx.getBean("wang04",String.class);
        String string05 =  ctx.getBean("wang05",String.class);
        String string06 =  ctx.getBean("wang06",String.class);
        String string07 =  ctx.getBean("wang07",String.class);

        System.out.println(string01 == string02);
        System.out.println(string02 == string03);
        System.out.println(string03 == string04);
        System.out.println(string04 == string05);
        System.out.println(string05 == string06);
        System.out.println(string06 == string07);

        Map<String, String> beansOfType = ctx.getBeansOfType(String.class);
        System.out.println(beansOfType.size());

        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("**************************************");
        //3. get all alias which bean name is wang
        String[] aliasesofwang = ctx.getAliases("wang");
        for (String wang : aliasesofwang) {
            System.out.println(wang);
        }
        System.out.println("********************");
    }

    @Test
    public void beannamesaliasnameandid(){
        //1.get spring IoC container
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-beanName.xml");
        //2.get all bean by different names
        Map<String, String> beansOfType = ctx.getBeansOfType(String.class);
        Set<Map.Entry<String, String>> entries = beansOfType.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"\n alias : "+ Arrays.toString(ctx.getAliases(entry.getKey())) );
        }
        System.out.println("*************************************************");
        beansOfType.entrySet().stream().forEach(b->{
            System.out.println(b.getKey()+"\n alias : "+ Arrays.toString(ctx.getAliases(b.getKey())) );
        });
    }
}
