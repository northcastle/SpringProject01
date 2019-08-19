package com.whc.chapter4.FactoryBeanStudy;

import org.springframework.beans.factory.FactoryBean;

import java.security.MessageDigest;

/**
 * author : whc
 * createTime:2019/8/19  21:32
 *
 * 实现FactoryBean接口的方式来创建一个FactoryBean
 * 进而可以通过getObject() 方法来获取创建的对象
 *
 */
public class MessageDigestFactoryBean implements FactoryBean<MessageDigest> {

    //算法的名字
    private  String algorithName = "****";
    //要返回的算法对象
    private  MessageDigest messageDigest = null ;

    public String getAlgorithName() {
        return algorithName;
    }

    public void setAlgorithName(String algorithName) {
        System.out.println("This is setAlgorithName method.-->"+algorithName);
        this.algorithName = algorithName;
    }

    public MessageDigestFactoryBean() {
        System.out.println("This is construct method without args -->"+algorithName);
    }

    public MessageDigestFactoryBean(String algorithName, MessageDigest messageDigest) {
        this.algorithName = algorithName;
        this.messageDigest = messageDigest;
        System.out.println("This is construct method with two args.-->"+algorithName);
    }

    /**
     * 此方法是主要用来返回需要的对象的
     * 不管你用什么方法，不管你在声明周期的哪个位置上面，
     * 反正是在 getOjbect 中返回这个你需要的对象即可！
     * @return
     * @throws Exception
     */
    @Override
    public MessageDigest getObject() throws Exception {
        System.out.println("This is getObject method.-->"+algorithName);
        messageDigest = MessageDigest.getInstance(algorithName);
        return messageDigest;
    }

    /**
     * 此方法是用来返回 返回值的 类型的
     * @return
     */
    @Override
    public Class<MessageDigest> getObjectType() {
        System.out.println("This is getObjectType method.-->"+algorithName);
        return MessageDigest.class;
    }

    /**
     * 此方法 是用来确定，返回的 对象实例 是否是单例的
     *
     * 注意与 bean中的 区别，这个地方的是指，要返回的 MessageDigest的对象的是否是单例的
     * @return
     */
    @Override
    public boolean isSingleton() {
        System.out.println("This is isSingleton method.-->"+algorithName);
        return true;
    }
}
