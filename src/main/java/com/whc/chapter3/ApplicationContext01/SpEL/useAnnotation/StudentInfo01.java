package com.whc.chapter3.ApplicationContext01.SpEL.useAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/7  20:08
 */
@Component("studentInfo01")
public class StudentInfo01 {
    @Value(value = "#{studentInfoSimple.studentNo}")
    private String studentNo;
    @Value(value = "#{studentInfoSimple.studentName}")
    private String studentName;
    @Value("#{studentInfoSimple.studentAge-25}")
    private int studentAge;
    @Autowired
    private ClassInfo classinfo;

    public StudentInfo01() {
    }

    public StudentInfo01(String studentNo, String studentName, int studentAge, ClassInfo classinfo) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.classinfo = classinfo;
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

    public ClassInfo getClassinfo() {
        return classinfo;
    }

    public void setClassinfo(ClassInfo classinfo) {
        this.classinfo = classinfo;
    }

    @Override
    public String toString() {
        return "StudentInfoSimple{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", classinfo=" + classinfo +
                '}';
    }
}
