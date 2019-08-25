package com.whc.chapter4.Internationaliztion;

import org.junit.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * author : whc
 * createTime:2019/8/25  21:37
 */
public class TestNumberFormat {

    @Test
    public void testNumberFormat(){
        //1.把 数字 转成 中文/英文 下的字符串 format
      NumberFormat currencyInstanceCN = NumberFormat.getCurrencyInstance(Locale.CANADA);
        int RMB = 101;
        String formatrmb = currencyInstanceCN.format(RMB);
        System.out.println(formatrmb); // ￥101.00  /  $101.00

        System.out.println("===================");



        //2. 把字符串 转换成 数字
        NumberFormat currencyInstanceCN2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String RMB2 = "￥101";
        Number price = null; // 注意这里的转换为 Number 的类型，比较陌生
        try {
            price = currencyInstanceCN2.parse(RMB2);
            System.out.println(price);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 由于 price 是Number 类型的数据，所以不能直接进行相加的操作
        //需要进行数据类型的转换==》转换成 int/double等类型进行相加的操作
        int i = price.intValue()+100;
        System.out.println(i);
    }
}
