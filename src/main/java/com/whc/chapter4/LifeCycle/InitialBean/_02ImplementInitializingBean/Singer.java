package com.whc.chapter4.LifeCycle.InitialBean._02ImplementInitializingBean;

import org.springframework.beans.factory.InitializingBean;

/**
 * author : whc
 * createTime:2019/8/16  21:09
 * 采用实现接口的方式来操作初始化的问题
 */
public class Singer implements InitializingBean {

    private  String name;
    private int age = Integer.MIN_VALUE;

    public Singer() {
        System.out.println("This is contructor without args... name: "+name+" --> age : "+age);
    }

    public Singer(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is constructor with two args. name :"+name+" --> age : "+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("This is setName Method. name : "+name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("This is setAge Method. age : "+age);
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 此方法是一个初始化的方法，用来在所有的属性都设置完成后来运行的
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is afterPropertiesSet Method from Interface InitializingBean");
        System.out.println("*****************************************************************");
    }
}
