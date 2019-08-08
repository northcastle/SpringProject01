package com.whc.chapter3.ApplicationContext01.setterInjection.useAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * author : whc
 * createTime:2019/8/8  21:07
 */
public class StudentInfo {
    private String studentNo;
    private String studentName;
    private int studentAge;
//    @Autowired
//    @Qualifier(value = "javaClass")
    @Resource(name = "springClass")
    private ClassInfo classInfo;


    public StudentInfo() {
    }

    public StudentInfo(String studentNo, String studentName, int studentAge, ClassInfo classInfo) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.classInfo = classInfo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }
//    @Autowired
//    @Qualifier("springClass") // 只写这个是不行的
    //@Resource(name = "javaClass")
    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", classInfo=" + classInfo +
                '}';
    }
}
