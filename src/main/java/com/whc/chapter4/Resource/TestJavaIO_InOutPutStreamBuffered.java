package com.whc.chapter4.Resource;

import org.junit.Test;

import java.io.*;

/**
 * author : whc
 * createTime:2019/9/24  21:06
 *
 * 这个类来复习一下 BufferedInputStream BufferedOutputStream
 * 两个缓冲流的操作
 *
 * 操作要点 :
 *
 * 1.对文件的操作步骤仍然是一致的
 * 2.只不过使用的对象 在FileInputStream 的基础上再包装一下 ==》 BufferedInputStream
 *                     FileOutputStream == > BufferedOutputStream
 * 3.BufferedOutputStream 在 写操作完成之后，需要将缓存冲一下： .flush();
 * 4.关闭流只需要关闭 Buffered两个即可，其他的可以自动关闭
 */
public class TestJavaIO_InOutPutStreamBuffered {

    /**
     * 复习使用BufferedInputStream+BufferedOutputStream 实现图片的复制操作
     */
    @Test
    public void testCopyPicture(){

        //1.准备两个文件
        File fileIn = new File("D:\\EDailyRoutine\\javaiotest\\testio.JPG");
        File fileOut = new File("D:\\EDailyRoutine\\javaiotest\\testioBuffered.JPG");

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //2.准备FileInutStream + FileOutputStream 两个对象
            FileInputStream fis = new FileInputStream(fileIn);
            FileOutputStream fos = new FileOutputStream(fileOut);
            //3.准备BufferedInputStream + BufferedOutputStream 两个对象
             bis = new BufferedInputStream(fis);
             bos = new BufferedOutputStream(fos);
            //4.进行读写操作（这个操作是常规操作）
             byte[] b = new byte[1024];
             int len;
             while ((len=bis.read(b)) != -1){
                 bos.write(b);
                 bos.flush(); // 每次在写完之后需要flush一下缓冲的操作
             }

            System.out.println("文件复制完成！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //5.关闭Buffered流
            try {
                bis.close(); // 关闭流
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close(); // 关闭流
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
