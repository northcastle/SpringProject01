package com.whc.chapter3.ApplicationContext01.MethodInjection.LookupMethod.useAnnotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.
        StandardLookupMethodDemoBean standardlookupbean =
                ctx.getBean("standardlookupbean", StandardLookupMethodDemoBean.class);
        //3.
        displayInfoWithAnnotation("standarlookupbean",standardlookupbean);

    }

    /**
     * 测试使用方法注入的操作
     */
    @Test
    public void testabstract(){
        //1.
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.
        AbstrackLookupMethodDemoBean absracklookupbean =
                ctx.getBean("abtracklookupbean", AbstrackLookupMethodDemoBean.class);
        //3.
        displayInfoWithAnnotation("abtracklookupbean",absracklookupbean);

    }

    @Test
    public void testMyBean(){
        //1.
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigBean.class);
        //2.
        MyAbstrackLookupMethodBean myabsracklookupbean =
                ctx.getBean("myabstracklookupmethodbean", MyAbstrackLookupMethodBean.class);
        //3.
        //0.获取两个对象
        Singer mySinger1 = myabsracklookupbean.getmytestsinger();
        Singer mySinger2 = myabsracklookupbean.getmytestsinger();

        //1.下面用来输入获取到的两个对象是否是一个对象
        System.out.println(" Judge : Siner Instance the Same ？ "+(mySinger1 == mySinger2));

    }

    /**
     * 此静态方法用来打印bean的信息的
     * @param beanName
     * @param bean
     */
    public  void  displayInfoWithAnnotation(String beanName,DemoBean bean){
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
