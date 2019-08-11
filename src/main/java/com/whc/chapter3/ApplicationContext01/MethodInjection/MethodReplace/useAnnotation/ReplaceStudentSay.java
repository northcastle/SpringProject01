package com.whc.chapter3.ApplicationContext01.MethodInjection.MethodReplace.useAnnotation;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * author : whc
 * createTime:2019/8/11  17:53
 * 实现 MethodReplacer接口，并重写reimplement方法，完成对目标方法的替换操作
 */
public class ReplaceStudentSay implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("这里是ReplaceStudentSay 的 替换方法");
        return null;
    }
}
