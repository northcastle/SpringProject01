package com.whc.chapter4.LifeCycle.DestroyBean._03useJSR250_PreDestroy;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/17  20:56
 *
 * 注意，在想 销毁bean的时候，
 * 需要使用实现了DefaultListableBeanFactory的接口的ApplicationContext,
 * 并且需要手动调用 实现的destroy方法，来销毁所有的单例bean
 */
public class TestDestroyMethodUseJSR_250PreDestroy {

    @Test
    public void testdestroywithxml(){
        //1.
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("springChapter4/applicationcontext-03PostConstruct.xml");

        //2.
        LifeCycleBean destroybean01 = ctx.getBean("destroybean01", LifeCycleBean.class);
        System.out.println(destroybean01);

        System.out.println("=============destroybean01 end==================================");

        LifeCycleBean destroybean02 = ctx.getBean("destroybean02", LifeCycleBean.class);
        System.out.println(destroybean02);
        System.out.println("=============destroybean02 end==================================");

        LifeCycleBean destroybean03 = ctx.getBean("destroybean03", LifeCycleBean.class);
        System.out.println(destroybean03);
        System.out.println("=============destroybean03 end==================================");

        // 关闭的时候应该会销毁bean,并且，这个关闭应该在最后操作，否则后面的会无法访问springIoC容器
        ctx.close();

        System.out.println("================================================");
        //最后在打印一边
        System.out.println(destroybean01);
        System.out.println(destroybean02);
        System.out.println(destroybean03);

    }
}
