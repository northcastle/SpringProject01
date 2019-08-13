package com.whc.chapter3.ApplicationContext01.beanName.useAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * author : whc
 * createTime:2019/8/13  21:07
 */
@Configuration
@ComponentScan(basePackages = {"com.whc.chapter3.ApplicationContext01.beanName.useAnnotation"})
public class ConfigBean {
    @Bean(name = {"wanghongchang","wang02","wang03"})
    public StudentInfo student01(){
        return new StudentInfo();
    }
}
