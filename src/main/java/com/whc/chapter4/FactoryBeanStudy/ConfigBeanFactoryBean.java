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

    @Bean("digestManager")
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
}
