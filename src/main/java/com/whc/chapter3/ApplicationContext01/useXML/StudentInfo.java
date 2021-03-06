package com.whc.chapter3.ApplicationContext01.useXML;

import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/5  22:44
 */
public class StudentInfo {
    private String studentNo;
    private String studentName;
    private int studentAge;
    private int studentSex;
    private ClassInfo classInfo;

    public StudentInfo() {
    }

    public StudentInfo(String studentNo, String studentName, int studentAge, int studentSex, ClassInfo classInfo) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
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

    public int getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(int studentSex) {
        this.studentSex = studentSex;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    @Override
    public String toString() {
        return "StudentInfoSimple{" +
                "studentNo=" + studentNo +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentSex=" + studentSex +
                ", classInfo=" + classInfo +
                '}';
    }
}
