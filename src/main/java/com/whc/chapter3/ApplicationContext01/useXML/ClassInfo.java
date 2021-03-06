package com.whc.chapter3.ApplicationContext01.useXML;

import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/5  22:42
 */
public class ClassInfo {
    private String classNo;
    private String className;
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

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassCulture() {
        return classCulture;
    }

    public void setClassCulture(String classCulture) {
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
