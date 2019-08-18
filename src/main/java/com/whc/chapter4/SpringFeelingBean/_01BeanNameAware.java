package com.whc.chapter4.SpringFeelingBean;

import org.springframework.beans.factory.BeanNameAware;

/**
 * author : whc
 * createTime:2019/8/18  08:59
 */
public class _01BeanNameAware implements BeanNameAware {

    //如果是用来作为bean的名称的话，那就不用写get,set,方法了，spring会自动帮你写的
    private String myBeanName;

    private String name;
    private int age;

    public _01BeanNameAware() {
        System.out.println("This is construct method without args.");
    }

    public _01BeanNameAware(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is construct with two args name :"+name+" ;age :"+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("This is method setName; name : "+name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("This is method setAge; age : "+age);
    }


//    @Override
//    public String toString() {
//        return "_01BeanNameAware{" +
//                "myBeanName='" + myBeanName + '\'' +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /**
     * 初始化方法
     */
    public void myinit(){
        System.out.println("This is method myinit.");
    }

    /**
     * 销毁方法
     */
    public void mydestroy(){
        System.out.println("This is method mydestroy.");
    }


    /**
     * 这个是重写接口中的方法，给beanName赋值的操作，
     * 可以在从spring中获取实例之前就完成的操作，
     * 也就是说，不会影响在实例中使用这个属性
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        this.myBeanName = name;
    }

    /**
     * 测试打印这个名字
     */
    public void sayMyBeanName(){
        System.out.println("=====>  "+this.myBeanName);
    }
}
