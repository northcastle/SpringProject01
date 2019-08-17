package com.whc.chapter4.LifeCycle.DestroyBean._04Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * author : whc
 * createTime:2019/8/17  21:48
 */
@Configuration
public class ConfigBean {

    @Lazy
    @Bean(name = "destroybean01",initMethod = "afterPropertiesSet",destroyMethod = "destroy")
    public LifeCycleBean destroyBean01(){
        return new LifeCycleBean();
    }
    @Lazy
    @Bean(name = "destroybean02",initMethod = "afterPropertiesSet",destroyMethod = "destroy")
    public LifeCycleBean destroyBean02(){
        LifeCycleBean lifeCycleBean = new LifeCycleBean("王宏昌",23);
        return lifeCycleBean;

    }
    @Lazy
    @Bean(name = "destroybean03",initMethod = "afterPropertiesSet",destroyMethod = "destroy")
    public LifeCycleBean destroyBean03(){
        LifeCycleBean lifeCycleBean = new LifeCycleBean();
        lifeCycleBean.setName("刘佳");
        lifeCycleBean.setAge(23);
        return lifeCycleBean;

    }
}
