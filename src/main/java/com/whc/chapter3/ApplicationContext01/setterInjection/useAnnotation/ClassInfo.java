package com.whc.chapter3.ApplicationContext01.setterInjection.useAnnotation;

/**
 * author : whc
 * createTime:2019/8/8  21:06
 */
public class ClassInfo {
    private String classNo;
    private String className;

    public ClassInfo() {
    }

    public ClassInfo(String classNo, String className) {
        this.classNo = classNo;
        this.className = className;
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

    @Override
    public String toString() {
        return "ClassInfo{" +
                "classNo='" + classNo + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
