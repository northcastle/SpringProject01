package com.whc.chapter3.ApplicationContext01.beanName.useAnnotation;

import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/13  21:33
 */
@Component("mystudeng02")
@Award(value={"mystudent03","mystudent04","mystudent05","mystudent05"})
public class StudentInfo02 {
    private String studentNo;
    private String studentName;
    private int studentAge;

    public StudentInfo02() {
    }

    public StudentInfo02(String studentNo, String studentName, int studentAge) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
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

    @Override
    public String toString() {
        return "StudentInfo02{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
