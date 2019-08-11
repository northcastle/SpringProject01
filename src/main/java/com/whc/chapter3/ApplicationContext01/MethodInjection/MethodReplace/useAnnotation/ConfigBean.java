package com.whc.chapter3.ApplicationContext01.MethodInjection.MethodReplace.useAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author : whc
 * createTime:2019/8/11  18:02
 */
@Configuration
public class ConfigBean {

    @Bean("newstudent01")
    public StudentSay createstudent01(){
        return  new StudentSay();
    }

    @Bean("newreplacer")
    public  ReplaceStudentSay createreplacer(){
        return new ReplaceStudentSay();
    }

    @Bean("newstudent02")
    public StudentSay createstudent02(){
        return new StudentSay();
    }
}
