package com.whc.chapter3.ApplicationContext01.MethodInjection.LookupMethod.useXML;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * author : whc
 * createTime:2019/8/11  15:37
 */
public class TestLookupMethodInjection {

    /**
     * 测试常规的setter注入的方法
     */
    @Test
    public void teststandard(){
        //1.
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-LookupMethodInjection.xml");
        //2.
        StandardLookupMethodDemoBean standardlookupbean =
                ctx.getBean("standardlookupbean", StandardLookupMethodDemoBean.class);
        //3.
        displayInfo("standarlookupbean",standardlookupbean);

    }

    /**
     * 测试使用方法注入的操作
     */
    @Test
    public void testabstract(){
        //1.
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter3/applicationcontext-LookupMethodInjection.xml");
        //2.
        AbstrackLookupMethodDemoBean absracklookupbean =
                ctx.getBean("abtracklookupbean", AbstrackLookupMethodDemoBean.class);
        //3.
        displayInfo("abtracklookupbean",absracklookupbean);

    }

    /**
     * 此静态方法用来打印bean的信息的
     * @param beanName
     * @param bean
     */
    public static void  displayInfo(String beanName,DemoBean bean){
        //0.获取两个对象
        Singer mySinger1 = bean.getMySinger();
        Singer mySinger2 = bean.getMySinger();

        //1.下面用来输入获取到的两个对象是否是一个对象
        System.out.println(""+beanName+" : Siner Instance the Same ？ "+(mySinger1 == mySinger2));

        //2.下面这个用来测试获取1000个对象的速度
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupdemo");
        for (int i = 0; i < 10000; i++) {
            Singer singer =  bean.getMySinger();
            singer.sing();
        }
        stopWatch.stop();
        System.out.println("10000 gets took "+stopWatch.getTotalTimeMillis()+" ms");
    }
}
