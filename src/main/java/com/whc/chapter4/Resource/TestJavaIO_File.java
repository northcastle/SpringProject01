package com.whc.chapter4.Resource;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * author : whc
 * createTime:2019/9/22  11:02
 *
 * 这个类中 复习一下 Java 中的 IO 相关的内容
 * 这个是基础操作，必会的内容
 * 非常的常用，就要像List一样要掌握
 */
public class TestJavaIO_File {

    /**
     * 1.测试 windows 下的目录 分隔符号 "\"
     * 第一种写法 ： File.separator;
     * 第二种写法 ： 直接写的话是 \\ :可以看 第二个test
     */
    @Test
    public void testFileSeparator(){
        String separator = File.separator;
        System.out.println(separator);
    }

    /**
     * 2.1直接写定路径的方式创建文件  \\
     *
     * File 只是能对文件进行 创建，删除，重命名 等操作，
     * 真正的往文件里面写入内容，还需要使用流的思想来进行操作的
     */
    @Test
    public void testAbsoluteFile1(){

       //1. new File() : 只会创建一个文件的路径映射，并不会在物理磁盘上真正的创建文件
        File fileAbsolute1 = new File("D:\\EDailyRoutine\\fileabsolute1.txt");

        String name1 = fileAbsolute1.getName(); // 返回file的名字 fileabsolute1.txt
        System.out.println(name1);
        String path1 = fileAbsolute1.getPath(); // 返回file的绝对路径 D:\EDailyRoutine\fileabsolute1.txt
        System.out.println(path1);
        String parent1 = fileAbsolute1.getParent(); // 返回文件的上一级目录  D:\EDailyRoutine
        System.out.println(parent1);

        File absoluteFile = fileAbsolute1.getAbsoluteFile(); // 这个返回的也是文件 D:\EDailyRoutine\fileabsolute1.txt
        System.out.println(absoluteFile.getPath());
        String absolutePath = fileAbsolute1.getAbsolutePath(); // 这个返回的是绝对路径 D:\EDailyRoutine\fileabsolute1.txt
        System.out.println(absolutePath);

        //2.file.exists()方法判断的是，文件是否在磁盘中存在
        if (fileAbsolute1.exists()){
            System.out.println("createFile之前 ： 文件存在");
        }else{
            System.out.println("createFile之前 ： 文件不存在");
        }

        //3.file.creatNewFile() : 真正的在磁盘上创建文件
        if(!fileAbsolute1.exists()){ // 当文件不存在的时候
            try {
                boolean createOK = fileAbsolute1.createNewFile();
                if (createOK){
                    System.out.println("文件创建成功！");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            System.out.println("文件已经存在！");
        }

    }

    /**
     * 2.2 直接使用 File.separator 的方式写完整的文件路径，
     * 这样不用考虑跨平台的问题，用起来感觉更加的安全些
     */
    @Test
    public void testAbsolute2(){
        File file2 =
                new File("d:" + File.separator + "EDailyRoutine" + File.separator + "fileabsolute2.xlsx");

        if(file2.exists()){ // 如果文件存在，就先把文件删除掉
            boolean deleteok = file2.delete();
            if (deleteok){
                System.out.println("文件存在，不过已经被我删掉了!");
            }
        }

        Boolean createok = null;
        try {
           createok = file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (createok){
            System.out.println("文件创建完成！");
        }

    }

    /**
     * 2.3 使用相对路径进行文件的创建操作
     */
    @Test
    public void testfileRelative(){
        File file = new File("filerelative.java");
        if (!file.exists()){
            try {
                boolean createok = file.createNewFile();
                if (createok){
                    System.out.println("文件创建完成！");
                    System.out.println(file.getAbsolutePath());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            file.delete();
            try {
                boolean createok = file.createNewFile();
                if (createok){
                    System.out.println("文件创建完成 after delete！");
                    System.out.println(file.getAbsolutePath());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }




}
