package com.whc.chapter4.LifeCycle.DestroyBean._03useJSR250_PreDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * author : whc
 * createTime:2019/8/17  20:45
 *
 * 销毁方法 ： 在scope = "ptototype" 的时候是不起作用的
 */
public class LifeCycleBean {
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
     * 注解表明 初始化方法
     * @throws Exception
     */
  @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println("This afterPropertiesSet Method.");
    }

    /**
     * 注解表明 销毁方法
     * @throws Exception
     */
   @PreDestroy
    public void destroy() throws Exception {
        System.out.println("This destroy Method.");
    }
}
