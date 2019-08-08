package com.whc.chapter3.ApplicationContext01.setterInjection.useAnnotation;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * author : whc
 * createTime:2019/8/8  21:10
 */
@Configuration
@ComponentScan(basePackages = {"com.whc.chapter3.ApplicationContext01.setterInjection.useAnnotation"})
public class ConfigBean {

    @Bean(value = "javaClass")
    public ClassInfo createJavaClass(){
        return new ClassInfo("20190801","JavaClass");
    }

    @Bean(value = "springClass")
    public ClassInfo createSpringClass(){
        return new ClassInfo("20190802","SpringClass");
    }

    @Bean("student01" )
    public StudentInfo createStudent01(){
        StudentInfo student01 = new StudentInfo();
        student01.setStudentNo("201908080001");
        student01.setStudentName("KoBe");
        student01.setStudentAge(39);
        return student01;
    }


}
