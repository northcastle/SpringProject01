package com.whc.chapter4.Internationaliztion;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * author : whc
 * createTime:2019/8/25  20:57
 *
 * 学习日期 的转换
 *
 * 总之 SimpleDateFormat 这个类的使用还是非常简单的
 * 相比较它的父类 DateFormat 确实是简单许多许多
 */
public class TestDateTime {

    /**
     * 1.DateFormat 类 进行 日期与字符串的转换
     */
    @Test
    public void testDateFormat(){

        //1.日期转换成字符串 format
        Date date = new Date();
        System.out.println(date); //Sun Aug 25 20:59:44 CST 2019

        // 如果想同时处理 日期和时间，就需要使用的 getDateTimeInstance来创建DateFromat实例
        //并且把参数都设置好
        DateFormat dateInstanceCN =
                DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM,Locale.CHINA);
        String formatDateStr = dateInstanceCN.format(date);
        System.out.println(formatDateStr);

        //下面的这个判断 说明了 直接使用DateFormat 创建的对象就是一个SimpleDateFormat的实例
        if (dateInstanceCN instanceof SimpleDateFormat){
            System.out.println("我是一个SimpleDateFormat的实例");
        }

        System.out.println("========================================");

    }


    /**
     * 测试SimpleDateFormat 类进行 字符串转换成 日期的操作
     */
    @Test
    public void testSimpleDateFormat(){
        //2.字符串转换成日期 parse
        /**
         * 字母    　　日期或时间元素    　　　　　　 表示    　　　　示例
         * G    　　　　Era 标志符    　　　 　　　　Text    　　　　AD
         * y    　　　　年    　　　　　　　　　　　　Year    　　　　1996; 96
         * M    　　　　年中的月份    　　　　　　　　Month    　 　　July; Jul; 07
         * w    　　　　年中的周数    　　　　　　　　Number    　　　27
         * W    　　　　月份中的周数    　　　　　　　Number    　　　2
         * D    　　　　年中的天数    　　　　　　　　Number    　　　189
         * d    　　　　月份中的天数    　　　　　　　Number    　　　10
         * F    　　　　月份中的星期    　　　　　　　Number    　　　2
         * E    　　　　星期中的天数    　　　　　　　Text    　　　　Tuesday; Tue
         * a    　　　　Am/pm 标记    　　　 　　　　Text    　　　　PM
         * H    　　　　一天中的小时数（0-23）　　　　Number    　　　0
         * k   　　　　 一天中的小时数（1-24）　　　　Number    　　　24
         * K    　　　　am/pm 中的小时数（0-11）    Number    　　　0
         * h    　　　　am/pm 中的小时数（1-12）    Number    　　　12
         * m    　　　　小时中的分钟数    　　　　　　Number    　　　30
         * s   　　 　　分钟中的秒数    　　　　　　　Number    　　　55
         * S    　　　　毫秒数    　　　　　　　　　　Number    　　　978
         * z    　　　　时区    　　　　　　General time zone    Pacific Standard Time; PST; GMT-08:00
         * Z    　　　　时区    　　　　　　RFC 822 time zone    -0800
         */

        String dateStr = "20190825 21:15:36";
        String datePattern = "yyyyMMdd HH:mm:ss";
        // 使用模板进行创建实例
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        Date parseDate = null;
        try {
            parseDate = simpleDateFormat.parse(dateStr); // 把字符串转换成日期类型
        } catch (ParseException e) {
            e.printStackTrace();
        }
               System.out.println(parseDate);

        System.out.println("==========================");


        // 下面这一个是把日期转换成 字符串的操作
        //这个操作好像很简单的样子啊
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(date);

        String simpleDateFormatStr = simpleDateFormat1.format(date);
        System.out.println(simpleDateFormatStr);
    }
}
