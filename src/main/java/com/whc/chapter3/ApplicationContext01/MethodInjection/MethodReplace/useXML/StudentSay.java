package com.whc.chapter3.ApplicationContext01.MethodInjection.MethodReplace.useXML;

/**
 * author : whc
 * createTime:2019/8/11  17:46
 */
public class StudentSay {
    public void say(){
        System.out.println("这个学生在说话。。。");
    }
    public void say(String words){
        System.out.println("student say : "+words);
    }
}
