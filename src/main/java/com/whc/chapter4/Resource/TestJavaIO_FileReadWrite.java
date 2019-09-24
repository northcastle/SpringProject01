package com.whc.chapter4.Resource;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 这个类来进行FileReader FileWriter的操作
 * 2019-09-24 ： whc
 */
public class TestJavaIO_FileReadWrite {

    /**
     * 1.复习使用 FileReader 的读入操作
     *
     * 这个有bug : 当读取的内容是 中文的时候，会有乱码的情况
     * 这个问题与FileInputStream 读取文件的时候是一样的问题
     */
    @Test
    public void testFileReader(){

        //1.创建文件
        File file = new File("H:\\2018workfile\\学习笔记资料\\学习资料\\java学习资料\\java基础系统学习求求你别删哦\\java学习之IO流\\aa.txt");
        //2.创建FileReader对象
        FileReader fr = null;

        //3.读取文本文件中的内容，这个地方是核心
        try {
            fr = new FileReader(file);

            char[] c = new char[1024];
            int len;
            while((len=fr.read(c)) != -1){
               String str = new String(c);
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {//4.关闭FileReader
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /**
     * 2.测试FileWriter类的操作
     * 写入的操作
     */
    @Test
    public void testFileWriter(){
        //1.创建文件对象
        File file =
                new File("H:\\2018workfile\\学习笔记资料\\学习资料\\java学习资料\\java基础系统学习求求你别删哦\\java学习之IO流\\bb.txt");
        //2.创建FileWriter对象
        FileWriter fw = null;

        //3.开始进行写入操作
        try {
            fw = new FileWriter(file);
            String str = "这是我要写入的操作";
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //4.关闭FileWriter对象
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    /**
     * 3.同样的，我可以使用上面的两个对象进行一个文件的复制操作
     */
    @Test
    public void testCopyFile(){
        //1.创建文件
        File file1 = new File("H:\\2018workfile\\学习笔记资料\\学习资料\\java学习资料\\java基础系统学习求求你别删哦\\java学习之IO流\\aa.txt");
        File file2 = new File("H:\\2018workfile\\学习笔记资料\\学习资料\\java学习资料\\java基础系统学习求求你别删哦\\java学习之IO流\\aacopy.txt");
        //2.创建FileReader/FileWriter
        FileReader fr = null;
        FileWriter fw = null;
        //3.进行文件的读写操作
        try {
            fr = new FileReader(file1);
            fw = new FileWriter(file2);

            char[] c = new char[1024];
            int len;

            while((len = fr.read(c)) != -1){ // 这里实现了边读边写的功能
                fw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //4.关闭Reader/Writer
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

}
