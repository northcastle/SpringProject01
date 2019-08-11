package com.whc.chapter3.ApplicationContext01.MethodInjection.LookupMethod.useXML;

/**
 * author : whc
 * createTime:2019/8/11  15:22
 * 使用标准的setter方法来进行 Singer 实例的注入
 */
public class StandardLookupMethodDemoBean implements DemoBean {

    private Singer mySinger;

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
