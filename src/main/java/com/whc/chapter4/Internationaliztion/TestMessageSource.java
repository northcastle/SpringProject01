package com.whc.chapter4.Internationaliztion;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * author : whc
 * createTime:2019/8/26  21:47
 *
 * 这个用来测试 MessageSource 接口 的操作，spring的国际化的使用
 */
public class TestMessageSource {


    /**
     * 直接读取出配置文件中的内容，没有添加参数的操作
     */
    @Test
    public void test01(){
        //1.
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-06I18n.xml");
        //2.
        System.out.println(ctx.getMessage("msg",null, Locale.CHINA));
        System.out.println(ctx.getMessage("msg",null,Locale.ENGLISH));

    }

    @Test
    public void test02(){
        //1.
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-06I18n.xml");
        //2.
        String[] names = {"王宏昌", "刘佳"}; // 这个就是信息中的参数，可以这样传进来
        System.out.println(ctx.getMessage("msgwithargs", names, Locale.CHINA));
        System.out.println(ctx.getMessage("msgwithargs", names, Locale.ENGLISH));
    }
}
