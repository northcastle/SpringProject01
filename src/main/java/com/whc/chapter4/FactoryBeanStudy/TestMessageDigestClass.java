package com.whc.chapter4.FactoryBeanStudy;

import org.junit.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * author : whc
 * createTime:2019/8/18  21:53
 *
 * 这一个测试类，用来学习使用一下 MessageDigest 类的基本操作
 */
public class TestMessageDigestClass {

    @Test
    public void test01(){
        //1.获取 MessageDigest 类的实例,需要处理 异常
        MessageDigest messageDigest01 = null;
        try { // ctrl+alt+t 快捷键可以调出 常用的语法结构
           messageDigest01 =  MessageDigest.getInstance("MD5");
            System.out.println(messageDigest01);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        //2. 向MessageDigest传送要计算的数据 : byte /byte[] 类型的参数
        String myname = "This is myname test";
        System.out.println(myname.getBytes());//[B@61e4705b 为计算之前的字节数组
        messageDigest01.update(myname.getBytes());

        //3.计算摘要信息
       byte[] returnDigestMessage =  messageDigest01.digest();
        System.out.println(returnDigestMessage); //[B@50134894 计算完成之后的结果
        System.out.println(this.convertToHexString(returnDigestMessage)); // 打印的散列值 ;  3ac71574f5c81e72ba7ba199611fc0de

    }
    @Test
    public void test02(){
        //1.获取 MessageDigest 类的实例,需要处理 异常
        MessageDigest messageDigest01 = null;
        try { // ctrl+alt+t 快捷键可以调出 常用的语法结构
            messageDigest01 =  MessageDigest.getInstance("md5");
            System.out.println(messageDigest01);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        //2. 向MessageDigest传送要计算的数据 : byte /byte[] 类型的参数
        String myname = "This is myname test";
        System.out.println(myname.getBytes());//[B@61e4705b 为计算之前的字节数组
        messageDigest01.update(myname.getBytes());

        //3.计算摘要信息
        byte[] returnDigestMessage =  messageDigest01.digest();
        System.out.println(returnDigestMessage); //[B@50134894 计算完成之后的结果
        System.out.println(this.convertToHexString(returnDigestMessage)); // 打印的散列值 ;  3ac71574f5c81e72ba7ba199611fc0de
                                                                                           //3ac71574f5c81e72ba7ba199611fc0de

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
