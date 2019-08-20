package com.whc.chapter4.FactoryBeanStudy;

import java.security.MessageDigest;

/**
 * author : whc
 * createTime:2019/8/20  21:25
 * 不实现接口的FactoryBean,
 * 在xml 配置文件中
 */
public class MessageDigestFactoryBean2 {

    private String alogrimName = "MD5";

    public String getAlogrimName() {
        return alogrimName;
    }

    public void setAlogrimName(String alogrimName) {
        this.alogrimName = alogrimName;
    }

    public MessageDigestFactoryBean2() {
    }

    public MessageDigestFactoryBean2(String alogrimName) {
        this.alogrimName = alogrimName;
    }

    /**
     * 此方法用来充当接口中 中的getObject() 方法
     * @return
     * @throws Exception
     */
    public MessageDigest createMessageDigest() throws  Exception{
        return MessageDigest.getInstance(alogrimName);
    }
}
