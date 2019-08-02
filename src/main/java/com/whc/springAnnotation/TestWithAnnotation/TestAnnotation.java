package com.whc.springAnnotation.TestWithAnnotation;

import com.whc.spring.interfacea.MessageRender;
import com.whc.springAnnotation.config.BeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author : whc
 * createTime:2019/8/2  23:29
 */
public class TestAnnotation {
    public static void main(String[] args) {
        //1.获取注解方式的spring容器
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(BeansConfig.class);
        //2.获取所有的spring容器中的bean名称
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//        for (int i = 0; i < beanDefinitionNames.length; i++) {
//            String beanDefinitionName = beanDefinitionNames[i];
//            System.out.println(beanDefinitionName);
//        }
        //3.获取render对象
        MessageRender render = ctx.getBean("render", MessageRender.class);
        render.render();

    }
}
