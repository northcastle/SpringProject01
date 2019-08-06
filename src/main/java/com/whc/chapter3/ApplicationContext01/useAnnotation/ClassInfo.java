package com.whc.chapter3.ApplicationContext01.useAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/5  22:42
 */
//@Component("classinfo")
public class ClassInfo {
   // @Value("0001") // 一旦写了这个操作，那么这个属性就是个常量了，无法再进行其他的操作了
    private String classNo;
    //@Value("SpringClass")
    private String className;
    //@Value("Spring is a perfect kuangjia of Java Develope!")
    private String classCulture;

    public ClassInfo() {
    }

    public ClassInfo(String classNo, String className, String classCulture) {
        this.classNo = classNo;
        this.className = className;
        this.classCulture = classCulture;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(@Value("0001")String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(@Value("SpringClass")String className) {
        this.className = className;
    }

    public String getClassCulture() {
        return classCulture;
    }

    public void setClassCulture(@Value("Spring is a perfect kuangjia of Java Develope!")String classCulture) {
        this.classCulture = classCulture;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "classNo=" + classNo +
                ", className='" + className + '\'' +
                ", classCulture='" + classCulture + '\'' +
                '}';
    }
}
