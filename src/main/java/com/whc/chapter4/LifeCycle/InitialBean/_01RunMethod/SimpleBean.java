package com.whc.chapter4.LifeCycle.InitialBean._01RunMethod;

import javax.xml.transform.Source;

public class SimpleBean {
    private String name;
    private int age = Integer.MIN_VALUE;

    public SimpleBean() {
        System.out.println("This is SimpleBean's contructor Method without args...");
    }

    public SimpleBean(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is SimpleBean's contructor Method with tow args...");
    }

    /**
     * 这个是bean构造方法执行完成之后执行的初始化方法
     */
    public void initMethod(){
        System.out.println("---- This is Initializing Method ----");
        if (this.name == null){
            System.out.println("use default name : "+"默认的名字");
            this.name = "默认的名字";
        }
        if (this.age == Integer.MIN_VALUE){ // 当age属性没有赋值的时候，直接抛出异常
            throw new IllegalArgumentException(
                    "You must set the age property of any beans of type" + this.getClass());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
