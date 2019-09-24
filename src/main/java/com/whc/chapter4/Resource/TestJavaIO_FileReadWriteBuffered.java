package com.whc.chapter4.Resource;

import org.junit.Test;

import java.io.*;

/**
 * author : whc
 * createTime:2019/9/24  21:31
 *
 * 一、这个类主要是 复习 BufferedReader + BufferedWriter两个类的操作
 * 其中 BufferedWriter 每次使用需要 调用  .newLine();//换行
 *                                       .flush();//清空缓存
 *  两个方法实现缓存的清空操作
 *
 *  二、这里还需要理解一个概念 ： 字节转换流！ 这个很关键
 *    InputStreamReader : 字节流 -->  字符流(字符数组) 【解码】
 *    理解 ： 在读取文件的时候，文件时字节流，在程序中，体现的一个一个的字符，
 *            故读取文件的时候需要使用字节流到字符流的转换
 *    OutputStreamWriter : 字符流(字符数组) --> 字节流 【编码】
 *    理解 ： 在写入文件的时候，程序中时一个一个的字符，而文件中时用字节来保存的，
 *            故在王文件中写入操作的时候，需要使用到字符流到字节流的转换
 *
 *  三、通过使用 字节流 --> 字符流  的转换的类 InputStreamReader ，
 *      可以完美的解决读取文件时候的中文乱码问题
 * *
 */
public class TestJavaIO_FileReadWriteBuffered {

    /**
     * 下面 练习使用上述概念 实现一个 txt文件的复制操作，
     * 并且在这个地方，就解决了 读取的文件中的内容是中文时候的乱码问题
     *
     *
     * 为了 更清楚的 看到操作，本案例，不使用try/catch块的方式，而是直接把exception抛出
     */
    @Test
    public void testcopyText() throws  Exception{

        //1.创建两个文件，一个用来读取操作，一个用来写入操作
        File fileIn = new File("D:\\EDailyRoutine\\javaiotest\\fileabsolute1.txt");
        File fileOut = new File("D:\\EDailyRoutine\\javaiotest\\fileabsolute1copy.txt");

        //2.创建两个流 FileInputStream + FileOutPutStream
        FileInputStream fis = new FileInputStream(fileIn);
        FileOutputStream fos = new FileOutputStream(fileOut);

        //3.创建两个转换流对象 InputStreamReader+OutputStreamWriter
        // 创建对象的时候，可以指定字符编码，这样就解决了中文乱码的问题！ GBK
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");

        //4.创建两个缓冲流 BufferedReader+BufferedWriter
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        //5.执行读写操作
        //这里有个比较厉害的就是，可以直接进行一行一行的读取操作
        String str;
        while((str = br.readLine()) != null){ // 当每一次读取的内容部位空的时候，说明这一行有东西
            System.out.println(str); // 这样的打印应该是没有乱码的问题了
            bw.write(str); // 写操作
            bw.newLine(); // 写一个换行操作
            bw.flush(); // 缓存处理一下
        }

        System.out.println("文本文件复制完毕！");

        //6.关闭流
        br.close();
        bw.close();
    }
}
