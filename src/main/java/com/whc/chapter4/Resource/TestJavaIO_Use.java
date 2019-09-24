package com.whc.chapter4.Resource;

import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * author : whc
 * createTime:2019/9/24  22:35
 *
 * 这个类使用一下 FileInputStream + FileOutputStream 实现一下
 * 从我的Linux电脑上的Apache服务器上读取图片的功能的操作
 *
 * 封装一个方法，通过调用方法的形式进行操作
 *
 *
 */
public class TestJavaIO_Use {

    /**
     * 1.测试本地的图片复制
     */
    @Test
    public void testLocal() throws Exception {
        String pathIn = "D:\\EDailyRoutine\\javaiotest\\testio.JPG";
        String pathOut= "D:\\EDailyRoutine\\javaiotest\\testioByMethon.JPG";
        this.CopyPicture(pathIn,pathOut);

    }

    /**
     * 2.测试Linux电脑上的图片复制
     * 这个需要用到网络上的内容
     */
    @Test
    public void testRemote() throws Exception{
        String pathIn = "http://192.168.1.10/whc/2.jpg";
        String pathOut= "D:\\EDailyRoutine\\javaiotest\\testioRemote.jpg";
       this.CopyPictureRemote(pathIn,pathOut);

    }



    /**
     * 复制图片的方法
     * @param pathIn : 源图片的路径
     * @param pathOut : 目标图片的路径
     * @throws Exception : 异常抛出
     */
    public void CopyPicture(String pathIn,String pathOut) throws Exception{
        //1.创建两个File
        File fileIn = new File(pathIn);
        File fileOut = new File(pathOut);
        if (!fileIn.exists()){
            System.out.println("文件不存在！");
            return;
        }

        //2.创建FileInputStream + FileOutputStream
        FileInputStream fis = new FileInputStream(fileIn);
        FileOutputStream fos = new FileOutputStream(fileOut);
        //3.对文件进行读写操作
        byte [] b = new byte[1024];
        int len;
        while((len=fis.read(b)) != -1){
            fos.write(b);
        }

        System.out.println("文件复制完成!");
        //4.关闭流
        fis.close();
        fos.close();
    }

    /**
     * 2.复制远程服务器上的图片，需要用到网络的内容
     * @param pathIn : 源图片的路径
     * @param pathOut : 目标图片的路径
     * @throws Exception : 异常抛出
     */
    public void CopyPictureRemote(String pathIn,String pathOut) throws Exception{
        //1. 连接远程服务器
        URL url = new URL(pathIn); // java.net.URL ,创建url
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection(); // 创建url连接
        urlConnection.connect(); // 连接远程服务器

        //2.获取输入流 : 通过urlConnection获取
        InputStream is = urlConnection.getInputStream();
        //3.创建普通输出流
        FileOutputStream fos = new FileOutputStream(new File(pathOut));

        //3.创建 缓冲输入流 输出流
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //4.读取文件+写出文件；常规操作
        System.out.println("开始复制远程位置上的文件。。。");
        byte [] b = new byte[1024];
        int len;
        while ((len=bis.read(b)) != -1){
            bos.write(b);
            bos.flush();
        }

        System.out.println("文件从远程位置复制完成！");

        //5.关闭流
        bos.close();
        bis.close();
        urlConnection.disconnect();

    }
}
