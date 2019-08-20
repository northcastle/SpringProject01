package com.whc.chapter4.FactoryBeanStudy;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.MessageDigest;

/**
 * author : whc
 * createTime:2019/8/19  21:59
 */
public class TestMessageigestFactoryBean {

    @Test
    public void test01(){
        //1.
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-05FactoryBean.xml");
        //2.
        MessageDigestManager digestManager = ctx.getBean("digestManager", MessageDigestManager.class);
        //3.
        digestManager.digest("我是测试的文本");
    }


    @Test
    public void test02(){
        //1.
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBeanFactoryBean.class);
        //2.
        MessageDigestManager digestManager = ctx.getBean("digestManager", MessageDigestManager.class);
        //3.
        digestManager.digest("我是测试的文本");
    }


    /**
     * 使用 factoty-bean属性设置 的bean
     */
    @Test
    public void test03(){
        //1.
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-05FactoryBean.xml");
        //2.
        MessageDigest myDigest = ctx.getBean("myDigest", MessageDigest.class);
        //3.
        myDigest.reset();
        byte[] input = "我是测试文本".getBytes();
        myDigest.update(input);
        byte[] out =  myDigest.digest();
        System.out.println(convertToHexString(out));

    }

    /**
     * 将 字节数组，转换成 字符串的一个方法，抄的,不过还挺好用的
     * 这个可以用来进行加密操作的呀
     * @param data
     * @return
     */
    public  String convertToHexString(byte data[]) {
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
            strBuffer.append(Integer.toHexString(0xff & data[i]));
        }
        return strBuffer.toString();
    }
}
