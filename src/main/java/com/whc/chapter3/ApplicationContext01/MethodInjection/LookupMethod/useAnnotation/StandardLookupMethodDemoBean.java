package com.whc.chapter3.ApplicationContext01.MethodInjection.LookupMethod.useAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/11  15:22
 * 使用标准的setter方法来进行 Singer 实例的注入
 */
@Component("standardlookupbean")
public class StandardLookupMethodDemoBean implements DemoBean {

    private Singer mySinger;

    @Autowired
    @Qualifier("singer")
    public void setMySinger(Singer mySinger) {
        this.mySinger = mySinger;
    }

    @Override
    public Singer getMySinger() {
        return this.mySinger;
    }

    @Override
    public void doSomething() {
        this.mySinger.sing();
    }
}
