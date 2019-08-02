package com.whc.spring.TestWithApplicationContextxml;

import com.whc.spring.interfacea.MessageProvider;
import com.whc.spring.interfacea.MessageRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author : whc
 * createTime:2019/8/2  22:57
 */
public class TestApplicationContextxml {
    public static void main(String[] args) {
        //1.获取spring 容器
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        //2.从spring容器中获取bean的所有名字，itar 是个循环的快捷键，哈哈哈；ctrl+alt+v 可以快速补全返回值类型
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            String beanDefinitionName = beanDefinitionNames[i];
            System.out.println(beanDefinitionName);
        }
        //3.从spring容器中获取bean
        MessageRender render = ctx.getBean("render",MessageRender.class);
        render.render();
    }
}
