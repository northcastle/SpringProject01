package com.whc.chapter3.ApplicationContext01.MethodInjection.LookupMethod.useXML;

/**
 * author : whc
 * createTime:2019/8/11  15:27
 */
public abstract class AbstrackLookupMethodDemoBean implements DemoBean{


    public abstract Singer getMySinger();

    @Override
    public void doSomething() {
        this.getMySinger().sing();
    }
}
