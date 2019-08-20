package com.whc.chapter4.FactoryBeanStudy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * author : whc
 * createTime:2019/8/19  22:06
 *
 * 使用java 配置类的方式来进行 factorybean 的使用的操作
 */
@Configuration
public class ConfigBeanFactoryBean {

    @Bean("SHAdigestbean")
    public MessageDigestFactoryBean bean01(){
        MessageDigestFactoryBean messageDigestFactoryBean = new MessageDigestFactoryBean();
        messageDigestFactoryBean.setAlgorithName("SHA-1");
        return messageDigestFactoryBean;
    }
    @Bean("MD5digestbean")
    public MessageDigestFactoryBean bean02(){
        MessageDigestFactoryBean messageDigestFactoryBean = new MessageDigestFactoryBean();
        messageDigestFactoryBean.setAlgorithName("MD5");
        return messageDigestFactoryBean;
    }

    @Bean(value = "digestManager")
    public MessageDigestManager manager(){
        MessageDigestManager manager = new MessageDigestManager();
        try {
            manager.setMessageDigest1(bean01().getObject());
            manager.setMessageDigest2(bean02().getObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return manager;
    }


    /**
     * 下面是 没有实现接口的类作为FactoryBean
     * 就是常规的操作
     *
     * 好像没有和 factory-bean对应的 注解，
     * 仔细想想 好像也有道理，根本不需要啊
     * 获取到了这个bean，直接调用方法也就得到了想要的对象了
     * @return
     */
    @Bean("myfactorybean")
    public MessageDigestFactoryBean2 createBean2(){
        return new MessageDigestFactoryBean2();
    }
}
