package com.whc.chapter4.Resource;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.*;

/**
 * author : whc
 * createTime:2019/9/25  22:10
 *
 * 1.Resource 是一个接口 ：实现类有如下：
 *     |-- FileSystemResource
 *     |-- ClassPathResource
 *     |-- UrlResource
 *     |-- ByteArrayResource
 *     |-- ServletContextResource
 *     |-- InputStreamResource
 *
 *  2.Spring框架为了更方便的获取资源，
 *  尽量弱化程序员对各个Resource接口的实现类的感知，
 *  定义了另一个ResourceLoader接口。
 *  该接口的getResource(String location)方法可以用来获取资源。
 *  它的DefaultResourceLoader实现类可以适用于所有的环境，可以返回ClassPathResource、UrlResource等。
 *
 *   ResourceLoader在进行加载资源时需要使用前缀来指定需要加载：
 *     “classpath:path”表示返回ClasspathResource，
 *     “http://path”和“file:path”表示返回UrlResource资源，
 *   如果不加前缀则需要根据当前上下文来决定，DefaultResourceLoader默认实现是加载classpath资源。
 *
 *
 *   3.所有ApplicationContext实例都实现了ResourceLoader接口，
 *     因此我们在使用Spring容器时，可以不去过于计较底层Resource的实现，也不需要自己创建Resource实现类，
 *     而是直接使用applicationContext.getResource()，获取到bean容器本身的Resource，
 *     进而取到相关的资源信息。
 */
public class TestSpringResource {

    /**
     * 1.简单使用一下ApplicationContext 获取 Resource对象的操作
     */
    @Test
    public void testApplicationContextResource() throws  Exception{
        //1.创建ApplicationContext对象
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
        //2.通过ApplicationContext对象获取Resource对象 : 例如我就写一个远程的资源路径 D:\EDailyRoutine\javaiotest\testio.JPG
        Resource resource = ctx.getResource("http://192.168.1.10/whc/2.jpg");
        //3.获取相关的信息
        // 当使用这个方法的时候，可能就是会报 java.io.FileNotFoundException 这个错误
        //所以尽量不要用
//        File file = null;
//        try {
//            file = resource.getFile();
//        } catch (IOException e) {
//            // e.printStackTrace();
//        }
//        if (file != null && file.exists()){
//            System.out.println("文件存在！");
//            System.out.println("AbsolutePath : "+file.getAbsolutePath());
//            System.out.println("Path : "+file.getPath());
//            System.out.println("Name : "+file.getName());
//            System.out.println("Parent : "+file.getParent());
//        }else{
//            System.out.println("文件不存在！");
//        }

        //4.通过Resource 对象 可以获取到输入流,同样可以实现文件的复制操作
        InputStream is = resource.getInputStream();

        FileOutputStream fos = new FileOutputStream(new File("D:\\EDailyRoutine\\javaiotest\\testioRemoteRes.JPG"));

        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte [] b = new byte[1024];
        int len;

        while((len = bis.read(b)) != -1){
            bos.write(b,0,len);
            bos.flush();
        }

        System.out.println("文件复制完毕！");

    }
}
