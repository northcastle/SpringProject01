package com.whc.chapter4.LifeCycle.DestroyBean._02ImplementDisposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * author : whc
 * createTime:2019/8/17  20:45
 *
 * 销毁方法 ： 在scope = "ptototype" 的时候是不起作用的
 */
public class LifeCycleBean implements DisposableBean, InitializingBean {
    private  String name;
    private int age;

    public LifeCycleBean() {
        System.out.println("This is construct method without args.");
    }

    public LifeCycleBean(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("this is construct method with two args ,name : "+name+" ; age : "+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("this setName Method ; name : "+name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("This is setAge Method; age : "+age);
    }

    @Override
    public String toString() {
        return "LifeCycleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 接口中的初始化方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This afterPropertiesSet Method.");
    }

    /**
     * 接口中的销毁方法
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("This destroy Method.");
    }
}
