package com.whc.chapter4.Internationaliztion;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * author : whc
 * createTime:2019/8/25  20:00
 */
public class TestResourceBoundle01 {

    /**
     * 01 测试 中文的配置文件
     */
    @Test
    public void testZH(){
        /**
         * 注意事项 :
         *      读取的文件的路径 ，不能带有 .properties 后缀名
         *      写相对路径就可以
         */
        ResourceBundle bundle_zh =
                ResourceBundle.getBundle("springChapter4/i18n/db_zh", Locale.CHINA);

       //1. 可以获取所有的  键
        Enumeration<String> keys = bundle_zh.getKeys();
        while (keys.hasMoreElements()){
            String s = keys.nextElement();
            System.out.println("-->"+s+"<--");
        }
        System.out.println("==========================");
        //2. 我想读取值
        System.out.println(bundle_zh.getString("username"));
        System.out.println(bundle_zh.getString("password"));
        System.out.println(bundle_zh.getString("classname"));
    }

    /**
     * 02 测试英文的 配置文件
     */
    @Test
    public void TestEN(){
        ResourceBundle bundle_en =
                ResourceBundle.getBundle("springChapter4/i18n/db_en");
        System.out.println(bundle_en.getString("username"));
        System.out.println(bundle_en.getString("password"));
        System.out.println(bundle_en.getString("classname"));
    }

    /**
     * 03 测试默认的配置文件
     */
    @Test
    public void TestDefault(){
        ResourceBundle bundle_en =
                ResourceBundle.getBundle("springChapter4/i18n/default");
        System.out.println(bundle_en.getString("username"));
        System.out.println(bundle_en.getString("password"));
        System.out.println(bundle_en.getString("classname"));
    }

}
