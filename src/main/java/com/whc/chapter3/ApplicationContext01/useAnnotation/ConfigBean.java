package com.whc.chapter3.ApplicationContext01.useAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * author : whc
 * createTime:2019/8/6  21:14
 */
//声明这个类是一个配置类
@Configuration
//开始自动扫描bean
@ComponentScan(basePackages = "com.whc.chapter3.ApplicationContext01.useAnnotation")
public class ConfigBean {

    @Bean("studentinfo02")
    public StudentInfo createStudent02(){
        StudentInfo student02 = new StudentInfo("201909020002", "及时雨宋江", 33, 1, null);
        student02.setClassInfo(this.createClass02());
        return student02;
    }

    @Bean("classinfo02")
    public ClassInfo createClass02(){
        return new ClassInfo("0002","SpringBoot","SpringBoot is easy!");
    }
}
