package com.whc.chapter4.Profiles;

import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * author : whc
 * createTime:2019/9/28  11:14
 *
 * 测试 使用 xml 的配置文件 切换
 *
 * 方式一 ： 指定 运行时环境 JVM 的参数 来实现配置文件的切换
 *           -Dspring.profiles.active="dev/pro" 来切换激活的配置文件
 * 方式二 ： 直接调用 ctx.getEnvironment().setActiveProfiles("dev")
 *           以编程的方式调用配置文件
 */
public class FoodServiceTestByXML {

    /**
     * 1. 通过使用配置 JVM 的运行时参数 来选择具体的配置文件
     */
    @Test
    public void testxml(){

        //1.为了能够动态的加载配置文件，这个地方可以使用这个类
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        ctx.load("springChapter4/profiles/applicationcontext-*.xml");
        ctx.refresh();

        //2.常规操作，从ctx 中获取bean
        FoodService foodprovider = ctx.getBean("foodprovider", FoodService.class);

        List<Food> list = foodprovider.providerLunch();
        for (Food food : list) {
            System.out.println(food);
        }
    }


    /**
     * 2. 编程的方式设置 激活的配置文件
     */
    @Test
    public void testxmlbysetActiveprofiles(){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        //通过spring容器 中的 Environment 对象 设置 激活的配置文件
        ctx.getEnvironment().setActiveProfiles("proaa");

        ctx.load("springChapter4/profiles/applicationcontext-*.xml");
        ctx.refresh();

        FoodService bean = ctx.getBean("foodprovider", FoodService.class);
        List<Food> list = bean.providerLunch();
        for (Food food : list) {
            System.out.println(food);
        }
    }
}
