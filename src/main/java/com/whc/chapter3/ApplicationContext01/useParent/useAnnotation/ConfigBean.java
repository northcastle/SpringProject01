package com.whc.chapter3.ApplicationContext01.useParent.useAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {

    @Bean("baba")
    public Singer createBaBa(){
        return new Singer("BaBa",35,"SpringClass","我是爸爸");
    }

    /**
     * 貌似没有找到关于这个parent对应的注解的方式
     * @return
     */
    @Bean("son2")
    public Singer createSon1(){
        Singer son = new Singer();
        son.setSingerName("son1");
        son.setSingerAge(16);
        son.setSingerWorlds("我是儿子");
        return son;
    }
}
