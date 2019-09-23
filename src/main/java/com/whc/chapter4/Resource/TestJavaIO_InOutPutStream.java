package com.whc.chapter4.Resource;

import org.junit.Test;

import java.io.*;

/**
 * author : whc
 * createTime:2019/9/23  21:37
 *
 * 这个类中复习一下 FileInputStream 和 FileOutputStream 两个流的使用
 * 整个的流程操作都是套路起来的
 * 只要十分的熟悉套路就可以操作了
 */
public class TestJavaIO_InOutPutStream {

    /**
     * 1.FileInputStream 输入流的使用
     *留了一个问题 ： 读取中文时有乱码问题
     */
    @Test
    public void testFileInputStream(){
        //1.创建文件
        File file1 = new File("d:" + File.separator + "EDailyRoutine" + File.separator + "fileabsolute1.txt");
        //2.创建输入流
        FileInputStream fis = null;
        //3.使用流读取文件中的内容（最复杂的部分）
        try {
            if(file1.exists()){ // 如果文件存在，那么就创建fis
                fis = new FileInputStream(file1);
                // *** 读取文件的核心操作***
                /**
                 * 科普一下
                 * byte，即字节，由8位的二进制组成。
                 * 在Java中，byte类型的数据是8位带符号的二进制数。
                 *在计算机中，8位带符号二进制数的取值范围是[-128, 127]，
                 * 所以在Java中，byte类型的取值范围也是[-128, 127]。
                 */
                byte [] b = new byte[1024]; // 这个是每次读取这些字节的内容
                int len;
                try {
                    while ((len=fis.read(b)) != -1){ // 循环读取内容,返回值为-1 的时候，证明是结尾了
                        String str = new String(b);
                        System.out.println("--->"+str+"<---");
                    }
                    System.out.println("数据读取完成");
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if(fis != null ){
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }

            }else{
                System.out.println("文件不存在！");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //4.关闭流
        finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    /**
     * 2.复习 FileOutputStream 的简单使用方法
     * 写入文件的时候，如果文件不存在，会先创建一个文件，然后继续写入文件
     * 写入字符串的时候，直接写中文是没有问题的！
     */
    @Test
    public void testFileOutputStream(){
        //1.创建文件
        File file2 = new File("D:\\EDailyRoutine\\fileabsolute2.txt");
        //2.创建FileOutputStream流的对象
        FileOutputStream fos = null;
        //3.写内容
        try {
            fos = new FileOutputStream(file2); // 根据对象创建流
            String str = "这是我像要写的内容"; // 这个地方如果是直接写入字符串的话，是没有问题的，
            fos.write(str.getBytes()); // write 的参数也是一个byte的数组
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //4.关闭流
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 3.输入输出流的联合操作;
     * 功能 : 实现复制图片的功能！
     * 可以把这个封装成一个方法，把两个路径作为参数，
     * 直接调用方法，实现复制文件的操作！
     * 简单而且好用！
     *
     */
    @Test
    public void testCopyPicture(){
        //1.创建文件
        File fileIn = new File("D:\\EDailyRoutine\\javaiotest\\testio.JPG"); // 读取的文件
        File fileOut = new File("D:\\EDailyRoutine\\javaiotest\\testiocopy.JPG"); // 写出来的文件
        //2.创建输入流和输出流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //3.一边读取文件，一边写出文件
        try {
            fis = new FileInputStream(fileIn);
            fos = new FileOutputStream(fileOut);

            //3.1 读取文件
            byte[] b = new byte[1024];
            int len;
            while((len=fis.read(b)) != -1){ // 当没有读取完成的时候
                //3.2 写入文件
                fos.write(b); // 直接把读取到的内容写入到文件中去
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {  //4.关闭流
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("文件复制完成！");
        }

    }
}
