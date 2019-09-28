package com.whc.chapter4.ProfilesJava;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * author : whc
 * createTime:2019/9/28  17:30
 *
 * 这个是 来 测试 这个使用Java配置类的 配置文件的使用
 *
 * 基于注解的这个 就不能使用 编码的方式来设置 起作用的 配置类了，
 * 不知道为什么，就是不能用
 * 这个是无效的 ： ctx.getEnvironment().setActiveProfiles("pro");
 *
 */

public class FoodJavaServiceTest {

    @Test
    public void test(){
        //1.创建 基于注解的spring容器
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(FoodJavaConfigDev.class, FoodJavaConfigPro.class);

        ctx.getEnvironment().setActiveProfiles("pro");
        //ctx.refresh(); // 当使用注解类的时候，这个refresh也不需要写，否则报错


        FoodJavaService bean = ctx.getBean("foodjavaservice", FoodJavaService.class);
        List<FoodJava> list = bean.providerFood();
        for (FoodJava foodJava : list) {
            System.out.println(foodJava);
        }

    }
}
