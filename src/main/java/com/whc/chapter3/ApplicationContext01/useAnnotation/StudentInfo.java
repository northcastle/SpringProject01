package com.whc.chapter3.ApplicationContext01.useAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * author : whc
 * createTime:2019/8/5  22:44
 */
@Component("studentinfo")
public class StudentInfo {
    private String studentNo;
    private String studentName;
    private int studentAge;
    private int studentSex;

    @Autowired
    private ClassInfo classInfo;

    public StudentInfo() {
    }
    //@Autowired
    public StudentInfo(@Value("201909020001") String studentNo, @Value("玉麒麟卢俊义") String studentName,@Value("35") int studentAge, @Value("1") int studentSex,ClassInfo classInfo) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentSex = studentSex;
        this.classInfo = classInfo;
    }

    public String getStudentNo() {
        return studentNo;
    }
    //@Autowired @Autowired + @Value 两个注解 直接可以把 属性给写死了，虽然可以注入值进来，但是不灵活了就
    public void setStudentNo(@Value("201909020001")String studentNo) {
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

    //@Autowired // 这个注释应该是可以把容器中的 class info 给放进来的
    //@Resource(name = "classinfo02") // 通过name属性，明确指定 bean的名称，在setter方法上面使用
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
