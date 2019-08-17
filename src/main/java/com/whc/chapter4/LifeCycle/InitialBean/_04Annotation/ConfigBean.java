package com.whc.chapter4.LifeCycle.InitialBean._04Annotation;

import org.springframework.context.annotation.*;

/**
 * author : whc
 * createTime:2019/8/16  23:09
 */

@Configuration
public class ConfigBean {

    @Lazy
    @Scope("prototype")
    @Bean(name = "beanC01",initMethod = "myinit")
    public Singer bean01(){
        return new Singer();
    }

    @Lazy
    @Bean(name = "beanC02",initMethod = "myinit")
    public Singer bean02(){
        return new Singer("wanghongchang",23);
    }

    @Lazy
    @Bean(name = "beanSetter",initMethod = "myinit")
    public Singer beanSetter(){
        Singer singer = new Singer();
        singer.setName("liujia");
        singer.setAge(23);
        return singer;
    }
}
