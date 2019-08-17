package com.whc.chapter4.LifeCycle.DestroyBean._01RunMethod;

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
     * 1.自定义的初始化方法
     */
    public void myinit(){
        System.out.println("This is myinit Method.");
    }

    /**
     * 2.自定以得销毁方法
     */
    public void mydestroy(){
        System.out.println("This is myDestroy Method.");
    }
}
