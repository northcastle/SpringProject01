package com.whc.chapter3.ApplicationContext01.beanName.useAnnotation;

/**
 * author : whc
 * createTime:2019/8/13  21:06
 */
public class StudentInfo {
    private String studentNo;
    private String studentName;
    private int studentAge;

    public StudentInfo() {
    }

    public StudentInfo(String studentNo, String studentName, int studentAge) {
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
        return "StudentInfo{" +
                "studentNo='" + studentNo + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
